fun main() {

    //Задача 1
    println("Ответ к задаче 1:")
    val str1 = "Строка"
    str1.let {
        println(it)
        println("Длина строки: ${it.length}")
    }

    //Задача 2
    val city = City("Город")
    city.apply { population = 10_000 }
    println("Ответ к задаче 2: Город: ${city.name}, население: ${city.population}")

    //Задача 3
    val array = arrayOf(1, 2, 3, 4, 5)
    println("Ответ к задаче 3:")
    with(array) {
        println(this.contentToString())
        println("Размер массива: " + this.size)
        println("Сумма элементов массива: ${this.reduce { sum, n -> sum + n }}")
    }

}

class City(val name: String, var population: Int = 0)