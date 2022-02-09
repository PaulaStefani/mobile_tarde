class Endereco {
    var logradouro: String? = null
        get() = if (field.isNullOrEmpty()) "Logradouro não informado" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }
    var numero: String? = null
        get() = if (field.isNullOrEmpty()) "Número do endereço não informado" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }
    var bairro: String? = null
        get() = if (field.isNullOrEmpty()) "Bairro não informado" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }
    var cidade: String? = null
        get() = if (field.isNullOrEmpty()) "Cidade não foi informada" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }
    var estado: String? = null
        get() = if (field.isNullOrEmpty()) "Estado não foi informado" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }
    var cep: String? = null
        get() = if (field.isNullOrEmpty()) "CEP não foi informado" else field
        set(value) {
            field = if (value?.length == 8) value else null
        }
}