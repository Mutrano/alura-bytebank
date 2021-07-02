package br.com.zupacademy.mario.bytebank.model

interface Autenticavel {
    fun autentica(senha: Int): Boolean
}