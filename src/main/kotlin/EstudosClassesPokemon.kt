class Pokemon (var nome: String, var tipo: String, var vida: Int, var ataque: Int, var defesa: Int){
    //ar nome = ""
    //var tipo = ""
    //var vida = 10
    //var ataque = 2

   fun ataque(ataque: Int, pokemonatacado: Pokemon){

       var pokemon1 = Pokemon("Charmander", "Fogo", 20, 4,2)
       var pokemon2 = Pokemon ("Bubassauro", "Planta", 22, 3, 1)

       println("OH MEU DEUS, " + pokemon1.nome + " está atacando " + pokemon2.nome + "com sua força total." )
       println("${pokemon2.nome} possuia ${pokemonatacado.vida} pontos de vida.")
       pokemonatacado.defesa -= ataque - pokemonatacado.vida //vida = vida - ataque
       println("Após esse ataque, ${pokemon2.nome} ficou com ${pokemonatacado.defesa} pontos de via.")
   }


}

fun main () {

    var pokemon1 = Pokemon("Charmander", "Fogo", 20, 4, 2)
    var pokemon2 = Pokemon ("Bubassauro", "Planta", 22, 3, 1)

    pokemon1.ataque(pokemon1.ataque, pokemon2)



}