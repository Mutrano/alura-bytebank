package br.com.zupacademy.mario.bytebank

import br.com.zupacademy.mario.bytebank.model.Endereco

fun testaWith() {
    with(Endereco()) {
        logradouro = "Rua vergueiro"
        numero = 3185
        bairro = "Vila Mariana"
        cidade = "São Paulo"
        cep = "72130120"
        estado = "SP"
        complemento = "Apartamento"

        completo()
    }.also {
        println(it)
    }
}