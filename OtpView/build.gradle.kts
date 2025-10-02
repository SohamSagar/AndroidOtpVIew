plugins {
    alias(libs.plugins.android.library)
    id ("maven-publish")
}

android {
    namespace = "com.sohamsagar.otpview"
    compileSdk = 34

    defaultConfig {
        minSdk = 23

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}
publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            artifact("${layout.buildDirectory}/outputs/aar/${artifactId}-release.aar")
            groupId = "com.sohamsagar"
            artifactId = "AndroidOtpVIew"
            version = "1.0.0"
        }
    }
    repositories {
        maven {
            url = uri("https://jitpack.io")
        }
    }
}
