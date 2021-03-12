package banco.funcoes

fun testaSet() {
    val assitiramCursoAndroid: Set<String> =
        setOf("walter", "heitor", "freitas", "oliveira")
    val assitiramCursoKotlin =
        listOf("walter", "maria", "freitas")
    val assitiramAmbos = mutableListOf<String>()
    assitiramAmbos.addAll(assitiramCursoAndroid)
    println(assitiramAmbos)
    assitiramAmbos.addAll(assitiramCursoKotlin)
    println(assitiramAmbos.distinct())
    val assAmbos = assitiramCursoAndroid + assitiramCursoKotlin
    println(assAmbos)
    println("----------------- Uniao --------------------")
    println(assitiramCursoAndroid.union(assitiramCursoKotlin))
    println("----------------- Uniao sem ponto --------------------")
    println(assitiramCursoAndroid union assitiramCursoKotlin)
    println("----------------- subracao --------------------")
    println(assitiramCursoAndroid - assitiramCursoKotlin)
    println("----------------- subracao --------------------")
    println(assitiramCursoKotlin.subtract(assitiramCursoAndroid))
    println("----------------- Subtacao sem ponto --------------------")
    println(assitiramCursoAndroid subtract assitiramCursoKotlin)
    println("----------------- intersecao --------------------")
    println(assitiramCursoKotlin.intersect(assitiramCursoAndroid))
    println("----------------- intersecao sem ponto --------------------")
    println(assitiramCursoAndroid intersect assitiramCursoKotlin)
    println("----------------- fim --------------------")
}