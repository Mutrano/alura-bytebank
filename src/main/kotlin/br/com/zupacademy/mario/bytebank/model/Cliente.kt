package br.com.zupacademy.mario.bytebank.model

class Cliente(
    val nome: String,
    val documento: String,
    var endereco:Endereco = Endereco(),
    val senha: Int
) : Autenticavel {
    override fun autentica(senha: Int): Boolean {
        return this.senha == senha
    }
}