//Visualización de raíces: Represento gráficamente un polinomio P(x) y
//marca en la gráfica las raíces realos calculadas.

import org.xchart.*
import org.xchart.style.Styler
import kotlin.math.*

fun polinomio(x: Double): Double {
    return x.pow(3) - 6 * x.pow(2) + 11 * x - 6
}

fun encontrarRaices(): List<Double> {
    return listOf(1.0, 2.0, 3.0)  // Raíces del polinomio P(x)
}

fun graficarPolinomioConRaices() {
    val xData = (0..100).map { it / 10.0 }
    val yData = xData.map { polinomio(it) }

    val raices = encontrarRaices()

    val chart = QuickChart.getChart(
        "Polinomio P(x) y Raíces",
        "x", "P(x)",
        "Polinomio", xData, yData
    )

    // Marcar las raíces
    val raizY = raices.map { polinomio(it) }
    chart.addSeries("Raíces", raices, raizY)

    // Personalizar la gráfica
    chart.styler.chartTitleFont = java.awt.Font("Arial", java.awt.Font.PLAIN, 16)
    chart.styler.defaultSeriesRenderStyle = Styler.ChartType.Line

    // Mostrar el gráfico
    val frame = XChartPanel(chart)
    javax.swing.JFrame().apply {
        contentPane = frame
        pack()
        isVisible = true
    }
}