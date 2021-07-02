import br.com.zupacademy.mario.bytebank.model.ContaComTransferencia

fun mostraConta(conta: ContaComTransferencia) {
    println("Nome: ${conta.titular}")
    println("Número: ${conta.numeroConta}")
    println("Saldo: ${conta.saldo}")
    println()


}