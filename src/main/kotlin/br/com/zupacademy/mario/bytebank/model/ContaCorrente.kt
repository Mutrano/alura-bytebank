package br.com.zupacademy.mario.bytebank.model

class ContaCorrente(
    titular: Cliente,
    numeroConta: Int
) : ContaComTransferencia(
    titular,
    numeroConta
) {
    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        if (this.saldo >= valorComTaxa) {
            this.saldo -= valorComTaxa
        }
    }
}