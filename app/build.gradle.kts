plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.deliveryappdemo"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.example.deliveryappdemo"
        minSdk = 23
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"
        //buildConfigField ("String", "MAPTILER_API_KEY", "\"${project.properties.getValue("MAPTILER_API_KEY")}\"")
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    implementation ("com.github.denzcoskun:ImageSlideshow:0.1.2")
    implementation ("org.maplibre.gl:android-sdk:10.0.2")
    implementation("com.github.bumptech.glide:glide:4.15.0")
    annotationProcessor("com.github.bumptech.glide:compiler:4.15.0")
    implementation("com.google.android.material:material:1.2.1")
}