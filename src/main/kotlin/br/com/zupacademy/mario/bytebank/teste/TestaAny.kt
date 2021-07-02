package br.com.zupacademy.mario.bytebank.teste

import br.com.zupacademy.mario.bytebank.model.Cliente

fun testaAny(any: Any){
    val cliente = Cliente(
        nome = "Felipe",
        documento = "03889009489",
        senha = 123
    )

    println(devolveAny(cliente))
}

fun devolveAny(any: Any): Any {
    return any
}