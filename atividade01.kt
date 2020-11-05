//03.Faça um programa na Linguagem Kotlin que receba 2 números e apresente a multiplicação dos dois números.

fun main(args: Array<String>) {
var numA:Double
var numB:Double
var mult:Double

println("Digite o numero A: ")
numA = readLine().toString().toDouble()
println("Digite o numero B: ")
numB = readLine().toString().toDouble()
mult = numA * numB
  println("A multiplicação dos dois números eh: $mult")
}


//04.Faça um programa na Linguagem Kotlin que leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão é F <-- (9 * C + 160) /5, sendo f a temperatura em Fahrenheit e C a temperatura em Celsius.

fun main(args: Array<String>) {
var fahrenheit:Double
var celsius:Double

println("Digite a temperatura em graus Celsius que deseja converter: ")
celsius = readLine().toString().toDouble()
fahrenheit = (9 * celsius + 160)/5
  println( "$celsius convertido para fahrenheit eh: $fahrenheit")
}


//05. Faça um programa na Linguagem Kotlin que leia uma temperatura em graus Fahrenheit e apresentá-la convertida em graus Celsius. A formula de conversão é C <-- (F - 32) * (5/9), sendo f a temperatura em Fahrenheit e C a temperatura em Celsius.

fun main(args: Array<String>) {
var fahrenheit:Double
var celsius:Double
println("Digite a temperatura em graus Fahrenheit que deseja converter: ")
fahrenheit = readLine().toString().toDouble()
celsius = (fahrenheit - 32) * 5/9
//a fórmula não funcionou como o esperado usando () na divisão 5/9
println( "$fahrenheit convertido para Celsius eh: $celsius")
}


//06.Faça um programa na Linguagem Kotlin para calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula: VOLUME <-- 3.14159 * RAIO2 * ALTURA.

fun main(args: Array<String>) {
var volume:Double
var raio:Double
var altura:Double

println("Digite a altura da lata: ")
altura = readLine().toString().toDouble()
println("Digite o raio da lata: ")
raio = readLine().toString().toDouble()
raio = raio * raio
volume = 3.14159 * raio * altura
println("O volume da lata de oleo eh: $volume")
}

//07.Faça um programa na Linguagem Kotlin que leia a idade de uma pessoa expressa em ano, mês e dia e mostre-as em dias.

fun main(args: Array<String>) {
var ano:Int
var dias:Int
var meses:Int

println("Digite quantos anos completos: ")
ano = readLine().toString().toInt()
println("Digite quantos meses completos: ")
meses = readLine().toString().toInt()
println("Digite quandos dias: ")
dias = readLine().toString().toInt()
dias = dias + (ano * 365) + (meses * 30)
println("A ida informada em dias eh: $dias")
}

//08. Faça um programa na Linguagem Kotlin que calcule a área da circunferência.

fun main(args: Array<String>) {
var raio:Double
var area:Double

println("Digite o raio da circunferência para calcular a área: ")
raio = readLine().toString().toDouble()
area = 3.14159 * (raio * raio)
println("A área de circunferência é:  $area")
}


//09.Faça um programa na Linguagem Kotlin para efetuar o cálculo e a apresentação do valor de uma prestação em atraso, utilizando a fórmula PRESTAÇÃO <-- VALOR + (VALOR * (TAXA/100) * TEMPO).

fun main(args: Array<String>) {
var parcela:Double
var taxa:Double
var valPagar:Double
var tempo:Double

println("Qual o valor da parcela? ")
parcela = readLine().toString().toDouble()
println("Qual o percentual da taxa de juros? ")
taxa = readLine().toString().toDouble()
println("Quantos meses a parcela está em atraso? ")
tempo = readLine().toString().toDouble()
valPagar = parcela + (parcela * (taxa/100) * tempo)

println("O valor atual da parcela eh: $valPagar" )
}

//10.Faça um programa na Linguagem Kotlin que efetue a apresentação do valor da conversão em real de um valor lido em dólar. O programa deve solicitar o valor da cotação do dólar e também a quantidade de dólares disponível com o usuário, para que seja apresentado o valor em moeda brasileira.

fun main(args: Array<String>) {
var real:Double
var dolar:Double
var cotacao:Double

println("Quantos dólares deseja trocar hoje?")
dolar = readLine().toString().toDouble()
println("Qual cotação do dólar hoje?")
cotacao = readLine().toString().toDouble()
real = dolar * cotacao

println("O valor que será recebido em reais eh:  $real")
}

//11.Faça um programa na Linguagem Kotlin para ler dois valores inteiros para as variáveis A e B e efetuar a troca dos valores de forma que a variável A passe a possuir o valor da variável B e a variável B passe a possuir o valor da variável A. Apresentar os valores trocados.

fun main(args: Array<String>) {
var valorA:Int
var valorB:Int
var aux:Int

println("Algoritmo de troca de lugar dos valores inteiros A e B")
println("Digite um valor para A")
valorA = readLine().toString().toInt()
println("Digite um valor para B")
valorB = readLine().toString().toInt()

aux = valorA
valorA = valorB
valorB = aux

println("Valor de A: $valorA Valor de B $valorB")
}

//12.Faça um programa na Linguagem Kotlin para efetuar a leitura de um número inteiro e apresentar o resultado do quadrado desse número.

fun main(args: Array<String>) {
var valor:Int

println("Qual valor inteiro deseja calcular o quadrado?")
valor = readLine().toString().toInt()

valor = valor * valor

println("O valor ao quadrado eh:  $valor")
}

//13.Faça um programa na Linguagem Kotlin que receba um número e mostre o resto da divisão por 6.

fun main(args: Array<String>) {
var valor:Double

println("Qual o numero que deseja saber o resto da divisão por 6?")
valor = readLine().toString().toDouble()
valor = valor % 6
println("O resto da divisão do valor digitado por 6 eh: $valor")
}
