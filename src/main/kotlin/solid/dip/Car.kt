package solid.dip

fun main() {

    //val car = Car(Engine())
    //car.start()

    //error
    //val dieselCar = Car(DieselEngine())

    val petrolEngine = PetrolEngine()
    val petrolCar = Car(petrolEngine)

    val dieselEngine = DieselEngine()
    val dieselCar = Car(dieselEngine)

    petrolCar.start()
    dieselCar.start()

}

//High Level
class Car(private val engine: EngineInterface) {

    fun start(){
        engine.start()
    }

}

//Low level
class Engine {
    fun start(){

    }
}


interface EngineInterface{
    fun start(){

    }
}


class PetrolEngine : EngineInterface {
    override fun start() {
        println("Mesin Petrol")
    }
}

class HybridEngine: EngineInterface {
    override fun start() {

    }
}

class DieselEngine : EngineInterface {
    override fun start() {
        println("Mesin Diesel")
    }
}
