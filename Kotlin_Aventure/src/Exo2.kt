fun lanceDES(nbDes: Int, nbFacedes: Int) : Int{

    val total = (nbDes..nbDes*nbFacedes).random()

    return total

}




fun main(){

    println(lanceDES(2,6))
}