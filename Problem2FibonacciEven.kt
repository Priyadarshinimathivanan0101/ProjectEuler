class Problem2FibonacciEven {
}
fun main()
{
    var esum=0
    var t1 = 0
    var t2 = 1
    while(t1 <= 4000000)
    {
        if(t1%2==0)
            esum = esum+t1
        val sum = t1+ t2
        t1 = t2
        t2 = sum
    }
    print(esum)
}