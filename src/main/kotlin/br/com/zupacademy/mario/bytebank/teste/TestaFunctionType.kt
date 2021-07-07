package br.com.zupacademy.mario.bytebank

fun testaFunctionType() {
    val subtrai = { x: Int, y: Int ->
        x - y
    }
    val soma = fun(x: Int, y: Int): Int {
        return x + y
    }
    println(soma(5, 7))
    println(subtrai(10, 5))
}