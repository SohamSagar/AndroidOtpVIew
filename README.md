# Android OtpView / PinView

<p align="center">
  <a href="https://jitpack.io/#SohamSagar/AndroidOtpVIew"> 
    <img src="https://jitpack.io/v/SohamSagar/AndroidOtpVIew.svg" />
  </a>
  <a href="https://opensource.org/licenses/MIT">
    <img src="https://img.shields.io/badge/License-MIT-blue.svg"/>
  </a>
</p>

A customizable OTP (One-Time Password) input view for Android. Automatically handles focus, deletion, and OTP value retrieval.

---

## Screenshots

<p align="center">
  <img src="https://github.com/SohamSagar/AndroidOtpVIew/blob/master/screenshots/Screenshot_1.png" height="20%" width="20%"/> &nbsp;
  <img src="https://github.com/SohamSagar/AndroidOtpVIew/blob/master/screenshots/Screenshot_2.png" height="20%" width="20%"/> &nbsp;
  <img src="https://github.com/SohamSagar/AndroidOtpVIew/blob/master/screenshots/Screenshot_3.png" height="20%" width="20%"/>
</p>

---

## Features

- Custom OTP length  
- Customizable styling: text color, box background, radius, elevation, size  
- Auto focus navigation  
- Backspace support (moves focus backward)  
- Easy OTP retrieval via `getOtp()`  
- Works via XML or programmatically (Java/Kotlin)

---

## Installation

### Add JitPack Repository

Add this to your root `build.gradle`:

```gradle
allprojects {
    repositories {
        ...
        maven { url "https://jitpack.io" }
    }
}
```

### Add Dependency

Add this to your module build.gradle:

dependencies {
    implementation 'com.github.SohamSagar:AndroidOtpVIew:1.0.0'
}

### Usage
XML Usage
```
<com.sohamsagar.otpview.OtpView
    android:id="@+id/otpView"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    app:otpLength="6"
    app:otpTextColor="@color/black"
    app:otpBoxBackground="#03A9F4"
    app:otpBoxSize="50dp"
    app:otpBoxRadius="8dp"
    app:otpBoxElevation="4dp"
    app:otpBoxCardElevation="2dp" />
```

### Retrieve OTP:

```
String otp = ((OtpView)findViewById(R.id.otpView)).getOtp();

val otp = findViewById<OtpView>(R.id.otpView).getOtp()
```

### Programmatic Usage
```Java
OtpView otpView = new OtpView(this);
otpView.setOtpLength(6);
otpView.setOtpTextColor(Color.BLACK);
otpView.setOtpBoxBackground(Color.WHITE);
otpView.setOtpBoxRadius(8);
otpView.setOtpBoxSize(60);

LinearLayout parentLayout = findViewById(R.id.parentLayout);
parentLayout.addView(otpView);

String otp = otpView.getOtp();
```

```Kotlin
val otpView = OtpView(this).apply {
    otpLength = 6
    otpTextColor = Color.BLACK
    otpBoxBackground = Color.WHITE
    otpBoxRadius = 8
    otpBoxSize = 60
}

val parentLayout = findViewById<LinearLayout>(R.id.parentLayout)
parentLayout.addView(otpView)

val otp = otpView.getOtp()
```

Custom Attributes
Attribute	Type	Default	Description & Example
otpLength	int	8	Number of OTP digits. Example: app:otpLength="6"
otpTextColor	color	Black (#000000)	Text color inside OTP boxes. Example: app:otpTextColor="@color/black"
otpBoxBackground	color	White (#FFFFFF)	Background color of OTP boxes. Example: app:otpBoxBackground="#03A9F4"
otpBoxRadius	dimension	0dp	Corner radius of OTP boxes. Example: app:otpBoxRadius="5dp"
otpBoxElevation	dimension	0dp	Shadow elevation of OTP boxes. Example: app:otpBoxElevation="4dp"
otpBoxCardElevation	dimension	0dp	CardView elevation for OTP box container. Example: app:otpBoxCardElevation="2dp"
otpBoxSize	dimension	80dp	Width & height of OTP boxes. Example: app:otpBoxSize="50dp"
Public Methods
Method	Parameters	Return Type	Description	Example
getOtp()	None	String	Returns the OTP entered by the user as a string.	String otp = otpView.getOtp();
setOtpLength(int length)	int length	void	Sets the number of OTP digits programmatically.	otpView.setOtpLength(6);
setOtpTextColor(int color)	int color	void	Sets the text color programmatically.	otpView.setOtpTextColor(Color.RED);
setOtpBoxBackground(int color)	int color	void	Sets the box background color programmatically.	otpView.setOtpBoxBackground(Color.WHITE);
setOtpBoxRadius(int radius)	int radius	void	Sets the corner radius of boxes programmatically.	otpView.setOtpBoxRadius(8);
setOtpBoxSize(int size)	int size	void
