fun calculDegatArme(nbDes: Int, nbFacedes: Int,BonusArme: Int, CoupCritique: Int, multiCritique: Int): Int{

    var totalDes = lanceDES(nbDes,nbFacedes)

    if (totalDes > CoupCritique){
        totalDes * CoupCritique
    }

    totalDes+= BonusArme

    if (totalDes < 0)
        totalDes = 0

    return totalDes
}


fun main(){

    println(calculDegatArme(1,6,2,6,2))
    println(calculDegatArme(1,8,3,5,3))
    println(calculDegatArme(2,4,2,10,2))
}