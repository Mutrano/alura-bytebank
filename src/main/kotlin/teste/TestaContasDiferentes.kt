import model.ContaCorrente
import model.ContaPoupanca
import model.ContaSalario

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = "Alex",
        numeroConta = 12
    )
    val contaPoupanca = ContaPoupanca(
        titular = "Fran",
        numeroConta = 13
    )
    val contaSalario = ContaSalario(
        titular = "Gui",
        numeroConta = 15
    )
    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)
    contaSalario.deposita(2500.0)
    println("Saldo corrente: ${contaCorrente.saldo}")
    println("Saldo Poupança: ${contaPoupanca.saldo}")
    println("Saldo Salario: ${contaSalario.saldo}")
    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)
    contaSalario.saca(100.0)
    println("Saldo saque corrente: ${contaCorrente.saldo}")
    println("Saldo saque Poupança: ${contaPoupanca.saldo}")
    println("Saldo saque Salario: ${contaSalario.saldo}")

    contaCorrente.transferePara(contaPoupanca, 100.0)
    println("Saldo corrente apos transferir para poupança : ${contaCorrente.saldo}")
    println("Saldo Poupança após receber transferência: ${contaPoupanca.saldo}")

    contaPoupanca.transferePara(contaCorrente, 100.0)
    println("Saldo poupança apos transferir para corrente : ${contaPoupanca.saldo}")
    println("Saldo Corrente após receber transferência: ${contaCorrente.saldo}")



}