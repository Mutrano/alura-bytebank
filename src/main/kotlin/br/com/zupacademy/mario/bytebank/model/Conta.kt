package br.com.zupacademy.mario.bytebank.model

abstract class Conta(
    val titular: Cliente,
    val numeroConta: Int,
){
    init {
        println("Criando conta")
        total++

    }
    var saldo: Double = 0.0
    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }
    companion object{
        var total:Int =0
            private set
    }
    open fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }
}
