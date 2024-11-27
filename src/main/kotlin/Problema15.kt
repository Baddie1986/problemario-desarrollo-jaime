//Multiplicación de matrices grandes: Implementa un algoritmo para
//multiolicar dos matricos disporsas cricientomento.

data class Elemento(val fila: Int, val columna: Int, val valor: Double)

fun multiplicarMatricesDispersas(matrizA: List<Elemento>, matrizB: List<Elemento>, filasA: Int, columnasA: Int, columnasB: Int): List<Elemento> {
    val resultado = mutableListOf<Elemento>()

    // Crear una representación de las matrices como mapas de coordenadas
    val mapA = matrizA.groupBy { it.fila }
    val mapB = matrizB.groupBy { it.columna }

    for (i in 0 until filasA) {
        for (j in 0 until columnasB) {
            var suma = 0.0
            if (mapA.containsKey(i) && mapB.containsKey(j)) {
                for (elementA in mapA[i]!!) {
                    for (elementB in mapB[j]!!) {
                        if (elementA.columna == elementB.fila) {
                            suma += elementA.valor * elementB.valor
                        }
                    }
                }
            }
            if (suma != 0.0) resultado.add(Elemento(i, j, suma))
        }
    }

    return resultado
}

fun main() {
    val matrizA = listOf(
        Elemento(0, 0, 1.0), Elemento(0, 2, 2.0),
        Elemento(1, 1, 3.0), Elemento(2, 0, 4.0)
    )

    val matrizB = listOf(
        Elemento(0, 1, 5.0), Elemento(1, 0, 6.0),
        Elemento(1, 2, 7.0), Elemento(2, 2, 8.0)
    )

    val resultado = multiplicarMatricesDispersas(matrizA, matrizB, 3, 3, 3)
    println("Resultado de la multiplicación:")
    resultado.forEach { println("(${it.fila}, ${it.columna}) -> ${it.valor}") }
}
