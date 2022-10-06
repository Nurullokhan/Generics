class GenericsGetSet<T>(private var value: T) {

    fun getValue(): T {
        return value
    }

    fun setValue(value: T) {
        this.value = value
    }

}