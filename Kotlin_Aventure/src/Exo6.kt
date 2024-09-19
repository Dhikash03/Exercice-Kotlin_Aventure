fun bouleDeFeu(
    nomCaster: String,
    nomCible: String,
    scoreAtqCaster: Int,
    scoreDefCaster: Int,
    pvCible: Int
) {

    val exPV = pvCible
    val degatcast= lanceDES(scoreAtqCaster/3,6)
    var degatFinal= (degatcast - scoreDefCaster)

    if (degatFinal<=0){
        degatFinal=0
    }
    var pvRestantCible = pvCible - degatFinal

    if (pvRestantCible < 0){

        pvRestantCible = 0
    }

    var degat = exPV - pvRestantCible

    println("$nomCaster lance une boule de feu et inflige $degat point de degat à $nomCible ")

}

fun main(){
    bouleDeFeu("Merlin","Gandalf",10,3,30)
}