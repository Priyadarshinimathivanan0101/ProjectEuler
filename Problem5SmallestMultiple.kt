class Problem5SmallestMultiple {
}
fun Int.divisibleByAll():Boolean{
    return (this%20 ==0 &&
            this%19 == 0 &&
            this%18 == 0 &&
            this%17 == 0 &&
            this%16 == 0 &&
            this%15 == 0 &&
            this%14 == 0 &&
            this%13 == 0 &&
            this%12 == 0 &&
            this%11 == 0)
}
fun main()
{
    var n:Int =1
    while(!n.divisibleByAll())
        n++

    println(n)
}