/*las variables constantes van fuera del main porque son constantes= lo que significa que  Que tiene un valor fijo en un cálculo o proceso matemático.*/
/*poner primero el tipo de variable y despues variable*/
const val PI=3.1416
fun main() 
{
    /*variable = Que varía o puede variar*/
    /*en este caso se esta devlaran la bvariable numero1*/
    /*en este caso al introduir una f en el fianl se convierte en una variable flotante*/
    val numero1=41.5f
    /*en esta parte se imprime*/
    println(numero1)
    val operacion=PI*numero1*numero1
    /*float se susa para decimales cortos*/
    /*double se usa para decimales grandes*/
    println ("El perímetro del círculo es: $operacion siendo resultado nuestra variable perímetro" )
}