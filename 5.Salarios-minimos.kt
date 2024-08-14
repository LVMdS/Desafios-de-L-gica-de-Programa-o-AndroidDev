fun main() {
    val salarioMinimo = 1293.20
    
    print("Digite o valor do seu salário: ")
    val salario = readLine()!!.toDouble()
    
    val quantSalariosMinimos = salario / salarioMinimo
    
    println("Você ganha o equivalente a ${"%.2f".format(quantSalariosMinimos)} salários mínimos")
}
