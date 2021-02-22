package br.com.confiatec.digionebank.testes

import br.com.confiatec.digionebank.Gerente

fun main() {
    val ednei = Gerente("Ednei Gerente", "987654321", 10000.0, senha = "senha123")
    ImprimeRelatorioFuncionario.imprime(ednei)

    TesteAutenticacao().autentica(ednei)
}

