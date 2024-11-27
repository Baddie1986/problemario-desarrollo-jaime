//Aproximación de derivadas Implementa una función que calcule la
//derivada de una función en un punto usando diferencias finitas.

fun derivadaAprox(func: (Double) -> Double, punto: Double, h: Double = 1e-5): Double {
    return (func(punto + h) - func(punto)) / h
}

fun main() {
    val func: (Double) -> Double = { x -> x * x + 2 * x + 1 }  // Ejemplo: f(x) = x^2 + 2x + 1
    val punto = 3.0
    println("Derivada en x=$punto: ${derivadaAprox(func, punto)}")
}