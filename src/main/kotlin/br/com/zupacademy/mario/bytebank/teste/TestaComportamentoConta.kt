import br.com.zupacademy.mario.bytebank.model.Cliente
import br.com.zupacademy.mario.bytebank.model.ContaPoupanca
import br.com.zupacademy.mario.bytebank.model.Endereco

fun testaComportamentoConta() {
    val alex = Cliente(
        nome ="Alex",
        documento ="",
        senha=123,
    )
    val fran = Cliente(
        nome ="Fran",
        documento ="",
        senha =321
    )
    fran.endereco= Endereco(
        logradouro ="C 05 Bloco J",
        numero=105,
        bairro ="Itapuã",
        cidade="Brasólia",
        estado="DF",
        cep="72021034",
        complemento ="ali mesmo"
    )
    val contaAlex = ContaPoupanca(alex, 1)
    contaAlex.deposita(100.0)

    // instancia objeto com named argument
    val contaFran = ContaPoupanca(numeroConta = 2, titular = fran)
    contaFran.deposita(200.0)

    mostraConta(contaAlex)
    mostraConta(contaFran)
    println(contaFran.titular.endereco.logradouro)

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