// Factorial: Pedir por teclado N y calcular el Factorial de N
//(N!=1*2*3*...* N)

fun calcularFactorial(n: Int): Long {
    var factorial: Long = 1
    for (i in 1..n) {
        factorial *= i
    }
    return factorial
}

fun main() {
    print("Introduce un número para calcular su factorial: ")
    val n = readLine()!!.toInt()
    val resultado = calcularFactorial(n)
    println("El factorial de $n es: $resultado")
}