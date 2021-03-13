import banco.pedido.Pedido

fun main() {

    val minhaFuncao : ()-> Unit = ::teste

    println(soma(43, 61))
    println(minhaFuncao())

    val minhaFuncaoClasses: () -> Unit = Teste()
    println(minhaFuncaoClasses) //instancia de teste
    println(minhaFuncaoClasses()) // () executar
}

fun soma(a: Int, b: Int) : Int = a + b
fun teste(){
    println("executa teste")
}

class Teste : () -> Unit{
    override fun invoke() {
        println("executa invoke do teste")
    }

}






