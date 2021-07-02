import br.com.zupacademy.mario.bytebank.model.Cliente
import br.com.zupacademy.mario.bytebank.model.ContaCorrente
import br.com.zupacademy.mario.bytebank.model.ContaPoupanca
import br.com.zupacademy.mario.bytebank.model.ContaSalario

fun testaContasDiferentes() {
    val alex = Cliente(
        nome ="Alex",
        documento = "",
        senha = 123
        )
    val fran = Cliente(
        nome="Fran",
        documento = "",
        senha = 12345
    )
    val gui = Cliente(
        nome="Gui",
        documento = "",
        senha = 321
    )
    val contaCorrente = ContaCorrente(
        titular = alex,
        numeroConta = 12
    )
    val contaPoupanca = ContaPoupanca(
        titular = fran,
        numeroConta = 13
    )
    val contaSalario = ContaSalario(
        titular = gui,
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