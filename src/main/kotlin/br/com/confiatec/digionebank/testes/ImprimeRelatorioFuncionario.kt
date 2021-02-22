package br.com.confiatec.digionebank.testes

import br.com.confiatec.digionebank.Funcionario

class ImprimeRelatorioFuncionario {
    companion object {
        fun imprime(funcionario: Funcionario){
            println(funcionario.toString())
        }
    }
}