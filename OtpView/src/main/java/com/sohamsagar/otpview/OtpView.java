package com.sohamsagar.otpview;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputType;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import java.util.ArrayList;
import java.util.Objects;

public class OtpView extends LinearLayout {

    private final ArrayList<EditText> editTextList = new ArrayList<>();

    public OtpView(Context context) {
        super(context);
        init(context, null);
    }

    public OtpView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public OtpView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        // Retrieve custom attributes
        TypedArray a = context.getTheme().obtainStyledAttributes(attrs, R.styleable.otpview, 0, 0);
        try {
            createOtpFields(context, a);
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            a.recycle();
        }
    }


    private void createOtpFields(Context context, TypedArray a) {
        int otpLength = a.getInt(R.styleable.otpview_otpLength, 8);
        int otpTextColor = a.getColor(R.styleable.otpview_otpTextColor, context.getResources().getColor(android.R.color.black,null));
        int otpBoxBackground = a.getColor(R.styleable.otpview_otpBoxBackground, context.getResources().getColor(android.R.color.white,null));
        int otpBoxRadius = (int) a.getDimension(R.styleable.otpview_otpBoxRadius, 0);
        int otpBoxElevation = (int) a.getDimension(R.styleable.otpview_otpBoxElevation, 0);
        int otpBoxCardElevation = (int) a.getDimension(R.styleable.otpview_otpBoxCardElevation, 0);
        float otpBoxSize = (int) a.getDimension(R.styleable.otpview_otpBoxSize, 80);

        int size;

        if(otpBoxSize>0) size = (int)otpBoxSize; else size = LayoutParams.WRAP_CONTENT;

        for (int i = 0; i < otpLength; i++) {

            CardView cardView = new CardView(context);
            MarginLayoutParams layoutParams = new MarginLayoutParams(size, size);
            layoutParams.setMargins(20,20, 20,20);
            cardView.setLayoutParams(layoutParams);
            cardView.setRadius(otpBoxRadius);
            cardView.setElevation(otpBoxElevation);
            cardView.setCardElevation(otpBoxCardElevation);
            int pd = size/100*20;
            cardView.setPadding(pd,pd,pd,pd);
            cardView.setCardBackgroundColor(otpBoxBackground);

            EditText edtOtp = getEditText(context, otpTextColor);

            cardView.addView(edtOtp);

            editTextList.add(edtOtp);

            addView(cardView);  // Add the EditText to the OTP View
        }

        setOtpEditTextListeners(editTextList);
    }

    @NonNull
    private static EditText getEditText(Context context, int otpTextColor) {
        EditText edtOtp = new EditText(context);
        edtOtp.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
        edtOtp.setInputType(InputType.TYPE_CLASS_NUMBER);
        edtOtp.setFilters(new InputFilter[]{new InputFilter.LengthFilter(1)});
        edtOtp.setMinEms(1);
        edtOtp.setBackground(null);
        edtOtp.setBackgroundColor(context.getResources().getColor(android.R.color.transparent,null));
        edtOtp.setTextColor(otpTextColor);
        edtOtp.setGravity(Gravity.CENTER);
        return edtOtp;
    }

    private void setOtpEditTextListeners(ArrayList<EditText> editTexts) {
        for (int i = 0; i < editTexts.size(); i++) {
            int finalI = i;
            editTexts.get(i).addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {
                    if (s != null && s.length() == 1) {
                        if (finalI < editTexts.size() - 1) {
                            editTexts.get(finalI + 1).requestFocus();
                        }
                    }
                    StringBuilder otpString = new StringBuilder();
                    for (EditText obj : editTexts) {
                        otpString.append(Objects.requireNonNull(obj.getText()));
                    }
                }

                @Override
                public void afterTextChanged(Editable s) {}
            });

            editTexts.get(i).setOnKeyListener((view, i1, keyEvent) -> {
                if (keyEvent.getAction() == KeyEvent.ACTION_DOWN && keyEvent.getKeyCode() == KeyEvent.KEYCODE_DEL) {
                    if (editTexts.get(finalI).getText().toString().isEmpty() && finalI > 0) {
                        editTexts.get(finalI - 1).requestFocus();
                    }
                }
                return false;
            });
        }
    }

    public String getOtp() {
        StringBuilder otpString = new StringBuilder();
        for (EditText editText : editTextList) {
            otpString.append(Objects.requireNonNull(editText.getText()));
        }
        return otpString.toString();
    }
}
