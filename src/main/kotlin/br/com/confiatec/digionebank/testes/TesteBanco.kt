package br.com.confiatec.digionebank.testes

import br.com.confiatec.digionebank.Banco

fun main() {
    val digiOneBank = Banco(nome = "DigiOne", numero = 12)
    println(digiOneBank.nome)
    println(digiOneBank.numero)
    val banco2 = digiOneBank.copy("DigiTwo")

    println(banco2.nome)
    println(banco2.numero)
    println(banco2.nomeComposto())
}
