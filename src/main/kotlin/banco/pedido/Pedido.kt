package banco.pedido

data class Pedido(
    val numero: Int,
    val valor: Double
) {
}
fun criarPedido(){
    listOf(
        Pedido(1, 20.0),
        Pedido(2, 60.0),
        Pedido(3, 30.0),
        Pedido(4, 70.0)
    )
}