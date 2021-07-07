package br.com.zupacademy.mario.bytebank.teste

import br.com.zupacademy.mario.bytebank.model.Cliente
import br.com.zupacademy.mario.bytebank.model.ContaPoupanca

fun testaRun() {
    val taxaAnual = 0.05
    val taxaMensal = taxaAnual / 12.0
    val contaPoupanca = Cliente(nome = "José", documento = "072.780.351.-74", senha = 1234)
        .let { clienteNovo ->
            ContaPoupanca(titular = clienteNovo, 1000)
        }

    val simulacaoMensal = contaPoupanca.run {
        deposita(1000.0)
        saldo * taxaMensal
    }
    println(simulacaoMensal)

    val simulacaoAnual = run {
        var saldo = contaPoupanca.saldo
        repeat(12) {
            saldo += saldo * taxaMensal
        }
        saldo
    }.let(::println)
}