// Fibonacci y primos: Encuentra el número más cercano a un índice N en la serie de Fibonacci que también sea primo.

fun esPrimo(n: Int): Boolean {
    if (n <= 1) return false
    for (i in 2..Math.sqrt(n.toDouble()).toInt()) {
        if (n % i == 0) return false
    }
    return true
}

fun fibonacciMasCercanoPrimo(n: Int): Int? {
    var a = 0
    var b = 1
    var i = 2

    while (i <= n) {
        val temp = b
        b = a + b
        a = temp
        i++
    }

    // Ahora buscamos el Fibonacci más cercano a N que sea primo
    while (!esPrimo(b)) {
        val temp = b
        b = a + b
        a = temp
    }

    return b
}

fun main() {
    val n = 10  // Cambia el valor de N según el índice de Fibonacci que te interese
    val fibonacciPrimo = fibonacciMasCercanoPrimo(n)
    println("El Fibonacci más cercano a la posición $n que es primo: $fibonacciPrimo")
}