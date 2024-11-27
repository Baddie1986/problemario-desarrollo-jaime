//Gráfica de Fibonacci acumulativo: Genera una gráfica de barras dondo el ejo X representa los índices de la serie de Fibonacci y el eje Y la suma acurulada de los términos hasta eso índico.

import org.xchart.*
import org.xchart.style.Styler
import kotlin.math.pow

fun fibonacciAcumulado(n: Int): Pair<List<Int>, List<Int>> {
    val fibonacci = mutableListOf(0, 1)
    val acumulado = mutableListOf(0, 1)

    // Generamos la secuencia Fibonacci y la suma acumulada
    for (i in 2..n) {
        val nextFib = fibonacci[i - 1] + fibonacci[i - 2]
        fibonacci.add(nextFib)
        acumulado.add(acumulado.last() + nextFib)
    }

    return Pair(fibonacci, acumulado)
}

fun graficarFibonacciAcumulado(n: Int) {
    val (fibonacci, acumulado) = fibonacciAcumulado(n)

    val xData = (0..n).toList()  // Eje X con los índices
    val yData = acumulado       // Eje Y con las sumas acumuladas

    val chart = QuickChart.getChart(
        "Fibonacci Acumulativo",
        "Índice", "Suma Acumulada",
        "Fibonacci", xData, yData
    )

    // Personalizamos el gráfico
    chart.styler.isChartTitleVisible = true
    chart.styler.chartTitleFont = java.awt.Font("Arial", java.awt.Font.PLAIN, 16)
    chart.styler.defaultSeriesRenderStyle = Styler.ChartType.Bar

    // Mostrar el gráfico
    val frame = XChartPanel(chart)
    javax.swing.JFrame().apply {
        contentPane = frame
        pack()
        isVisible = true
    }
}

fun main() {
    graficarFibonacciAcumulado(20)  // Generar Fibonacci hasta el índice 20
}