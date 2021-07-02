package br.com.zupacademy.mario.bytebank.model

class Diretor(
    nome: String,
    documento: String,
    salario: Double,
    senha: Int,
    val plr: Double
) : FuncionarioAdmin(
    nome,
    documento,
    salario,
    senha
) {
    override val bonificacao: Double get() = salario * 0.1 + salario + plr


    override fun toString(): String {
        return "br.com.zupacademy.mario.bytebank.model.Diretor(senha=$senha, plr=$plr) ${super.toString()}"
    }

}