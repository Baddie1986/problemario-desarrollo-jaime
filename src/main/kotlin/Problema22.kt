//Pendiente y tangente: Orafica una función f() =48-42? + 6x corno y. en el mismo gráfico, muestra la recta tangente en un punto dado.


import org.xchart.*
import org.xchart.style.Styler
import kotlin.math.*

fun f(x: Double): Double {
    return 48 - 42 * x + 6 * x.pow(2)
}

fun derivadaF(x: Double): Double {
    return -42 + 12 * x  // Derivada de f(x)
}

fun graficarFuncionYTangente(puntoTangente: Double) {
    val xData = (0..100).map { it / 10.0 }  // Valores de x
    val yData = xData.map { f(it) }  // Valores de f(x)

    // Tangente en el punto dado
    val yTangente = xData.map { f(puntoTangente) + derivadaF(puntoTangente) * (it - puntoTangente) }

    val chart = QuickChart.getChart(
        "Función y Tangente en x = $puntoTangente",
        "x", "f(x)",
        "Función", xData, yData
    )

    chart.addSeries("Tangente", xData, yTangente)

    // Personalizamos el gráfico
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

fun main() {
    graficarFuncionYTangente(2.0)  // Graficar la tangente en x = 2.0
}