fun testaFuncionario() {
    val alex = Analista(
        nome = "Alex",
        documento = "07378035175",
        salario = 5.0
    )
    println("Mostrando um funcionário")
    println(alex)
    println("Bonificacao do Alex é ${alex.bonificacao}")
    val jose = Gerente(
        nome = "José",
        documento = "073781338517",
        salario = 10.0,
        senha = 12345
    )
    println("Mostrando um gerente")
    println(jose.autentica(123))
    println(jose.autentica(12345))
    println(jose)
    println("Bonificacao do Jose é ${jose.bonificacao}")

    val teofilo = Diretor(
        nome = "José",
        documento = "073781338517",
        salario = 10.0,
        senha = 15,
        plr = 5.0
    )
    println("Mostrando um Diretor")
    println(teofilo.autentica(123))
    println(teofilo.autentica(15))
    println(teofilo)
    println("Bonificacao do Teofilo é ${teofilo.bonificacao}")

    val bruna = Analista(
        nome = "Bruna",
        documento = "156156156161456",
        salario = 7.0,
    )
    println("Mostrando um Analista")
    println(bruna)
    println("Bonificacao da Bruna é ${bruna.bonificacao}")

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(teofilo)
    calculadora.registra(jose)
    calculadora.registra(alex)
    calculadora.registra(bruna)
    println("Total de bonificações é ${calculadora.total}")
}