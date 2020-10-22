fun main(){
    var A = readLine()!!.toInt()
    var B = readLine()!!.toInt()
    println("1: A+B")
    println("2: A-B")
    println("3: A*B")
    println("4: A/B")
    var N = readLine()!!.toInt()
    when(N){
        1 ->{
            N = A+B
            println("A+B = $N")
        }
        2 ->{
            N = A-B
            println("A-B = $N")
        }
        3 ->{
            N = A*B
            println("A*B = $N")
        }
        4 ->{
            N = A/B
            println("A/B = $N")
        }
        else ->{
            println("Совсем дебил чтоле, не видишь, тут всего 4 варианта, даун")
        }
    }
}