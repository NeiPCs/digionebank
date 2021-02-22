//Entregue e válido
fun main(args: Array<String>) {
    //continue a solução
    fun Float.format(digits: Int) = "%.${digits}f".format(this).replace(',','.')
    val r = readLine()!!.toFloat()
    var i = 0F

    if (r in 0.00..2000.00) {
        i = 0F
    } else if (r in 2000.01 ..3000.00) {
        i = (r-2000f) * 0.08f
    } else if (r in 3000.01 ..4500.00) {
        i = 1000f * 0.08f + (r-3000f) * 0.18f
    } else if (r > 4500) {
        i = (1000f * 0.08f) + (1500f * 0.18f) + ((r-4500f) * 0.28f)
    }
    if (i == 0F) println("Isento") else println("R$ ${i.format(2)}")
}