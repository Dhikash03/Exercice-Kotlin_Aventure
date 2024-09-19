fun soins(nomCaster: String, atqCast: Int, pvCible: Int, pvMax: Int, mortVivante: Boolean){

    var scoreSoin = atqCast/2

    if (mortVivante == true){
        var degat = pvCible - scoreSoin

        if (degat < 0){

             degat = 0


        }
        println("$nomCaster à infligé $degat dégat à la cible ")

    }

    else{

        var nouveauPv= pvCible + scoreSoin

        if (nouveauPv > 0){
            nouveauPv = 0


        }
        println("$nomCaster à récuperer $nouveauPv ")
    }
}

fun main(){
    soins("Merlin",10,15,20,true)
}