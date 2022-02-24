/**
 * Created by Arro on 2022/2/23
 */
object Dependencies {

    const val JUNIT = "junit:junit:${Versions.JUNIT}"

    object Gradle{

        const val ANDROID_BUILD_PLUGIN = "com.android.application"
        const val LIBRARY_BUILD_PLUGIN = "com.android.library"
        const val KOTLIN_BUILD_PLUGIN = "org.jetbrains.kotlin.android"
    }

    object Android{

        const val KTX = "androidx.core:core-ktx:${Versions.Android.KTX}"
        const val APPCOMPAT = "androidx.appcompat:appcompat:${Versions.Android.APPCOMPAT}"
        const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:${Versions.Android.CONSTRAINT_LAYOUT}"
    }

    object Test{

        const val EXT_JUNIT = "androidx.test.ext:junit:${Versions.Test.EXT_JUNIT}"
        const val ESPRESSO = "androidx.test.espresso:espresso-core:${Versions.Test.ESPRESSO}"
    }
    object Google{

        const val MATERIAL = "com.google.android.material:material:${Versions.Google.MATERIAL}"
    }
}