package br.com.confiatec.digionebank

class Pessoa {
    var nome: String = "Ed"
    var cpf: String = "12345678900"
    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"
}

fun main() {
    val ed = Pessoa()
    println(ed.pessoaInfo())
    println(ed.cpf)

    println(ed.nome)
}
