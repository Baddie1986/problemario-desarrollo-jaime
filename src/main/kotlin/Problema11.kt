// Cálculo numérico de integrales: Diseña una función para calcular la
//integral definida de una función en un intervalo utilizando el método del trapecio.

fun integralTrapecio(func: (Double) -> Double, a: Double, b: Double, n: Int): Double {
    val h = (b - a) / n
    var suma = (func(a) + func(b)) / 2.0
    for (i in 1 until n) {
        suma += func(a + i * h)
    }
    return suma * h
}

fun main() {
    val func: (Double) -> Double = { x -> x * x }  // Ejemplo: f(x) = x^2
    val a = 0.0
    val b = 2.0
    val n = 1000  // Número de intervalos
    val resultado = integralTrapecio(func, a, b, n)
    println("La integral de x^2 entre 0 y 2 es: $resultado")
}