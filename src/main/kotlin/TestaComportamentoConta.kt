fun testaComportamentoConta() {
    val contaAlex = ContaPoupanca("Alex", 1)
    contaAlex.deposita(100.0)

    // instancia objeto com named argument
    val contaFran = ContaPoupanca(numeroConta = 2, titular = "Fran")
    contaFran.deposita(200.0)

    mostraConta(contaAlex)
    mostraConta(contaFran)

    println("Depositando na conta do Alex")
    contaAlex.deposita(1000.0)
    println(contaAlex.saldo)

    println("Depositando na conta da Fran")
    contaFran.deposita(2000.0)
    println(contaFran.saldo)

    println("Sacando na conta do Alex")
    contaAlex.saca(1100.0)
    println(contaAlex.saldo)

    println("Sacando na conta da Fran")
    contaFran.saca(100.0)
    println(contaFran.saldo)

    println("saque em excesso do Alex")
    contaAlex.saca(100.0)
    println(contaAlex.saldo)

    println("Transferencia da Fran para o Alex")
    if (contaFran.transferePara(contaAlex, 100.0)) {
        println("Transferencia com sucesso")
    } else {
        println("Falha na transferência ")
    }
    println(contaAlex.saldo)
    println(contaFran.saldo)
}