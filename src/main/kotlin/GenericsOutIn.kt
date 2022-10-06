class GenericsOutIn<out T>(value: T) {

    init {
        println("This is out function!")
    }

}

interface GenericsIn<in T> {

    fun show(value: T): Int
}