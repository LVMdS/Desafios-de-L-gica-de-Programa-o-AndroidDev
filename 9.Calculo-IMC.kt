fun main() {
    print("Digite o peso em kg: ")
    val peso = readLine()!!.toDouble()
    
    print("Digite a altura em metros: ")
    val altura = readLine()!!.toDouble()
    
    val imc = peso / (altura * altura)
    
    val condicao = when {
        imc < 18.5 -> "Abaixo do peso"
        imc in 18.5..24.9 -> "Peso ideal (parabéns)"
        imc in 25.0..29.9 -> "Levemente acima do peso"
        imc in 30.0..34.9 -> "Obesidade grau I"
        imc in 35.0..39.9 -> "Obesidade grau II (severa)"
        else -> "Obesidade grau III (mórbida)"
    }
    
    println("Seu IMC é ${"%.2f".format(imc)} e sua condição é: $condicao")
}
