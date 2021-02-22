import java.math.BigDecimal
import java.math.RoundingMode

//Entregue e válido
fun main(args: Array<String>) {

    val raio = readLine()!!.toDouble()
    val pi = 3.14159
    val area = (raio * raio) * pi
    val resultado = BigDecimal(  area  ).setScale(4, RoundingMode.HALF_EVEN)
    println("A=${resultado}")

}