import Alura.Funcionario.Autenticavel
import Alura.cliente.Endereco
import Alura.sistema.SistemaInterno
import banco.funcoes.Soma
import banco.funcoes.Teste
import banco.pedido.Pedido

fun main() {

    Endereco(logadouro = "rua Alto horizonte", 1080)
        .let { endereco ->
            "${endereco.logadouro}, ${endereco.numero}".toUpperCase()
        }.let {
            println(it)
        }

    val EnderecosComComplemento = listOf(
        Endereco(complemento = "casa"),
        Endereco(),
        Endereco(complemento = "apartamento"))
        .filter { endereco -> endereco.complemento.isNotEmpty() } // condicao nao esta vazio  predicade={bla}
        .let(block = (::println))
    //println(soma(3,7)) erro
    soma(3, 7){
        println(it)
    }
    soma(5, 8, resultado = (::println))

    val autenticavel = object : Autenticavel {
        val senha = "1234"
        override fun autentica(senha: String): Boolean = this.senha == senha
    }
    SistemaInterno().entra(autenticavel, autenticavel.senha){
        println("realizar pagamento")
    }
    SistemaInterno().entra(autenticavel, autenticavel.senha, autenticado = {
        println("realizar pagamento2")
    })
}
fun soma (a: Int, b: Int, resultado: (Int) -> Unit){
    println("soma sendo efetuada")
    resultado
    resultado(a + b)
    println("depois da soma")

}








