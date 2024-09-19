fun boirePotiob(nomCible: String, pvCible: Int , pvMax: Int,puissancePotion: Int){

    var exPV = pvMax

    var pvTotal = puissancePotion +  pvCible

    if (pvTotal > pvMax){
         pvTotal = pvMax
    }

    val pvrecup = pvTotal - pvCible

    println("$nomCible boit une potion et récupere $pvrecup PV")
}

fun main(){
    boirePotiob("Peter",8,20,6)
    boirePotiob("Peter",18,20,6)
}