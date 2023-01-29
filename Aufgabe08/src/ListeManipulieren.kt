fun main() {
    var list: MutableList<Int> = mutableListOf(0, 1, 2, 3, 4, 5)


    //Implementiere unter diesem Kommentar die in der Aufgabe beschriebene while-Schleife

    var i = 0


    while (i < (list.size)) {

        //println(list[i.and(2)])
        //println(list[i.rem(2)])

        list[i] = list[i] * 2
        print(list)
        i++

    }
}

// hier komm auf die konsola aus [0, 2, 4, 6, 8, 10] aber ich verstehe nicht warum komm die adere auch [0, 1, 2, 3, 4, 5] wo ich das fähler machen
//komm alle die ader aber das nicht ich weiss nicht mehr .ich habe kopfschmerzen .ich errinen nicht aus den intex etwas adere

//fun main() {
//    var list: MutableList<Int> = mutableListOf(0, 1, 2, 3, 4, 5)
//    var i = 0
//    while (i < list.size) {
//        list[i] = list[i] * 2
//        i++
//    }
//    println(list)
//}