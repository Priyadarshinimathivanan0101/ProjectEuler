class Problem1Multiples {
}
fun main()
{
    val list1 : List<Int> = (1..999).filter{it%3==0 || it%5==0}
    println(list1.sum())
}