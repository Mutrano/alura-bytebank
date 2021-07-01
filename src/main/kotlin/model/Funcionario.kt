package model

abstract class Funcionario(
    val nome: String,
    val documento: String,
    val salario: Double
) {
    abstract val bonificacao: Double


    override fun toString(): String {
        return "model.Funcionario(nome='$nome', documento='$documento', salario=$salario)"
    }


}