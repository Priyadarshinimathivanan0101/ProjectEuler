class Problem7NthPrime {
}
fun Int.isPrime():Boolean
{
    for (i in 2..this / 2) {
        if (this % i == 0)
            return false
    }
    return true
}
fun main()
{
    var count:Int =0
    var prime:Int =0
    var number : Int =2
    val limit = 10001
    while(count != limit)
    {
        if(number.isPrime()) {
            prime = number
            count++
        }
        number++
    }
    println(prime)
}