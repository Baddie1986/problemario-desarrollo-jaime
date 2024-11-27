//Fibonacci generalizado: Crea una función que reciba dos números iniciales y calcule una serie similar a Fibonacci, pero con estos números

fun fibonacciGeneralizado(a: Int, b: Int, n: Int): List<Int> {
    val fib = mutableListOf(a, b)

    for (i in 2 until n) {
        fib.add(fib[i - 1] + fib[i - 2])
    }

    return fib
}

fun main() {
    val a = 3  // Primer número inicial
    val b = 5  // Segundo número inicial
    val n = 10 // Número de términos a calcular
    println(fibonacciGeneralizado(a, b, n))
}