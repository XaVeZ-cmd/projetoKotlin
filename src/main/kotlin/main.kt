enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60, val nivel: Nivel)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("Usuário ${usuario.nome} matriculado na formação $nome.")
    }
}

fun main() {
    val usuario1 = Usuario("João")
    val usuario2 = Usuario("Maria")

    val conteudo1 = ConteudoEducacional("Introdução ao Kotlin", 60, Nivel.BASICO)
    val conteudo2 = ConteudoEducacional("Kotlin Intermediário", 120, Nivel.INTERMEDIARIO)
    val conteudo3 = ConteudoEducacional("Kotlin Avançado", 180, Nivel.DIFICIL)

    val formacao = Formacao("Formação Kotlin", listOf(conteudo1, conteudo2, conteudo3))

    formacao.matricular(usuario1)
    formacao.matricular(usuario2)
}