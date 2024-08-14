fun main() {
    print("Digite o primeiro valor: ")
    val a = readLine()!!.toInt()
    
    print("Digite o segundo valor: ")
    val b = readLine()!!.toInt()
    
    print("Digite o terceiro valor: ")
    val c = readLine()!!.toInt()
    
    val lista = listOf(a, b, c).sortedDescending()
    
    println("Valores em ordem decrescente: ${lista.joinToString(", ")}")
}
