fun main() {
    println("Bem vindo ao ByteBank")
    val alex = Funcionario(
        nome = "Alex",
        documento = "07378035175",
        salario = 5.0
    )
    println("nome ${alex.nome}")
    println("documento ${alex.documento}")
    println("salario ${alex.salario}")
    println("bonificação ${alex.bonificacao()}")

}

