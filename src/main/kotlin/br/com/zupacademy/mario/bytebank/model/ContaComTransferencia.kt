package br.com.zupacademy.mario.bytebank.model

//construtor padrao
abstract class ContaComTransferencia(
    titular: Cliente,
    numeroConta: Int,
) : Conta(
    titular,
    numeroConta,
) {
    //construtor secundário
//    constructor(titular : String, numeroConta:Int){
//        this.titular=titular
//        this.numeroConta=numeroConta
//    }
    fun transferePara(destino: ContaComTransferencia, valor: Double): Boolean {
        if (this.saldo >= valor) {
            this.saldo -= valor
            destino.saldo += valor
            return true
        }
        return false

    }

}