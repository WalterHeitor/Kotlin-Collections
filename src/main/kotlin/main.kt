
fun main(){
    val pedidos = mapOf<Int, Double>(
        Pair(1, 20.0),
        Pair(2, 34.4),
        3 to 50.0
    )
    println(pedidos)
    val pedido = pedidos[0]
    pedido?.let {
        println("pedido $it")
    }
    for (p: Map.Entry<Int, Double> in pedidos){
        println("numero pedido: ${p.key}")
        println("valor pedido: ${p.value}")
    }

    val pedidosMutavel: MutableMap<Int, Double> = mutableMapOf(
        Pair(1, 20.0),
        Pair(2, 34.4),
        3 to 50.0
    )
    val pedido1 = pedidosMutavel[0]
    pedido?.let {
        println("pedido $it")
    }
    for (p: Map.Entry<Int, Double> in pedidosMutavel){
        println("numero pedido: ${p.key}")
        println("valor pedido: ${p.value}")
    }
    pedidosMutavel[5] = 70.0
    println(pedidosMutavel)
    pedidosMutavel.put(5, 80.8)
    println(pedidosMutavel)
    pedidosMutavel[1] = 65.7
    println(pedidosMutavel)
    pedidosMutavel.put(2, 43.7)
    println(pedidosMutavel)
    pedidosMutavel.putIfAbsent(6, 180.3)
    println(pedidosMutavel)
    pedidosMutavel.putIfAbsent(6, 1800.3) //nao funciona continua acima
    println(pedidosMutavel)
    pedidosMutavel.remove(2)
    println(pedidosMutavel)
    pedidosMutavel.remove(2, 200.0)
    println(pedidosMutavel)

}




