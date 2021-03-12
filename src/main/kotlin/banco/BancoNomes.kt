package banco

class BancoNomes {
    val nomes: Collection<String> get() = Companion.dados.toList()

    fun salva(nome: String){
        Companion.dados.add(nome)
    }

    companion object {
        private val dados = mutableListOf<String>()
    }
}