fun main() {
    print("Digite um número: ")
    val numero = readLine()!!.toInt()
    
    val parOuImpar = if (numero % 2 == 0) "par" else "ímpar"
    val positivoOuNegativo = if (numero >= 0) "positivo" else "negativo"
    
    println("O número é $parOuImpar e $positivoOuNegativo")
}
