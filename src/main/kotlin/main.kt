import Alura.cliente.Endereco

fun main() {
     with(Endereco()) {
        logadouro = "rua rubens jose"
        numero = 4938
        bairro = "marolina"
        estado = "goias"
        cep = "373628-0928"
        complemento = "itumbiara"
        completo()
    }.let { enderecoCompleto ->
         println(enderecoCompleto)
     }
}










