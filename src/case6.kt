fun main(){
    var A = readLine()!!.toInt()
    var N = readLine()!!.toInt()
    when(N){
        1 ->{
            N = A/10
            println("В $A децеметрах $N метров")
        }
        2 ->{
            N = A*1000
            println("В $A километрах $N метров")
        }
        3 ->{
            N = A
            println("$N метров")
        }
        4 ->{
            N = A/1000
            println("В $A миллиметрах $N метров")
        }
        5 ->{
            N = A/100
            println("В $A сантиметрах $N метров")
        }
        else ->{

        }
    }
}