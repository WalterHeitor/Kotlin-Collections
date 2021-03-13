package banco.funcoes

 fun testMapEscrita(){
     fun testaMapescrita() {
         val pedidosMutavel: MutableMap<Int, Double> = mutableMapOf(
             Pair(1, 20.0),
             Pair(2, 34.4),
             3 to 50.0,
             4 to 100.3,
             5 to 39.9,
             6 to 17.2
         )
//    val valorPedido = pedidosMutavel.getValue(5)
//    println(valorPedido)

         val msg1 = pedidosMutavel.getOrElse(0, {
             "Nao tem pedido"
         })
         println(msg1)
         val msg2: Double? = pedidosMutavel.getOrElse(0, {
             30.0
             // null
         })
         println(msg2)
         println(
             pedidosMutavel.getOrDefault(1, -0.1)
         )
         println(pedidosMutavel.keys)
         println(pedidosMutavel.values)
         for (numero in pedidosMutavel.values) {
             println("pedidos ${numero}")
         }
         val pedidosFiltrados = pedidosMutavel.filter { (numero, valor) ->
             numero % 2 == 0 && valor < 40
         }
         println(pedidosFiltrados)

         val pedidosDiv2 = pedidosMutavel.filterKeys { numero ->
             numero % 2 == 0
         }
         println(pedidosDiv2)

         val pedidosMaior = pedidosMutavel.filterValues { valor ->
             valor < 40
         }
         println(pedidosMaior)
         println(pedidosMutavel + mapOf(7 to 90.8, 8 to 21.9))
         println(pedidosMutavel)
         println(pedidosMutavel - listOf(2, 4))
         println(pedidosMutavel)
//  pedidosMutavel.putAll(listOf<Pair<Int,Double>>(7 to 90.8, 8 to 21.9))
         pedidosMutavel += listOf<Pair<Int, Double>>(7 to 90.8, 8 to 21.9)

         println("put $pedidosMutavel")

         pedidosMutavel.keys.remove(1)
         println(pedidosMutavel)
         pedidosMutavel.values.remove(50.0)
         println(pedidosMutavel)
         pedidosMutavel -= 2
         println(pedidosMutavel)
     }
 }
