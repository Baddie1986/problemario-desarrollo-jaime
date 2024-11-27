//Factorización optimizada: Diseña una función para descomponer un
//número em sus factores primos de forma eficiente.

fun factorizarPrimos(n: Int): List<Int> {
    val factores = mutableListOf<Int>()
    var num = n

    // Factorizar por 2
    while (num % 2 == 0) {
        factores.add(2)
        num /= 2
    }

    // Probar con números impares hasta la raíz cuadrada de n
    var i = 3
    while (i * i <= num) {
        while (num % i == 0) {
            factores.add(i)
            num /= i
        }
        i += 2
    }

    // Si queda un número primo mayor que 2
    if (num > 2) {
        factores.add(num)
    }

    return factores
}

fun main() {
    val numero = 315
    val factores = factorizarPrimos(numero)
    println("Los factores primos de $numero son: ${factores.joinToString(", ")}")
}