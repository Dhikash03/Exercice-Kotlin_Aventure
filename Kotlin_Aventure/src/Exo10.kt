fun affichelinventaire(nomPerso : String, inventaire: MutableList<String>){

    println("Inventaire de $nomPerso : ")

    println()
var i=1
    for (element in inventaire){

        println("$i=> $element")
        i++
    }
}

fun main(){
    val liste = mutableListOf("Hache","potion","eppe legendaire", "baton magique")
    affichelinventaire("Gandalf", liste )
}