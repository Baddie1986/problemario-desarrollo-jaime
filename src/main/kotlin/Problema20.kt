//Número de caminos Calcula el número de caminos posibles en una cuadricula NxN, movióndose solo hacia la derecha o hacia abajo.

fun numeroDeCaminos(n: Int): Long {
    val dp = Array(n + 1) { LongArray(n + 1) }

    // La primera fila y la primera columna son 1, ya que solo hay una forma de llegar a cada celda (moviendo solo hacia la derecha o solo hacia abajo)
    for (i in 0..n) {
        dp[i][0] = 1
        dp[0][i] = 1
    }

    // Llenar el resto de la tabla usando la relación recursiva
    for (i in 1..n) {
        for (j in 1..n) {
            dp[i][j] = dp[i - 1][j] + dp[i][j - 1]
        }
    }

    // El número de caminos es el valor en la esquina inferior derecha
    return dp[n][n]
}

fun main() {
    val n = 5  // Tamaño de la cuadrícula
    val caminos = numeroDeCaminos(n)
    println("El número de caminos en una cuadrícula de $n x $n es: $caminos")
}