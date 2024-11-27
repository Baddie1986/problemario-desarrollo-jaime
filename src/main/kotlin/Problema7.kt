// Sumas parciales de Fibonacci: Implementa un algoritmo para calcular la
//suma de los primeros N términos de la serie de Fibonacci

fun sumaParcialFibonacci(n: Int): Int {
    var a = 0
    var b = 1
    var suma = a + b

    for (i in 2 until n) {
        val temp = b
        b = a + b
        a = temp
        suma += b
    }

    return suma
}

fun main() {
    val n = 10  // Cambia el valor de N según la cantidad de términos
    println("La suma de los primeros $n términos de Fibonacci es: ${sumaParcialFibonacci(n)}")
}