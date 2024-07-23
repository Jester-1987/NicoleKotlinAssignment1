fun main() {

// adding 1 + 1 + 1 + 1 + 1 (not efficient, but it works)
    fun add(a: Int, b: Int, c: Int, d: Int, e: Int): Int {
        return a + b + c + d + e
}
    val function = ::add
        function(1,1,1,1,1)

    fun printResult(function: (Int, Int, Int, Int, Int) -> Int, a: Int, b:Int, c: Int, d: Int, e: Int) {
        val result = function(a, b, c, d, e)
        print(result)
    }
    printResult(::add, 1,1,1,1,1)

    var sum = 1

    while (true) {
        sum = sum + (sum + 1)
        if (sum >= 5) {
            break
        }
    }
    println(sum) // prints 7 not 5
}


