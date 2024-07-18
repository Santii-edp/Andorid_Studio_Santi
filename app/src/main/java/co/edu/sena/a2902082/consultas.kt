package co.edu.sena.a2902082

fun main() {
    // Declaración de variables
    var nombre: String = "Juan"
    var edad: Int = 30
    var altura: Double = 1.75

    // Declaración de constantes (usando 'val' en lugar de 'var')
    val pi: Double = 3.14159
    val gravedad: Double = 9.81

    // Objeto usando una clase básica
    val persona = Persona(nombre, edad)

    // Imprimir información
    println("Nombre: ${persona.nombre}")
    println("Edad: ${persona.edad}")
    println("Altura: $altura metros")

    println("El valor de pi es $pi")
    println("La gravedad es $gravedad m/s^2")
}

// Definición de una clase simple
class Persona(val nombre: String, val edad: Int)
