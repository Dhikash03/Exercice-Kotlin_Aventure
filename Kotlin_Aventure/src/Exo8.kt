import kotlin.math.max

fun missileMagique(
    nomCaster: String,
    nomCible: String,
    scoreAtqCaster: Int,
    scoreDefCaster: Int,
    pvCible: Int
) {


    var nouveauPV = pvCible

    for (i in 0..(scoreAtqCaster/2))
    {
        var missiledegat= lanceDES(1,6)
        missiledegat-= scoreDefCaster
        missiledegat= max(0,missiledegat)

        nouveauPV=nouveauPV-missiledegat
        nouveauPV = max(0,nouveauPV)

        println("$nomCaster lance une missile magique et inflige $missiledegat points de dégâts à $nomCible")


    }



}

fun main(){
    missileMagique("Merlin", "Gandalf",12,2,15)
}