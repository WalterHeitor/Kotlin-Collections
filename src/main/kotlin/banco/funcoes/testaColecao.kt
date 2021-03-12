package banco.funcoes


fun testaColecao() {
    val nomes: Collection<String> = listOf(
        "walter",
        "heitor",
        "freitas",
        "oliveira",
        "maria",
        "clara"
    )
    for (nome: String in nomes) {
        println(nome)
        //println(nome.iterator())
    }
    println(nomes)
    println("Tem o nome walter?  ${nomes.contains("walter")}")
    println("Tamanho da colecao ${nomes.size}")
}