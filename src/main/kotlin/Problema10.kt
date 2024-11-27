//Optimización de funciones: Escribe un programa que encuentre el mínimo o máximo de una función cuadrática mediante el cálculo de su derivada.

fun optimizarCuadratica(a: Double, b: Double, c: Double): Double {
    // Derivada: f'(x) = 2ax + b
    // Encontramos el punto crítico (min o max): f'(x) = 0 => x = -b / (2a)
    return -b / (2 * a)
}

fun main() {
    val a = 1.0  // Coeficiente de x^2
    val b = -4.0 // Coeficiente de x
    val c = 3.0  // Constante
    val puntoOptimo = optimizarCuadratica(a, b, c)
    println("El punto óptimo (mínimo o máximo) de la función cuadrática es: x = $puntoOptimo")
}