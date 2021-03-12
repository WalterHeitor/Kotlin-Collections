
fun main(){
    val pedidos = mapOf<Int, Double>(Pair(1, 20.0), Pair(2, 34.4), 3 to 50.0)
    println(pedidos)
    val pedido = pedidos[0]
    pedido?.let {
        println("pedido $it")
    }
    for (pedido: Map.Entry<Int, Double> in pedidos){
        println("numero pedido: ${pedido.key}")
        println("valor pedido: ${pedido.value}")
    }

}




