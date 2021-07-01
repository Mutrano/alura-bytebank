package model

abstract class Conta(
    val titular: String,
    val numeroConta: Int,
) {
    var saldo: Double = 0.0
    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    open fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }
}
