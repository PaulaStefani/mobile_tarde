import java.util.Date;

fun main(){
    // Objetos
    var hardRecords:Gravadora = Gravadora()
    hardRecords.nome = "Hard Records LTDA"
    hardRecords.endereco = "Tv. Não te interessa nº 666 - The number of the Beast - Hell"

    println(hardRecords.nome)
    println(hardRecords.endereco)
//    println(hardRecords)
}
// Classes
class Musica{
    var titulo:String? = null
    var duracao:Int? = null
    var generoMusical:String? = null
    var anoDeLancamento:Date? = null
    var album:String? = null
    var compositor:Compositor? = null
    var gravadora:Gravadora? = null
}
class Compositor{
    var nome:String? = null
    var cpf:String? = null
    var idade:Byte? = null
    var telefoneComercial:String? = null
}
class Gravadora{
    lateinit var nome:String
    var endereco:String? = null
    var telefoneComercial:String = ""
}