class Gerente(
    nome: String,
    documento: String,
    salario: Double,
    senha:Int
): FuncionarioAdmin(
    nome,
    documento,
    salario,
    senha
) {

    override val bonificacao: Double get() = salario*0.1 + salario



    override fun toString(): String {
        return "Gerente(senha=$senha) ${super.toString()}"
    }


}