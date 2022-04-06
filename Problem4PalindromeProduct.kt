class Problem4PalindromeProduct {
}
fun Int.isPalindrome():Boolean{
    var pal:String = this.toString()
    return pal == pal.reversed()
}
fun main()
{
    val palList : ArrayList<Int> = ArrayList()
    for(i in 999 downTo 1)
    {
        for( j in 999 downTo 1)
        {
            var product = i*j
            if(product.isPalindrome())
                palList.add(product)
        }
    }
    println(palList.maxOrNull() ?: 0)
}