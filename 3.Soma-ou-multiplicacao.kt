fun main() {
    print("Digite o valor de A: ")
    val a = readLine()!!.toInt()
    
    print("Digite o valor de B: ")
    val b = readLine()!!.toInt()
    
    val c = if (a == b) {
        a + b
    } else {
        a * b
    }
    
    println("O resultado é $c")
}
