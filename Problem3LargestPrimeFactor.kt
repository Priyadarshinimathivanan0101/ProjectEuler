import kotlin. math. roundToInt
class Problem3LargestPrimeFactor {
}
fun Long.isPrime():Boolean
{
    for (i in 2..this / 2) {

        if (this % i == 0.toLong())
            return false
    }
    return true
    println("This returns true") // this is unused code
}
fun LargestPrimeFactor(number:Long): Long{
    var largePrime:Long = 0
    for(i in 3L..10000L step 2)
    {
        if(number%i == 0.toLong() && i.isPrime())
            largePrime =i
    }
    return largePrime
}
fun main()
{
    var number:Long = 600851475143
    println(LargestPrimeFactor(number))
}