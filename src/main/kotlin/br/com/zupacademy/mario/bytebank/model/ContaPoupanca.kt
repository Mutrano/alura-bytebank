package br.com.zupacademy.mario.bytebank.model

class ContaPoupanca(
    titular: Cliente,
    numeroConta: Int
) : ContaComTransferencia(
    titular,
    numeroConta
) {

}