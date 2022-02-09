import java.time.LocalDateTime

class Internacao {
    var paciente: Paciente? = null
        get() = if (field == null) Paciente() else field
        set(value) {
            if (value != null) {
                field = value
            }
        }
    var dataDaInternacao: LocalDateTime? = null
        set(value) {
            if (value == null) {
                field = LocalDateTime.now()
            } else {
                field = value
            }
        }
    var dataDaAlta: LocalDateTime? = null
        set(value) {
            if (value == null) {
                field = LocalDateTime.now()
            } else {
                field = value
            }
        }
    var observacao: String? = null
        get() = if(field.isNullOrEmpty()) "Não há observações registradas" else field
        set(value) {
            if (value.isNullOrEmpty()) null else value
        }
}