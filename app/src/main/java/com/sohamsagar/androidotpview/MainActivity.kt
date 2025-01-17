package com.sohamsagar.androidotpview

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.sohamsagar.otpview.OtpView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val otpView = findViewById<OtpView>(R.id.ov)
        val btnGetOtp = findViewById<Button>(R.id.btnGetOtp)

        btnGetOtp.setOnClickListener {
            Toast.makeText(this, if(otpView.otp.isNullOrEmpty()) "Please Enter Otp!" else otpView.otp, Toast.LENGTH_SHORT).show()
        }
    }
}