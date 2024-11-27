//Raíces de polinomios: Diseña un programa que encuentre todas las raíces
//reales de un polinomio de tercer grado.

import kotlin.math.pow
import kotlin.math.sqrt

fun raicesPolinomioCubo(a: Double, b: Double, c: Double, d: Double): List<Double> {
    val delta0 = b.pow(2) - 3.0 * a * c
    val delta1 = 2.0 * b.pow(3) - 9.0 * a * b * c + 27.0 * a.pow(2) * d
    val discriminante = delta1.pow(2) - 4.0 * delta0.pow(3)

    if (discriminante >= 0) {
        val C = ((delta1 + sqrt(discriminante)) / 2.0)
        val r1 = -1.0 / (3.0 * a) * (b + C + delta0 / C)
        return listOf(r1)
    } else {
        val r = -b / (3.0 * a)
        return listOf(r)  // Real roots only, but could have complex roots
    }
}

fun main() {
    val a = 1.0
    val b = -6.0
    val c = 11.0
    val d = -6.0

    val raices = raicesPolinomioCubo(a, b, c, d)
    println("Raíces del polinomio: ${raices.joinToString(", ")}")
}