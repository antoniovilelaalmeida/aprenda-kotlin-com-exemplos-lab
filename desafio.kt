// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(nome: String) {
    val nome: String = nome
}

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val formacaoNome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        // TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        inscritos.add(usuario)
        println("Usuario ${usuario.nome} matriculado na formacao $formacaoNome.")
    }
}

fun main() {

    val usuario1 = Usuario("Joao")
    val usuario2 = Usuario("Maria")

    val conteudo1 = ConteudoEducacional("Introducao a Programacao", 90)
    val conteudo2 = ConteudoEducacional("Estruturas de Dados", 120)
    val conteudo3 = ConteudoEducacional("Algoritmos Avancados")

    val formacao1 = Formacao("Ciencia da Computacao", listOf(conteudo1, conteudo2))
    val formacao2 = Formacao("Engenharia de Software", listOf(conteudo1, conteudo3))

    formacao1.matricular(usuario1)
    formacao1.matricular(usuario2)
    formacao2.matricular(usuario1)

    println("Inscritos na formacao ${formacao1.formacaoNome}: ${formacao1.inscritos}")
    println("Inscritos na formacao ${formacao2.formacaoNome}: ${formacao2.inscritos}")
}
