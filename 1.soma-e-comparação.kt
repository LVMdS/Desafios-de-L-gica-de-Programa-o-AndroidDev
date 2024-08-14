fun main() {
    print("Digite o valor de A: ")
    val a = readLine()!!.toInt()
    
    print("Digite o valor de B: ")
    val b = readLine()!!.toInt()
    
    print("Digite o valor de C: ")
    val c = readLine()!!.toInt()
    
    val soma = a + b
    println("A soma de A e B é $soma")
    
    if (soma < c) {
        println("A soma é menor que C")
    } else {
        println("A soma não é menor que C")
    }
}
