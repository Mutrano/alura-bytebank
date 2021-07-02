package br.com.zupacademy.mario.bytebank.model

abstract class FuncionarioAdmin(
    nome: String,
    documento: String,
    salario: Double,
    val senha: Int
) : Funcionario(
    nome = nome,
    documento = documento,
    salario = salario
), Autenticavel {

    override fun autentica(senha: Int): Boolean {
        return this.senha == senha
    }
}
