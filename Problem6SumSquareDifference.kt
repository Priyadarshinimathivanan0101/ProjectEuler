class SumSquareDifference {
    fun sumOfSquare():Int{
        var sum:Int =0
        for(number in 1..100)
        {
            sum += (number*number)
        }
        return sum
    }
    fun squareOfSum():Int{
        var product :Int = (1..100).sum() * (1..100).sum()
        return product
    }
}

fun main()
{
    val sumSquareDifference = SumSquareDifference()
    println(sumSquareDifference.squareOfSum() - sumSquareDifference.sumOfSquare())
}
