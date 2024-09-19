fun attaque(pv: Int, defenseCible : Int, degatArme: Int, nomAttaquant: String, nomCible: String ){

    var score = degatArme - defenseCible

    if (score <= 0){
        score = 0
    }
    var pvRestant= pv - score

    pvRestant = pv - pvRestant



    println("$nomAttaquant attaque $nomCible pour $degatArme de dégats ")

    println("Il reste à $nomCible $pvRestant PV")




}


fun main(){

    attaque(15,3,4,"Thor","Peter")
    attaque(5,9,2,"Paul","Harry")

}









