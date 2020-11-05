//46. Faça um programa na Linguagem Kotlin que leia tenha 3 opções: 1 - Fatorial 2 - Quadradro de um número 3 - Volume de uma lata 4 – Sair do Programa
//Utilize os conceitos de funções em Kotlin *
 
fun main(args: Array<String>) {
var n:Int
var opc:Int
var altura:Double
var raio:Double
 
println("*****CALCULE*****\nEscolha uma das opções abaixo\n1 - Fatorial \n2 - Quadradro de um número \n3 - Volume de uma lata \n4 – Sair do Programa")
opc = readLine().toString().toInt()
 
while (opc <=3 && opc>=1){
 if (opc==1){
 print("Digite o número que deseja calcular o fatorial: ")
 n = readLine().toString().toInt()
 fatorial(n)}
 if (opc==2){
   print("Digite o número que deseja calcular o quadrado: ")
   n = readLine().toString().toInt()
   quadrado(n)}
   if (opc==3){
       println("Digite a altura da lata: ")
       altura = readLine().toString().toDouble()
       println("Digite o raio da lata: ")
       raio = readLine().toString().toDouble()
       volume(raio,altura)}
 
println("\n*****CALCULE*****\nEscolha uma das opções abaixo\n1 - Fatorial \n2 - Quadradro de um número \n3 - Volume de uma lata \n4 – Sair do Programa")
opc = readLine().toString().toInt()
 
}
println("O programa será encerrado")
}
 
fun fatorial(num:Int){
 var fat:Int
 fat = 1
 for (i in 1..num) {
 fat = fat * i;
}
return println("O fatorial de $num digitado eh: $fat")
}
 
fun quadrado(num:Int): Unit{
 var auxNum:Int
 auxNum = num * num
 return println ("O quadrado do número digitado é: $auxNum")
}
 
fun volume(raio:Double,altura:Double){
var volume:Double
var auxRaio:Double
auxRaio = raio * raio
volume = 3.14159 * auxRaio * altura
println("O volume da lata de oleo eh: $volume")
}
