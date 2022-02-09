class Paciente {
    var nome: String? = null
        get() = if (field.isNullOrEmpty()) "Nome do paciente não informado" else field
        set(value) {
            field = if(value!!.length < 2) null else value
        }
    var rg: String? = null
        get() = if(field.isNullOrEmpty()) "RG do paciente não informado" else field
        set(value) {
            field = if(value?.length == 10) value else null
        }
    var telefoneParaContato: String? = null
        get() = if(field.isNullOrEmpty()) "Telefone para contato não foi informado" else field
        set(value) {
            field = if(value!!.length >=11) value else null
        }
    var endereco: Endereco? = null
        get() = if(field == null) Endereco() else field
        set(value) {
            if(value != null){
                field = value
            }
        }
}