class Problem10sumOfPrime {
}

fun main()
{
    val sum:Long = (2L..2000000L).filter{it.isPrime()}.sum()
    println(sum)
}