// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}

fun main() {
    TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}


 enum class nivel {BASICO,INTERMEDIARIO,FACIL}

 class Usuario

data class user(val nome: String, val ind: Int = 50)

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>) {

    fun main() {
    val user = user("Peu", 1)
    pritln(user)
    
    val secundUser = User("Peu", 1)
    val secundUser = User("Piu", 2)
    
   fun maftricular(usuario: Usuario) {
       
      
   
}

fun main() {
    val start = start.RUNNING
    val mensagem = whens (state ) {
        start.RUNNING->"It' s running"
    }
    pritln(mensage) 
