fun main() {
    val numero = 10
    if (numero > 0) {
        println("O número é positivo")
    } else {
        println("O número é negativo ou zero")
    }

    val opcao = 2
    when (opcao) {
        1 -> println("Opção 1 selecionada")
        2 -> println("Opção 2 selecionada")
        else -> println("Opção inválida")
    }

    for (i in 1..5) {
        println("Contagem: $i")
    }

    val array = arrayOf(10, 20, 30, 40, 50, 60, 70, 80)
    println("Todos os itens do array:")
    for (item in array) {
        println(item)
    }

    if (array.size >= 6) {
        println("O sexto elemento é: ${array[5]}")
    } else {
        println("O array não possui 6 elementos")
    }

    var contador = 0
    while (contador < 5) {
        println("Numero: $contador")
        contador++
    }

    println("Soma: ${soma(10, 5)}")
    println("Subtração: ${subtracao(10, 5)}")
    println("Multiplicação: ${multiplicacao(10, 5)}")
    println("Divisão: ${divisao(10, 5)}")
}

fun soma(a: Int, b: Int): Int {
    return a + b
}

fun subtracao(a: Int, b: Int): Int {
    return a - b
}

fun multiplicacao(a: Int, b: Int): Int {
    return a * b
}

fun divisao(a: Int, b: Int): Int {
    return if (b != 0) a / b else 0
}