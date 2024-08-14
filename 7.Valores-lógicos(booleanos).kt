fun main() {
    print("Digite o primeiro valor booleano (true/false): ")
    val bool1 = readLine()!!.toBoolean()
    
    print("Digite o segundo valor booleano (true/false): ")
    val bool2 = readLine()!!.toBoolean()
    
    val resultado = if (bool1 == bool2) "ambos são ${if (bool1) "VERDADEIRO" else "FALSO"}" else "os valores são diferentes"
    
    println("Resultado: $resultado")
}
