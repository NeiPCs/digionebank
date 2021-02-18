package br.com.confiatec.digionebank

data class Banco(
    val nome: String,
    val numero: Int
)
{
    fun nomeComposto() = "[$numero] $nome"
}