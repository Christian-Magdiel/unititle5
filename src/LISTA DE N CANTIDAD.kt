fun main(args: Array<String>) {

    var Lista = MutableList(10){
        (1..10).random()
    }
    Lista.forEach(){

        var i= 1
        println("En la posicion $i hay un $it")
    }
    fun Buscar ( cont:Int , valor: Int ){

        var limite=10

        if (cont > 0){
            if (cont == limite){
                println("5 en la Posicion $cont ")
            }
            Buscar(cont - 1 , Lista[cont -1])
        }
        else {
            if (cont == 1){
                println("")
            }
        }
    }
    var contador = 9
    var valor= Lista[contador]
    Buscar(contador, valor)
}
