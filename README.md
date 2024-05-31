# Note Android App Clone

## Android Gradle Plugin(AGP) 버전 호환
```groovy
plugins {
    id 'com.android.application' version '8.4.0' apply false
    id 'com.android.library' version '8.4.0' apply false
}
```
- AGP 버전 지정

```properties
distributionUrl=https\://services.gradle.org/distributions/gradle-8.6-bin.zip
```
- 시용하고자하는 AGP 버전을 지원하는 URL 변경 

### 참고
- [Gradle 업데이트](https://developer.android.com/build/releases/gradle-plugin?hl=ko#updating-gradle)


## KSP - Kotlin 버전 호환
```groovy
id 'org.jetbrains.kotlin.android' version '1.9.23' apply false
id 'com.google.devtools.ksp' version '1.9.23-1.0.19' apply false
```
- project/build.gradle
- ksp 버전 앞쪽과 현재 프로젝트 코틀린 버전과 일치해야함.(뒤쪽은 해당 패치인듯)

```groovy
plugins {
    ...
    id 'com.google.devtools.ksp'
}
```
- app/build.gradle

### 참고
- [Kotlin Symbol Processing](https://github.com/google/ksp/tags)


## Compose - Kotlin 버전 호환

```groovy
buildFeatures {
    compose true
}
composeOptions {
    kotlinCompilerExtensionVersion = "1.5.13"
}
kotlinOptions {
    jvmTarget = "19"
}
```

### 참고
- [Compose와 Kotlin의 호환성 지도](https://developer.android.com/jetpack/androidx/releases/compose-kotlin?hl=ko)

## 오류
### Unable to load class 'org.jetbrains.kotlin.gradle.plugin.mpp.pm20.KotlinCompilationData'.
