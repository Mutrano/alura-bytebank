package model

class Analista(
    nome: String,
    documento: String,
    salario: Double,
) : Funcionario(nome, documento, salario) {

    override val bonificacao: Double get() = salario * 0.2
    override fun toString(): String {
        return "model.Analista() ${super.toString()}"
    }


}