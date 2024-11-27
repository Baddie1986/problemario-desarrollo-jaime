// Posición en Fibonacci: Escribe una función que determine si un número dado pertenece a la serie de Fibonacci. Si pertenece, devuelve su posición.

fun posicionEnFibonacci(num: Int): Int? {
    var a = 0
    var b = 1
    var pos = 1

    while (b < num) {
        val temp = b
        b = a + b
        a = temp
        pos++
    }

    return if (b == num) pos else null
}

fun main() {
    val num = 21  // Cambia el número según lo que quieras buscar
    val posicion = posicionEnFibonacci(num)
    if (posicion != null) {
        println("El número $num pertenece a la serie de Fibonacci en la posición $posicion.")
    } else {
        println("El número $num no pertenece a la serie de Fibonacci.")
    }
}