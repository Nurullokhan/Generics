fun main(args: Array<String>) {

    val genericsGetSet = GenericsGetSet<String>("Android")
    println(genericsGetSet.getValue())
    genericsGetSet.setValue("Kotlin")
    println(genericsGetSet.getValue())

}