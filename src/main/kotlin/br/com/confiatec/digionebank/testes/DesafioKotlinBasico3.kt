package br.com.confiatec.digionebank.testes

fun main(args: Array<String>) {
    //insira as variaveis corretamente
    var r = 0
    for (i in 0..readLine()!!.toInt()) {
        if (i in 1..1000)
            println("$i ${ i * i  } ${ i * i * i }")

        r += 0
    }
}