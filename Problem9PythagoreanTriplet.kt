class Problem9PythagoreanTriplet {
}
fun main()
{
    var pro :Int =1
    for(a in 1..1000)
    {
        for(b in 1..1000)
        {
            for(c in 1..1000)
            {
                if(((a*a)+(b*b) == (c*c))&& (a+b+c)==1000) {
                    println("a = $a  b = $b  c = $c")
                    pro = a * b * c
                }
            }
        }
    }
    println(pro)
}