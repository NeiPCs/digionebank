package br.com.confiatec.digionebank.testes

import br.com.confiatec.digionebank.ClienteTipo

fun main(){
    ClienteTipo.values().forEach {
        println("${it.name} - ${it.descricao}")
    }

    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} - ${elemento.toString()}")
    }
}
