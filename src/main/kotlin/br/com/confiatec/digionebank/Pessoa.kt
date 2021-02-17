package br.com.confiatec.digionebank

class Pessoa {
    var nome: String = "Ed"
    var cpf: String = "12345678900"
}

fun main() {
    val ed = Pessoa()
    println(ed.nome)
    println(ed.cpf)
}