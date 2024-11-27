//Resolución de sistemas lineales: Implementa una función que resuelva un sistoma de ecuaciones linealos usando el método de eliminación de
//Causo.

fun eliminarGauss(a: Array<DoubleArray>, b: DoubleArray): DoubleArray {
    val n = a.size
    val x = DoubleArray(n)

    // Aplicación de la eliminación de Gauss
    for (i in 0 until n) {
        // Buscar el máximo en la columna
        var max = i
        for (k in i + 1 until n) {
            if (Math.abs(a[k][i]) > Math.abs(a[max][i])) {
                max = k
            }
        }

        // Intercambiar filas
        val temp = a[i]
        a[i] = a[max]
        a[max] = temp

        val tempB = b[i]
        b[i] = b[max]
        b[max] = tempB

        // Hacer ceros debajo de la diagonal
        for (k in i + 1 until n) {
            val factor = a[k][i] / a[i][i]
            for (j in i until n) {
                a[k][j] -= a[i][j] * factor
            }
            b[k] -= b[i] * factor
        }
    }

    // Sustitución hacia atrás
    for (i in n - 1 downTo 0) {
        x[i] = b[i] / a[i][i]
        for (k in i - 1 downTo 0) {
            b[k] -= a[k][i] * x[i]
        }
    }

    return x
}

fun main() {
    val a = arrayOf(
        doubleArrayOf(3.0, 2.0, -1.0),
        doubleArrayOf(2.0, -1.0, 3.0),
        doubleArrayOf(1.0, 3.0, 2.0)
    )
    val b = doubleArrayOf(1.0, 8.0, -4.0)

    val soluciones = eliminarGauss(a, b)
    println("Soluciones del sistema: ${soluciones.joinToString(", ")}")
}