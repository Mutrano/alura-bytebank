package br.com.zupacademy.mario.bytebank

fun testaRetornoDuploLambda() {
    val calculaBonificacao = lambda@{ salario: Double ->
        if (salario > 1000.0) {
            return@lambda salario + 50.0
        }
        salario + 100.0
    }
    val calculadoraBonificacaoAnonima = fun(salario: Double): Double {
        if (salario > 1000.0) {
            return salario + 50.0
        }
        return salario + 100.0
    }
    println(calculaBonificacao(1000.0))
    println(calculadoraBonificacaoAnonima(1000.0))
}