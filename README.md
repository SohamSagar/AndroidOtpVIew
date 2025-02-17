<h1 align="center">Android OtpView/PinView(Work in progress...!)</h1>

<p align="center">
  <a href="https://www.codacy.com/app/mukeshsolanki/android-otpview-pinview?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=mukeshsolanki/android-otpview-pinview&amp;utm_campaign=Badge_Grade"><img src="https://api.codacy.com/project/badge/Grade/ea98277d42924a09b5ae9daa5d10e424"/></a>
  <a href="https://jitpack.io/#SohamSagar/AndroidOtpVIew"> <img src="https://jitpack.io/v/SohamSagar/AndroidOtpVIew.svg" /></a>
  <a href="https://opensource.org/licenses/MIT"><img src="https://img.shields.io/badge/License-MIT-blue.svg"/></a>
  <br />
    A custom control to enter a code usually in cases of authentication.
  <br />
</p>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="https://github.com/SohamSagar/AndroidOtpVIew/blob/master/screenshots/Screenshot_1.png" height="20%" width="20%"/> &nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="https://github.com/SohamSagar/AndroidOtpVIew/blob/master/screenshots/Screenshot_2.png" height="20%" width="20%"/> &nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="https://github.com/SohamSagar/AndroidOtpVIew/blob/master/screenshots/Screenshot_3.png" height="20%" width="20%"/> &nbsp;&nbsp;

## How to integrate into your app?
Integrating the project is simple. All you need to do is follow the below steps

Step 1. Add the JitPack repository to your build file. Add it in your root build.gradle at the end of repositories:
```java
allprojects {
  repositories {
    ...
    maven { url "https://jitpack.io" }
  }
}
```
Step 2. Add the dependency
```java
dependencies {
    implementation 'com.github.SohamSagar:AndroidOtpVIew:1.0.0'
}
```

## How to use the library?
Okay seems like you integrated the library in your project but **how do you use it**? Well its really easy.

- Using Older View System (aka XML)
Add the view in your xml file like
```xml
Add the view in your xml file like
<com.sohamsagar.otpview.OtpView
        android:id="@+id/ov"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:otpLength="5"
        app:otpTextColor="@color/black"
        app:otpBoxBackground="#03A9F4"
        app:otpBoxSize="50dp"
        app:otpBoxRadius="5dp"
        app:otpBoxElevation="20dp"
        app:otpBoxCardElevation="5dp" />
```

That's pretty much it and your all wrapped up.

## Author
Maintained by [Soham Sagar](https://github.com/sohamsagar)

* Bug reports and pull requests are welcome.

## License
```
MIT License

Copyright (c) 2025 Soham Sagar

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
