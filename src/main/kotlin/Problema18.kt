//Números amigables: Escribo un programa para determinar si dos
//números dados son amigables (la suma de los divisores de uno es igual al
//otro v viceversa).

fun sumaDivisores(n: Int): Int {
    var suma = 1  // Empezamos con 1 porque 1 es divisor de cualquier número
    for (i in 2..n / 2) {
        if (n % i == 0) {
            suma += i
        }
    }
    return suma
}

fun sonAmigables(a: Int, b: Int): Boolean {
    return sumaDivisores(a) == b && sumaDivisores(b) == a
}

fun main() {
    val num1 = 220
    val num2 = 284

    if (sonAmigables(num1, num2)) {
        println("$num1 y $num2 son números amigables.")
    } else {
        println("$num1 y $num2 no son números amigables.")
    }
}