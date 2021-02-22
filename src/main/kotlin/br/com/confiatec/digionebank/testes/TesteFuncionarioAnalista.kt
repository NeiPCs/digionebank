package br.com.confiatec.digionebank.testes

import br.com.confiatec.digionebank.Analista

fun main() {
    val ednei = Analista("Ednei Analista", "987654321", 5000.0)
    ImprimeRelatorioFuncionario.imprime(ednei)
}

