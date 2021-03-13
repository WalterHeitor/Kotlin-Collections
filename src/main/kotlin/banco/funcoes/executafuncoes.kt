package banco.funcoes

fun executaFuncoes() {
    val minhaFuncaoAnonima: () -> Unit =fun (){  // funcao anonima
        println("executa como anonima")
    }
    val minhaFuncaoAnonimaRetorno: (Int, Int, Int) -> Int =fun (a: Int, b: Int, _: Int): Int{  // funcao anonima
        println("executa como anonima Retorno")
        return a + b
    }
    fun testeFuncaoLambida() {
        val minhaFuncaoLambida: () -> Unit = {
            println("executa como lambida")
        }
        println(minhaFuncaoLambida)
        println(minhaFuncaoLambida())
    }

    fun testeFuncaoLambidaRetorno() {
        val minhaFuncaoLambida: (Int, Int, Int) -> Int = { a, b, _ ->
            println("funcao Labida que retorna")
            a + b
        }
        println(minhaFuncaoLambida)
        println(minhaFuncaoLambida(20, 40, 1))
        println(minhaFuncaoAnonimaRetorno(49,20,10))
    }




    fun soma(a: Int, b: Int) : Int = a + b
    fun teste(){
        println("executa teste")
    }
    fun somaReferencia(){
        val minhaFuncao: (Int, Int) -> Int = ::soma
        println(minhaFuncao(5,10))
    }
    fun calculaBonificacaoFun(){  //retorno multiplo
        var calculaBonificacao: (salario: Double) -> Double = lambida@ { salario ->
            if(salario > 1000){
                return@lambida salario + 50
            }
            return@lambida salario + 100

        }
        println(calculaBonificacao(1100.0))
    }
    fun calculaBonificacaoFun2(){  //retorno multiplo
        var calculaBonificacao: (salario: Double) -> Double = fun (salario):Double {
            if (salario > 1000) {
                return salario + 50
            }
            return salario + 100

        }
        println(calculaBonificacao(1100.0))



    }

    fun testeDefuncoes() {
        fun testaTipoFuncaoClasse() {
            val minhaFuncaoClasses: () -> Unit = Teste()
            println(minhaFuncaoClasses) //instancia de teste
            println(minhaFuncaoClasses()) // () executar
        }

        fun testaTipoFuncaoClasseSoma() {
            val minhaFuncaoClassesSoma: (Int, Int) -> Int = Soma()
            println(minhaFuncaoClassesSoma) //instancia de teste
            println(minhaFuncaoClassesSoma(5, 10)) // () executar
        }

        fun testaTipoFuncaoReferencia() {
            val minhaFuncao: () -> Unit = ::teste //referencia de uma fucao

            println(soma(43, 61))
            println(minhaFuncao())
        }
    }


}
