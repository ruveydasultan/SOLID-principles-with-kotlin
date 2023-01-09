//BAD
class AndroidDeveloper1{
    fun developMobileApp(){
        println("Developing Android Application by using Kotlin")
    }
}

class IosDeveloper1{
    fun developMobileApp(){
        println("Developing iOS Application by using Swift")
    }
}

fun main1(){
    val androidDeveloper = AndroidDeveloper1()
    val iosDeveloper = IosDeveloper1()

    androidDeveloper.developMobileApp()
    iosDeveloper.developMobileApp()
}
//BETTER

interface MobileDeveloper{
    fun developMobileApp()
}

class AndroidDeveloper2(var mobileService: MobileServices): MobileDeveloper{
    override fun developMobileApp(){
        println("Developing Android Application by using Kotlin. " +
                "Application will work with ${mobileService.serviceName}")
    }
    enum class MobileServices(var serviceName: String){
        HMS("Huawei Mobile Services"),
        GMS("Google Mobile Services"),
        BOTH("Huawei Mobile Services and Google Mobile Services")
    }
}

class IosDeveloper2: MobileDeveloper{
    override fun developMobileApp(){
        println("Developing iOS Application by using Swift")
    }
}

fun main2(){
    val developers = arrayListOf(AndroidDeveloper2(AndroidDeveloper2.MobileServices.HMS), IosDeveloper2())
    developers.forEach { developer ->
        developer.developMobileApp()
    }
}