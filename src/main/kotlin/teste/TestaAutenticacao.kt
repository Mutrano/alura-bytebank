import model.Cliente
import model.Diretor
import model.Gerente
import model.SistemaInterno

fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "Alex",
        documento = "0737813507",
        salario = 1000.0,
        senha = 1000
    )

    val diretor = Diretor(
        nome = "Fran",
        documento = "073780351763",
        salario = 2000.0,
        senha = 2000,
        plr = 100.0
    )
    val cliente= Cliente(
        nome="Guni",
        documento = "04848093809",
        senha = 1234
    )
    val sistema = SistemaInterno()
    sistema.entra(gerente, 1000)
    sistema.entra(diretor, 2000)
    sistema.entra(cliente,1234)
}