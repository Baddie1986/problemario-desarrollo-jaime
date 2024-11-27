//Determinante de una matriz Creo una función que calculo el determinanto de matrices de hasta 4x4.

fun determinante(matriz: Array<DoubleArray>): Double {
    val n = matriz.size

    if (n == 1) return matriz[0][0]
    if (n == 2) return matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0]

    var det = 0.0
    for (i in 0 until n) {
        val submatriz = Array(n - 1) { DoubleArray(n - 1) }
        for (j in 1 until n) {
            var k = 0
            for (l in 0 until n) {
                if (l != i) {
                    submatriz[j - 1][k] = matriz[j][l]
                    k++
                }
            }
        }
        val signo = if (i % 2 == 0) 1 else -1
        det += signo * matriz[0][i] * determinante(submatriz)
    }

    return det
}

fun main() {
    val matriz = arrayOf(
        doubleArrayOf(1.0, 2.0, 3.0, 4.0),
        doubleArrayOf(5.0, 6.0, 7.0, 8.0),
        doubleArrayOf(9.0, 10.0, 11.0, 12.0),
        doubleArrayOf(13.0, 14.0, 15.0, 16.0)
    )

    val det = determinante(matriz)
    println("Determinante de la matriz: $det")
}