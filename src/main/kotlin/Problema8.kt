// Derivadas simbólicas: Diseña una función que acepte una expresión algebraica (por ejemplo, 3x12 + 2x) y calcule su derivada simbólica.

fun derivadaSimbolica(expresion: String): String {
    // Caso básico para detectar expresiones de tipo ax^n
    val regex = "(\\d+)x\\^(\\d+)".toRegex()  // Detecta expresiones como 3x^2, 5x^3, etc.
    val match = regex.find(expresion)

    return if (match != null) {
        val coeficiente = match.groupValues[1].toInt()
        val exponente = match.groupValues[2].toInt()
        val nuevoCoeficiente = coeficiente * exponente
        val nuevoExponente = exponente - 1

        if (nuevoExponente == 0) {
            "$nuevoCoeficiente"
        } else {
            "${nuevoCoeficiente}x^$nuevoExponente"
        }
    } else {
        // Si no se detecta una expresión ax^n, se devuelve un mensaje o se calcula otro tipo de derivada
        // Aquí solo podemos manejar el caso lineal simple
        if (expresion.contains("x")) {
            "1"  // Derivada de x (1x)
        } else {
            "0"  // Derivada de un término constante
        }
    }
}
