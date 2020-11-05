//16. Faça um programa na Linguagem Kotlin que leia 3 (três) valores inteiros e apresente os 3 números em ordem crescente.

fun main(args: Array<String>) {
var numA:Int
var numB:Int
var numC:Int
var auxMaior:Int

println("Digite o numero A: ")
numA = readLine().toString().toInt()
println("Digite o numero B: ")
numB = readLine().toString().toInt()
println("Digite o numero C: ")
numC = readLine().toString().toInt()

if((numA > numB) && (numA > numC)){
auxMaior = numA
  if(numC > numB){
  numA = numB
  numB = numC
  numC = auxMaior}
  else{
  numA = numC
  numC = auxMaior}
}
  
if((numB > numA) && (numB > numC)){
auxMaior = numB
  if(numA > numC){
  numB = numA
  numA = numC
  numC = auxMaior}
}

if((numC > numA) && (numC > numB)){
  if(numA > numB){
  auxMaior = numA
  numA = numB
  numB = auxMaior}
}
  println("Os numeros em ordem crescente eh: $numA $numB $numC")
}

--------------------------------------------------- FIM -------------------------------------------------------------

//17. Faça um programa na Linguagem Kotlin que efetue a leitura de um valor inteiro positivo ou negativo e apresentar o número lido como sendo um valor positivo, ou seja, o programa deverá apresentar o módulo de um número fornecido.
fun main(args: Array<String>) {
var num:Int
println("Digite um numero inteiro: ")
num = readLine().toString().toInt()

if (num < 0){
num = -num
println("O numero digitado eh: $num")}
else{
println("O numero digitado eh: $num")}
}

--------------------------------------------------- FIM -------------------------------------------------------------

//18. Faça um programa na Linguagem Kotlin que leia dois valores numéricos e apresentar a diferença do maior para o menor.

fun main(args: Array<String>) {
var numA:Double
var numB:Double
var dif:Double

println("Digite o primeiro numero: ")
numA = readLine().toString().toDouble()
println("Digite o segundo numero: ")
numB = readLine().toString().toDouble()

if (numA > numB){
dif = numA - numB
}
else{
dif = numB - numA  
}
println("A diferença entre $numA e $numB eh: $dif")
}

--------------------------------------------------- FIM -------------------------------------------------------------

//19. Faça um programa na Linguagem Kotlin que leia quatros valores referentes a quatro notas escolares de um aluno e imprimir uma mensagem dizendo que o aluno foi aprovado, se o valor da média escolar for maior ou igual a 7. Se o aluno não foi aprovado, indicar uma mensagem informando esta condição. Apresentar junto das mensagens o valor da média do aluno para qualquer condição.

fun main(args: Array<String>) {
var notaA:Double
var notaB:Double
var notaC:Double
var notaD:Double
var media:Double

println("Vamos classificar se um aluno foi aprovado, ou não")
println("Digite a nota A: ")
notaA = readLine().toString().toDouble()
println("Digite a nota B: ")
notaB = readLine().toString().toDouble()
println("Digite a nota C: ")
notaC = readLine().toString().toDouble()
println("Digite a nota D: ")
notaD = readLine().toString().toDouble()

media = (notaA + notaB + notaC + notaD)/4

if (media >= 7)
println("Aluno com $media foi aprovado")
else
println("Aluno com $media foi reprovado")
}

--------------------------------------------------- FIM -------------------------------------------------------------

//20 Faça um programa na Linguagem Kotlin que efetue a leitura de quatro número inteiros e apresentar os números que são divisíveis por 2 e 3.

fun main(args: Array<String>) {
var num1:Int
var num2:Int
var num3:Int
var num4:Int
var numeros:String
numeros = "Os numeros digitados que são divisiveis por 2 e 3 sao:"

println("Digite a numero 1: ")
num1 = readLine().toString().toInt()
if((num1%2 == 0) && (num1%3 == 0))
numeros = numeros + "\n" + num1

println("Digite a numero 2: ")
num2 = readLine().toString().toInt()
if((num2%2 == 0) && (num2%3 == 0))
numeros = numeros + "\n" + num2

println("Digite a numero 3: ")
num3 = readLine().toString().toInt()
if((num3 % 2 == 0) && (num3 % 3 == 0))
numeros = numeros + "\n" + num3

println("Digite a numero 4: ")
num4 = readLine().toString().toInt()
if((num4%2 == 0) && (num4%3 == 0))
numeros = numeros + "\n" + num4

println(numeros)
}

--------------------------------------------------- FIM -------------------------------------------------------------

//21. Faça um programa na Linguagem Kotlin que efetue a leitura de quatro número inteiros e apresentar os números que são divisíveis por 2 ou 3.

fun main(args: Array<String>) {
var num1:Int
var num2:Int
var num3:Int
var num4:Int
var numeros:String
numeros = "Os numeros digitados que são divisiveis por 2 ou 3 sao : "

println("Digite a numero 1: ")
num1 = readLine().toString().toInt()
if((num1%2 == 0) || (num1%3 == 0))
numeros = numeros + "\n" + num1

println("Digite a numero 2: ")
num2 = readLine().toString().toInt()
if((num2%2 == 0) || (num2%3 == 0))
numeros = numeros + "\n" + num2

println("Digite a numero 3: ")
num3 = readLine().toString().toInt()
if((num3 % 2 == 0) || (num3 % 3 == 0))
numeros = numeros + "\n" + num3

println("Digite a numero 4: ")
num4 = readLine().toString().toInt()
if((num4%2 == 0) || (num4%3 == 0))
numeros = numeros + "\n" + num4

println(numeros)
}

--------------------------------------------------- FIM -------------------------------------------------------------

//22. Faça um programa na Linguagem Kotlin que leia 3 números inteiros e mostre o maior deles.

fun main(args: Array<String>) {
var numP:Int
var numS:Int
var numT:Int

println("Exibir maior número")
println("Digite o primeiro numero: ")
numP = readLine().toString().toInt()
println("Digite o segundo numero: ")
numS = readLine().toString().toInt()
println("Digite o terceiro numero: ")
numT = readLine().toString().toInt()

if((numP > numS) && (numP > numT)){
println ("O maior numero digitado é o primeiro $numP")
}
  
if((numS > numP) && (numS > numT)){
println ("O maior numero digitado é o segundo $numS")
}

if((numT > numP) && (numT > numS)){
println ("O maior numero digitado é o terceiro $numT")
}
}

--------------------------------------------------- FIM -------------------------------------------------------------

//23. Faça um programa na Linguagem Kotlin que efetue a leitura de cinco números inteiros e identificar o maior e o menor valor. Não execute a ordenação de valores.

fun main(args: Array<String>) {
var numP:Int
var numS:Int
var numT:Int
var numQua:Int
var numQui:Int

println("Exibir qual o maior e o menor número")
println("Digite o primeiro numero: ")
numP = readLine().toString().toInt()
println("Digite o segundo numero: ")
numS = readLine().toString().toInt()
println("Digite o terceiro numero: ")
numT = readLine().toString().toInt()
println("Digite o quarto numero: ")
numQua = readLine().toString().toInt()
println("Digite o quinto numero: ")
numQui = readLine().toString().toInt()

//encontrar o menor
if((numP < numS) && (numP < numT) && (numP < numQua) && (numP < numQui)){
println ("O menor numero digitado é o primeiro: $numP")
}
  
if((numS < numP) && (numS < numT) && (numS < numQua) && (numS < numQui)){
println ("O menor numero digitado é o segundo: $numS")
}

if((numT < numP) && (numT < numS) && (numT < numQua) && (numT < numQui)){
println ("O menor numero digitado é o terceiro: $numT")
}

if((numQua < numP) && (numQua < numS) && (numQua < numT) && (numQua < numQui)){
println ("O menor numero digitado é o quarto: $numQua")
}

if((numQui < numP) && (numQui < numS) && (numQui < numT) && (numQui < numQua)){
println ("O menor numero digitado é o quinto: $numQui")
}

//encontrar o maior
if((numP > numS) && (numP > numT) && (numP > numQua) && (numP > numQui)){
println ("O maior numero digitado é o primeiro: $numP")
}
  
if((numS > numP) && (numS > numT) && (numS > numQua) && (numS > numQui)){
println ("O maior numero digitado é o segundo: $numS")
}

if((numT > numP) && (numT > numS) && (numT > numQua) && (numT > numQui)){
println ("O maior numero digitado é o terceiro: $numT")
}

if((numQua > numP) && (numQua > numS) && (numQua > numT) && (numQua > numQui)){
println ("O maior numero digitado é o quarto: $numQua")
}

if((numQui > numP) && (numQui > numS) && (numQui > numT) && (numQui > numQua)){
println ("O maior numero digitado é o quinto: $numQui")
}
}

--------------------------------------------------- FIM -------------------------------------------------------------

//24. Faça um programa na Linguagem Kotlin que efetue a leitura de um número inteiro e apresentar uma mensagem informando se o número é par ou ímpar.

fun main(args: Array<String>) {
var num:Int

println("Verificar se numero inteiro eh par ou impar \nDigite o numero: ")
num = readLine().toString().toInt()

if((num%2) == 0){
  println("$num é par")
}
else{
  println("$num é impar")
}
}

--------------------------------------------------- FIM -------------------------------------------------------------

//25. Faça um programa na Linguagem Kotlin que efetue a leitura de um valor que esteja entre a faixa de 1 a 9. Após a leitura do valor fornecido pelo usuário, o programa deverá indicar uma de das duas mensagens:
//"O Valor está na faixa", caso o usuário forneça o valor nesta faixa,ou a mensagem
//"O valor está fora da faixa permitida", caso o usuário forneça valores menores que 1 ou maiores que 9.

fun main(args: Array<String>) {
  var num:Int

  println("Digite um numero inteiro: ")
  num = readLine().toString().toInt()
  if (num>=1 && num<=9)
  println("O valor está na faixa entre 1 e 9")
  else
  println("O valor está fora faixa entre 1 e 9")
}

--------------------------------------------------- FIM -------------------------------------------------------------

//26. Faça um programa na Linguagem Kotlin que efetue a leitura de um valor inteiro, e efetue a sua apresentação, caso o valor não seja maior que três.

fun main(args: Array<String>) {
var num:Int

  println("Digite um numero inteiro: ")
  num = readLine().toString().toInt()
  if (num<=3)
  println("O numero digitado eh: $num")
  else
  println("O valor é maior que 3")
}

--------------------------------------------------- FIM -------------------------------------------------------------

//Objetivo: 
//27. O cardápio de uma lanchonete é o seguinte:
//Especificação Código Preço
//Cachorro quente 100 1,20
//Bauru simples 101 1,30
//Bauru com ovo 102 1,50
//Hambúrger 103 1,20
//Cheeseburguer 104 1,30
//Refrigerante 105 1,00
//Faça um programa na Linguagem Kotlin que leia o código do item pedido, a quantidade e calcule o valor a ser pago por aquele lanche. Considere que a cada execução somente será calculado um item.

fun main(args: Array<String>) {
var cod:Int
var qtde:Int
var tot:Double

println("Escolha o produto que deseja calcular \nCachorro quente 100\nBauru simples 101\nBauru com ovo 102\nHambúrger 103\nCheeseburguer 104\nRefrigerante 105")
cod = readLine().toString().toInt()

println("Qual a quantidade?")
qtde = readLine().toString().toInt()

if (cod == 100){
tot = qtde * 1.20
println("O valor total a ser pago eh: $tot")}
else{ 
  if (cod == 101){ 
  tot = qtde * 1.30
  println("O valor total a ser pago eh: $tot")}
  else{
    if (cod == 102){
    tot = qtde * 1.50
    println("O valor total a ser pago eh: $tot")}
    else{
      if (cod == 103){ 
      tot = qtde * 1.20
      println("O valor total a ser pago eh: $tot")}
      else{
        if (cod == 104){ 
        tot = qtde * 1.30
        println("O valor total a ser pago eh: $tot")}
        else{    
          if (cod == 105){ 
          tot = qtde * 1.00
          println("O valor total a ser pago eh: $tot")}
          else{
          println("Codigo digitado eh inválido")}
}
}
}
}
}
}

--------------------------------------------------- FIM -------------------------------------------------------------

//28. Uma empresa concederá um aumento de salário aos seus funcionários, variável de acordo com o cargo, conforme a tabela abaixo. Faça um programa na Linguagem Kotlin que leia o salário e o cargo de um funcionário e calcule o novo salário. Se o cargo do funcionário não estiver na tabela, ele deverá, então, receber 40% de aumento. Mostre o salário antigo, o novo salário e a diferença.
//Código Cargo Percentual
//101 Gerente 10%
//102 Engenheiro 20%
//103 Técnico 30%

fun main(args: Array<String>) {
var cod:Int
var salAtual:Double
var salNovo:Double
var dif:Double

println("***** Cálculo de novo salário e a diferença entre o novo e o atual *****")

println("Digite o salario atual: ")
salAtual = readLine().toString().toDouble()

println("Escolha o nível do cargo para calcular \n101 Gerente 10% \n102 Engenheiro 20% \n103 Técnico 30% \nPara qualquer outro nível, digite algum numero diferente dos listados ")
cod = readLine().toString().toInt()

if (cod == 101){
salNovo = salAtual * 1.10
dif = salNovo - salAtual
println("O salario antigo de $salAtual será atualizado com $dif e atualizado será: $salNovo")}
else if (cod ==102){
    salNovo = salAtual * 1.20
    dif = salNovo - salAtual
    println("O salario antigo de $salAtual será atualizado com $dif e atualizado será: $salNovo")}
    else if (cod == 103){
    salNovo = salAtual * 1.30
    dif = salNovo - salAtual
    println("O salario antigo de $salAtual será atualizado com $dif e atualizado será: $salNovo")}
    else{
      salNovo = salAtual * 1.40
      dif = salNovo - salAtual
      println("O salario antigo de $salAtual será atualizado com $dif e atualizado será: $salNovo")}
}

--------------------------------------------------- FIM -------------------------------------------------------------

Estrutura de Repetição – Looping

//29. Faça um programa na Linguagem Kotlin que receba um valor, atribua a variável x, multiplique esse valor por 3 e atribua a variável r, apresente o valor calculado contido na variável R. Repetir isso 5x
fun main(args: Array<String>) {
var x:Int
var r:Int

println("Digite um valor inteiro pra essa demonstração: ")
x = readLine().toString().toInt()

for (i in 0..4){
  r = x * 3
  println("O numero $x multiplicado por 3 é $r")
}

}

//30. Faça um programa na Linguagem Kotlin que apresente os números inteiros de 1 a 200

fun main(args: Array<String>) {
var n:String
n = " "

for (i in 1..200){
n = n + "$i - " 
}

println(n)
}

--------------------------------------------------- FIM -------------------------------------------------------------

//31. Faça um programa na Linguagem Kotlin que que receba um número e mostre o fatorial desse número.

fun main(args: Array<String>) {
var num:Int
var fat:Int

println("Digite o numero que deseja calcular o fatorial")
num = readLine().toString().toInt()
fat = 1

for (i in 1..num) {
  fat = fat * i;
}
println("O fatorial de $num digitado eh: $fat")
}

--------------------------------------------------- FIM -------------------------------------------------------------

//32. Faça um programa na Linguagem Kotlin para apresentar os resultados de uma tabuada de um número qualquer, exemplo entra com um valor (x) e multiplicar pelos valores de 0 a 10.

fun main(args: Array<String>) {
var x:Int
var tab:String
println("***** Calculo de tabuada*****")

println("Entre com o número que deseja obter a tabuada: ")
x = readLine().toString().toInt()

tab = "A tabuada de $x é: \n"

for(i in 0..10){
  tab = tab + ("$x x $i = ") + (x * i) + "\n"
}
println(tab)
}

--------------------------------------------------- FIM -------------------------------------------------------------

//33. Faça um programa na Linguagem Kotlin para apresentar o total da soma obtida dos cem primeiros números inteiros ( 1 + 2 + 3 + 4 + .... 98+ 99+ 100).

fun main(args: Array<String>) {
var soma:Int
soma = 0
for (i in 1..100) {
  soma = soma + i;
}
println("A soma dos numeros de 1 ate 100 eh: $soma")
}

34. Faça um programa na Linguagem Kotlin que apresente no final o somatório dos valores pares existentes na faixa de 1 até 500.
//34. Faça um programa na Linguagem Kotlin que apresente no final o somatório dos valores pares existentes na faixa de 1 até 500.

fun main(args: Array<String>) {
  var soma:Int
  soma = 0

  for (i in 1..500){
    if (i%2 == 0)
    soma = soma + i 
  }

println("A soma dos valores pares entre 1 e 500 é $soma")
}

--------------------------------------------------- FIM -------------------------------------------------------------

//35. Faça um programa na Linguagem Kotlin que apresente todos os números divisíveis por 4 que sejam menores que 200.
fun main(args: Array<String>) {
  var n:String
  n = " "

  for (i in 1..199){
    if (i%4 == 0)
    n = n + "$i " 
  }

println(n)
}

--------------------------------------------------- FIM -------------------------------------------------------------

//36. Faça um programa na Linguagem Kotlin que apresente os valores de conversão de graus Celsius em Fahrenheit, de 10 em 10 graus, iniciando a contagem em 10 graus Celsius e finalizando em 100 graus Celsius. O programa deve apresentar os valores das duas temperaturas.

fun main(args: Array<String>) {
var celsius:Int
var fahrenheit:Int
for (i in 1..100) {
  if(i%10==0){
    celsius = i
    fahrenheit = (9 * celsius + 160)/5
println("$celsius º Celsius eh equivalente a $fahrenheit º Fahrenheit")
  }
}
}

--------------------------------------------------- FIM -------------------------------------------------------------

//37. Faça um programa na Linguagem Kotlin que efetue a leitura de 100 valores numéricos e apresente no final o total do somatório e a média dos valores lidos.

fun main(args: Array<String>) {
  var soma:Int
  var media:Int
  var n:Int

  soma = 0

  for (i in 1..100){
    print("Digite o $i º valor inteiro para soma: ")
    n = readLine().toString().toInt() 
    soma = soma + n 
  }

  media = soma / 100

println("A soma dos valores lidos é: $soma e a média é: $media")
}

--------------------------------------------------- FIM -------------------------------------------------------------

//38. Faça um programa na Linguagem Kotlin que receba 800 números e mostre os números divisíveis por 7 e 8.

fun main(args: Array<String>) {
  var n:Int
  var exibir:String
  exibir = " "

  for (i in 1..800){
    print("Digite o $i º valor inteiro para verificar se é divisível por 7 e por 8: ")
    n = readLine().toString().toInt() 
    if((n%7==0) && (n%8==0))
      exibir = exibir + n + " "
    }

println("Os numeros digitados que são divisíveis por 7 e 8 são : $exibir")
}

--------------------------------------------------- FIM -------------------------------------------------------------

//39. Faça um programa na Linguagem Kotlin que que receba 800 números e conte quantos números são pares e quantos são impares e mostre a quantidade de cada um.

fun main(args: Array<String>) {
  var par:Int
  var impar:Int
  var n:Int
  par = 0
  impar = 0

  for (i in 1..800){
    print("Digite o $i º valor inteiro para verificar se é par ou ímpar ")
    n = readLine().toString().toInt() 
    if(i%2==0)
      par = par + 1
    else
      impar = impar + 1   
    }

println("Foram digitados $par números pares e $impar números ímpares")
}

--------------------------------------------------- FIM -------------------------------------------------------------

//40. Faça um programa na Linguagem Kotlin que leia 100 valores inteiros, um de cada vez, e conte quantos dele estão em cada um dos intervalos e mostre a quantidade de cada um.
//[0, 25]
//[26, 50]
//[51, 75]
//[76, 100]

fun main(args: Array<String>) {
  var a25:Int
  var a50:Int
  var a75:Int
  var a100:Int
  var n:Int
  a25 = 0
  a50 = 0
  a75 = 0
  a100 = 0
  n = 0

  for (i in 1..100){
    println("Digite o $i º valor inteiro para verificar se está em um dos intervalos abaixo \n[0, 25] \n[26, 50] \n[51, 75] \n[76, 100]")
    n = readLine().toString().toInt() 
    if((n>=0) && (n<=25))
      a25 = a25 + 1
    if((n>=26) && (n<=50))
      a50 = a50 + 1  
    if((n>=51) && (n<=75))
      a75 = a75 + 1
    if((n>=76) && (n<=100)) 
      a100 = a100 + 1
    }
    println("Foram digitados $a25 de 0 até 25, $a50 números de 21 a 50, $a75 números de  51 até 75 e $a100 de números de 76 a 100")
}

--------------------------------------------------- FIM -------------------------------------------------------------

//41. Faça um programa na Linguagem Kotlin que mostre a soma acumulada de números pares e a média desses números, na faixa de 1 a 156.

fun main(args: Array<String>){
  var somaPar:Int
  var auxMed:Int
  var media:Int
  somaPar = 0
  auxMed = 0

  for (i in 1..156){
    if(i%2==0){
      somaPar = somaPar + i   
      auxMed = auxMed +1 }
  }
    media = somaPar/auxMed

  println("A somados números pares entre 1 e 156 é $somaPar e a média deles é $media")
}

--------------------------------------------------- FIM -------------------------------------------------------------

//42. Faça um programa na Linguagem Kotlin que leia 25 valores e mostre a quantidade de números que está na faixa de 25 a 34 e quantidade de números que estão fora desta faixa.

fun main(args: Array<String>){
  var ent25a34:Int
  var fora25a34:Int
  var n:Int
  ent25a34 = 0
  fora25a34 = 0

  for (i in 1..25){
    print("Digite o $i º número inteiro: ")
    n = readLine().toString().toInt()
    if((n>=25)&&(n<=34))
      ent25a34 = ent25a34 + 1 
    else    
      fora25a34 = fora25a34 + 1
  }
  println("Os números dentro do intervalo de 25 a 34 são $ent25a34 e os que estão fora são $fora25a34")
}

--------------------------------------------------- FIM -------------------------------------------------------------

//43. Faça um programa na Linguagem Kotlin que apresente no final o somatório dos valores pares existentes na faixa de 1 até 500.

fun main(args: Array<String>) {
  var soma:Int
  soma = 0

  for (i in 1..500){
    if (i%2 == 0)
    soma = soma + i 
  }

println("A soma dos valores pares entre 1 e 500 é $soma")
}
