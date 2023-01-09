//BAD
interface Animal1{
    fun eat()
    fun sleep()
    fun fly()
}

class Cat1: Animal1{
    override fun eat() {
        println("Cat is eating fish")
    }

    override fun sleep() {
        println("Cat is sleeping on its owner's bed")
    }

    override fun fly() {
        // Cats can't fly
    }
}

class Bird1: Animal1{
    override fun eat() {
        println("Bird is eating forage")
    }

    override fun sleep() {
        println("Bird is sleeping in the nest")
    }

    override fun fly() {
        println("Bird is flying so high")
    }
}
//BETTER
interface Animal2{
    fun eat()
    fun sleep()
}

interface FlyingAnimal{
    fun fly()
}

class Cat2: Animal2{
    override fun eat() {
        println("Cat is eating fish")
    }

    override fun sleep() {
        println("Cat is sleeping on its owner's bed")
    }
}

class Bird2: Animal2, FlyingAnimal{
    override fun eat() {
        println("Bird is eating forage")
    }

    override fun sleep() {
        println("Bird is sleeping in the nest")
    }

    override fun fly() {
        println("Bird is flying so high")
    }
}