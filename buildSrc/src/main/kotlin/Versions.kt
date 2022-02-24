/**
 * Created by Arro on 2022/2/23
 */
object Versions {

    const val JUNIT = "4.13.2"
    const val ANDROID_BUILD_PLUGIN = "7.1.1"
    const val LIBRARY_BUILD_PLUGIN = "7.1.1"
    const val KOTLIN_BUILD_PLUGIN = "1.5.30"

    object Build{

        const val COMPILE_SDK = 31
        const val TARGET_SDK = 31
        const val MIN_SDK = 26
        const val VERSION_CODE = 1
        const val VERSION_NAME = "1.0"
    }

    object Android{

        const val KTX = "1.7.0"
        const val APPCOMPAT = "1.4.1"
        const val CONSTRAINT_LAYOUT = "2.1.3"

    }

    object Google{

        const val MATERIAL = "1.5.0"
    }

    object Test {

        const val EXT_JUNIT = "1.1.3"
        const val ESPRESSO = "3.4.0"
    }
}