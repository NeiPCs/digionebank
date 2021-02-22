import kotlin.math.min
import kotlin.math.sqrt

//Em testes
fun main(args: Array<String>) {
    //continue a solução
    val maxTestes = 200

    val testes = min(readLine()!!.toInt(), maxTestes)
    for (i in 1..testes) {
        val n = readLine()!!.toDouble()
        if (isPrime(n)) println("Prime")
        else println("Not Prime")
    }
}
fun isPrime(n:Double):Boolean {
    if(n % 2 == 0.00 && n > 2) { return false }
    var inicio = 2
    val limiteRapido = sqrt(n)
    while (inicio <= limiteRapido) {
        if (n % inicio++ < 1) return false
    }
    return n > 1
}