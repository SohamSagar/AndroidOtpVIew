<h1 align="center">Android OtpView/PinView</h1>
<p align="center">
  <br /><br />
    A custom control to enter a code usually in cases of authentication.
</p>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="https://github.com/SohamSagar/AndroidOtpVIew/blob/master/screenshots/Screenshot_1.png" height="20%" width="20%"/> &nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="https://github.com/SohamSagar/AndroidOtpVIew/blob/master/screenshots/Screenshot_2.png" height="20%" width="20%"/> &nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="https://github.com/SohamSagar/AndroidOtpVIew/blob/master/screenshots/Screenshot_3.png" height="20%" width="20%"/> &nbsp;&nbsp;

## How to integrate into your app?
Integrating the project is simple. All you need to do is follow the below steps

Step 1. Add the JitPack repository to your build file. Add it in your root build.gradle at the end of repositories:

allprojects {
  repositories {
    ...
    maven { url "https://jitpack.io" }
  }
}
```
Step 2. Add the dependency

dependencies {
        implementation 'com.github.SohamSagar:AndroidOtpVIew:OtpView:1.0.0'
}
```

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
