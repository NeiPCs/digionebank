package br.com.confiatec.digionebank.testes

import br.com.confiatec.digionebank.Cliente
import br.com.confiatec.digionebank.ClienteTipo

fun main() {
    val jose = Cliente("Jose da Silva", "13467913", ClienteTipo.PF, "123456")
    println(jose)

    TesteAutenticacao().autentica(jose)
}
