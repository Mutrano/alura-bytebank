package br.com.zupacademy.mario.bytebank.model

class SistemaInterno {
    fun entra(admin: Autenticavel, senha: Int,autenticado:()->Unit={}) {
        if (admin.autentica(senha)) {
            println("Bem vindo ao ByteBank")
            autenticado()
        } else {
            println("Falha na autenticação")
        }
    }
    fun entraReceiver(admin:Autenticavel,senha:Int,autenticado: SistemaInterno.()->Unit={}){
        if (admin.autentica(senha)) {
            println("Bem vindo ao ByteBank")
            autenticado().also(::println)
        } else {
            println("Falha na autenticação")
        }
    }
    fun pagamento(){
        println("Realizando pagamento")
    }
}