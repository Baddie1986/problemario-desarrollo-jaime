//Fibonacci inverso: Implementa una función que calcule los primeros N
//números de la serie de Fibonacci en orden inverso.

fun fibonacciInverso(n: Int): List<Int> {
    val fib = mutableListOf(0, 1)

    for (i in 2 until n) {
        fib.add(fib[i - 1] + fib[i - 2])
    }

    return fib.take(n).reversed()
}

fun main() {
    val n = 10  // Cambia el valor de N como desees
    println(fibonacciInverso(n))
}