fun main(args: Array<String>) {
    val lucas = Paciente()
    var internacao = Internacao()

//    println(lucas.endereco?.cidade)
//    // Não funciona
//    // lucas.endereco?.cidade = "Porto Alegre"
//    // Isso funciona
//
//    println(lucas.endereco)
//
//    lucas.endereco = Endereco()
//    lucas.endereco!!.cidade = "Porto Alegre"
//    println(lucas.endereco?.cidade)

    internacao.paciente = Paciente()
    internacao.paciente!!.nome = "Douglas"
    internacao.paciente!!.endereco = Endereco()
    internacao.paciente!!.endereco!!.cidade = "Porto Alegre"

    println(internacao.paciente!!.endereco!!.cidade)
}