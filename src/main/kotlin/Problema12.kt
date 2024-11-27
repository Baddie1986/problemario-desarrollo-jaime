//Tangente a una curva: Dada una función y un punto, calcula la ecuación de la recta tangente en ese punto.   ahora estas porfavor

fun tangenteACurva(func: (Double) -> Double, derivada: (Double) -> Double, x0: Double): String {
    val m = derivada(x0)  // Pendiente de la tangente
    val b = func(x0) - m * x0  // Intersección con el eje y
    return "y = ${m}x + ${b}"
}

fun main() {
    val func: (Double) -> Double = { x -> x * x }  // Ejemplo: f(x) = x^2
    val derivada: (Double) -> Double = { x -> 2 * x }  // Derivada de f(x) = 2x
    val x0 = 1.0  // Punto en el cual queremos la tangente
    println("La ecuación de la tangente en x=$x0 es: ${tangenteACurva(func, derivada, x0)}")
}