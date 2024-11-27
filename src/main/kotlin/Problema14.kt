//Autovalores y autovectores: Escribo un programa para calcular los autovalores de una matriz 2x2.
//74. Multiplicación de matrices grandes: Implementa un algoritmo para
//multiolicar dos matricos disporsas cricientomento.

import kotlin.math.sqrt

fun calcularAutovalores(matriz: Array<DoubleArray>): Pair<Double, Double> {
    val a = matriz[0][0]
    val b = matriz[0][1]
    val c = matriz[1][0]
    val d = matriz[1][1]

    val traza = a + d
    val determinante = a * d - b * c

    val discriminante = traza * traza - 4 * determinante
    val raizDiscriminante = sqrt(discriminante)

    val autovalor1 = (traza + raizDiscriminante) / 2
    val autovalor2 = (traza - raizDiscriminante) / 2

    return Pair(autovalor1, autovalor2)
}

fun main() {
    val matriz = arrayOf(
        doubleArrayOf(4.0, 1.0),
        doubleArrayOf(2.0, 3.0)
    )

    val (autovalor1, autovalor2) = calcularAutovalores(matriz)
    println("Autovalores: $autovalor1, $autovalor2")
}