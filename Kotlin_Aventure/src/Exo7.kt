fun invocationArme(nomCast: String, typeArme: String){

    val score = lanceDES(1,20)
    var qualiteArme = ""

    if (score < 5){
        qualiteArme = "Commune"
    }

    else if (score < 10){
        qualiteArme = "Rare"
    }

    else if (score < 15){
        qualiteArme = "epic"
    }

    else if (score <15 && score < 20){
        qualiteArme = "Légendaire"
    }



    println("$nomCast invoque un(e) $typeArme de rarete $qualiteArme")
}

fun main(){
    invocationArme("Merlin","eppe")
}