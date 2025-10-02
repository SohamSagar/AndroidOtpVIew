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
