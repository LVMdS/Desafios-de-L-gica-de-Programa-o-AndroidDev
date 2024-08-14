fun main() {
    print("Digite um número inteiro: ")
    val numero = readLine()!!.toInt()
    
    val antecessor = numero - 1
    val sucessor = numero + 1
    
    println("O antecessor é $antecessor e o sucessor é $sucessor")
}
