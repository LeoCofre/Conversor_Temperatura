package cl.awakelab.conversortemperatura

    /*De grados Celsius a Fahrenheit: °F = 9/5 (°C) + 32
     Kelvin a Celsius: °C = K - 273.15
     De Fahrenheit a Kelvin: K = 5/9 (°F - 32) + 273.15
    */

fun main() {

    println("Ingresa el valor")
    val input= readLine()!!.toDouble()

    val celciusToFahrentheit = ((9.0/5.0) * input) + 32
    println("Fahrenheit: $celciusToFahrentheit")

    val kelvinToCelcius = input + 273.15
    println("Kelvin: $kelvinToCelcius")

    val fahrentheitTokelvin =  5.0/9.0 * (celciusToFahrentheit - 32) + 273.15
    println("Fahrenheit a kelvin $fahrentheitTokelvin")

}

fun isLetters(string: String): Boolean {
    return string.none { it !in 'A'..'Z' && it !in 'a'..'z' }
}