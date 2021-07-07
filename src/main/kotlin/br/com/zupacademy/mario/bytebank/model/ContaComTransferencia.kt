package br.com.zupacademy.mario.bytebank.model

import br.com.zupacademy.mario.bytebank.exception.FalhaAutenticacaoException
import br.com.zupacademy.mario.bytebank.exception.SaldoInsuficienteException

//construtor padrao
abstract class ContaComTransferencia(
    titular: Cliente,
    numeroConta: Int,
) : Conta(
    titular,
    numeroConta,
),Autenticavel {
    override fun autentica(senha: Int): Boolean {
        return titular.autentica(senha)
    }

    fun transferePara(destino: ContaComTransferencia, valor: Double,senha:Int) {
        if (this.saldo < valor) {
            throw SaldoInsuficienteException()
        }
        if(!autentica(senha)){
            throw FalhaAutenticacaoException()
        }
        this.saldo -= valor
        destino.saldo += valor

    }

}