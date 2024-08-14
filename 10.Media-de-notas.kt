fun main() {
    print("Digite a primeira nota: ")
    val nota1 = readLine()!!.toDouble()
    
    print("Digite a segunda nota: ")
    val nota2 = readLine()!!.toDouble()
    
    print("Digite a terceira nota: ")
    val nota3 = readLine()!!.toDouble()
    
    val media = (nota1 + nota2 + nota3) / 3
    
    println("A média das notas é ${"%.2f".format(media)}")
}
