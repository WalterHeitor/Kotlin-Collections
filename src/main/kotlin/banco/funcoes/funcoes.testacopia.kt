package banco.funcoes

import banco.BancoNomes

fun testaCopia() {
    val bancoNomes = BancoNomes()
    val nomesSalvos: Collection<String> =
        bancoNomes.nomes                    // as MutableList<String>
    bancoNomes.salva("Bianca")
    println(nomesSalvos)
    println(BancoNomes().nomes)
}