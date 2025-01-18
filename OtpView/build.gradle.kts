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
            // Use the correct component name for the Android library (e.g., "release" or "aar")
            artifact("$buildDir/outputs/aar/${artifactId}-release.aar")
            // Specify Group, Artifact, and Version
            groupId = "com.sohamsagar"  // Replace with your GitHub username
            artifactId = "otpview"  // Replace with your repository name
            version = "1.0.0"  // Match the tag you push to GitHub
        }
    }
    repositories {
        maven {
            url = uri("https://jitpack.io")
        }
    }
}
