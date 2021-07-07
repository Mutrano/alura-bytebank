package br.com.zupacademy.mario.bytebank

import br.com.zupacademy.mario.bytebank.model.Endereco

fun testaScopeFunctions() {
    Endereco(logradouro = "C 13 bloco j", numero = 103)
        .let { "${it.logradouro} numero ${it.numero}" }.also(::println)

    Endereco(logradouro = "C 13 bloco j", numero = 103)
        .run { "$logradouro numero $numero" }.also(::println)

    //function type
    val soma = { x: Int, y: Int -> x + y }

    soma(5, 7)
        .also(::println)
        .let { it + 50 }
        .also(::println)

    Endereco(logradouro = "C 13 bloco j", numero = 103)
        //usando apply pra configurar o objeto
        .apply {
            bairro = if (1 > 2) "Samambaia"
            else {
                "Taguatinga"
            }
        }
        .also(::println)
}