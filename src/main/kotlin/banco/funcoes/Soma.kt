package banco.funcoes

class Soma : (Int, Int) -> Int {
    override fun invoke(p1: Int, p2: Int): Int {
        return  p1 + p2
    }
}