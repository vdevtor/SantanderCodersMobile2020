fun main() {
//    println( fatorial(5))
//    analisa3(45,88,2)
// println(analisaTexto("vitor2","vitor"))
// println(analisaNumPar(87))
// imprime100()
    analisa4NumerosInteiros(2,3,5,10)

}
//Função que calcule fatorial de um numero!

fun fatorial (num:Int): Int {
    if(num==0){
        return 1;
    }
    return num * fatorial(num-1);
}
// função que analisa tres numeros e retorna o maior

fun analisa3(num1: Int, num2 : Int, num3: Int){

    println("O ${maxOf(num1,num2,num3)} é o maior dos três")
}
// função que retorna um boolean dependendo da comparação da cadeia de strings


fun analisaTexto(cadeia1 : String, cadeia2 : String) :Boolean {
    var trueorfalse: Boolean = false
    trueorfalse = !cadeia1.equals(cadeia2)
    return trueorfalse
}

//Analisar numero inteiro, se par retornar true se impar retornar false

fun analisaNumPar(num: Int) : Boolean{
    var aux: Boolean = false
    var epar = num
    if(epar % 2 == 0) {
        aux = true
    }
    return aux
}
//6) Escrever um programa que exiba os primeiros 100 números positivos.


fun imprime100Positvos() {


    for (i: Int in 0..100 step 2) {
        println(i)

    }


//Programa imprimir 100 primeiros numeros inteiros positivos !

    fun imprime100() {


        for (i: Int in 1..100 step 2) {
            println(i)

        }

    }
}

//Escrever um código que deve analisar quatro números inteiros e, caso numA
//seja maior que numC e numD ou caso numB seja maior que numC e numD,
//retornar true, caso contrário, retornar false.

fun analisa4NumerosInteiros(numA :Int,  numB :Int,  numC: Int,  numD: Int){

    var numA = numA; var numB = numB; var numC = numC; var numD = numD

    when {
        numA > numC && numA > numD || numB > numC && numB > numD -> println("true")

        else -> println(false)



    }

}

