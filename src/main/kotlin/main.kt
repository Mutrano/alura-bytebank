fun main() {
    println("Bem vindo ao ByteBank")
    val contaAlex = Conta("Alex", 1)
    contaAlex.deposita(100.0)

    // instancia objeto com named argument
    val contaFran = Conta(numeroConta = 2, titular = "Fran")
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
//construtor padrao
class Conta(
    val titular: String,
    val numeroConta: Int
) {
    var saldo = 0.0
        private set
    //construtor secundário
//    constructor(titular : String, numeroConta:Int){
//        this.titular=titular
//        this.numeroConta=numeroConta
//    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }

    fun transferePara(destino: Conta, valor: Double): Boolean {
        if (this.saldo >= valor) {
            this.saldo -= valor
            destino.saldo += valor
            return true
        }
        return false

    }

}

fun testaSaldo(saldo: Double) {
    if (saldo > 0) println("saldo positivo")
    else if (saldo < 0) println("saldo negativo")
    else println("saldo zero")
}

fun mostraConta(conta: Conta) {
    println("Nome: ${conta.titular}")
    println("Número: ${conta.numeroConta}")
    println("Saldo: ${conta.saldo}")
    println()


}