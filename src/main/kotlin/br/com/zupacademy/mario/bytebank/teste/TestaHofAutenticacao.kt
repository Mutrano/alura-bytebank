package br.com.zupacademy.mario.bytebank

import br.com.zupacademy.mario.bytebank.model.Autenticavel
import br.com.zupacademy.mario.bytebank.model.SistemaInterno

fun testaHofAutenticacao() {
    val funcionario = object : Autenticavel {
        val senha = 1234
        override fun autentica(senha: Int): Boolean = this.senha.equals(senha)
    }
    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(funcionario, 1234) {

        println("deu bom")
    }
    sistemaInterno.entraReceiver(funcionario,1234,{
        pagamento().run { 500 }
    })
}