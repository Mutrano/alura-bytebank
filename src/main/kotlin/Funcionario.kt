class Funcionario(
    val nome: String,
    val documento: String,
    val salario: Double
){
    fun bonificacao(): Double {
        return this.salario*0.1
    }
}