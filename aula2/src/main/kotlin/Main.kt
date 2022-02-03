fun main() {
//    val calculadora: Calculadora = Calculadora()
//
//    val resultadoSoma: Float = calculadora.somar(23f, 78f)
//    println("O resultado da soma é $resultadoSoma")
//
//    val raiz = calculadora.raizQuadrada(81f)
//    println("A raiz quadrada de 81 é $raiz")

    val geometria:Geometria = Geometria()

    println("Calculando a área do círculo:")
    println("Digite o raio:")
    var raio = readLine()!!.toDouble()
    var area = geometria.calcularAreaDoCirculo(raio)

    print("A área do círculo é: $area")
}