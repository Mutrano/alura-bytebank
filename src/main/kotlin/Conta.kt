//construtor padrao
class Conta(
    val titular: String,
    val numeroConta: Int
) {
    var saldo = 0.0
        private set
    //construtor secundário
//    constructor(titular : String, numeroConta:Int){
//        this.titular=titular
//        this.numeroConta=numeroConta
//    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }

    fun transferePara(destino: Conta, valor: Double): Boolean {
        if (this.saldo >= valor) {
            this.saldo -= valor
            destino.saldo += valor
            return true
        }
        return false

    }

}