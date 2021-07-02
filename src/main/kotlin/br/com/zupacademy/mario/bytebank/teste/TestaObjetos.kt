package br.com.zupacademy.mario.bytebank.teste

import br.com.zupacademy.mario.bytebank.model.Conta
import testaComportamentoConta
import testaContasDiferentes

fun testaObjetos() {
    testaComportamentoConta()
    testaContasDiferentes()
    println(Conta.total)
}