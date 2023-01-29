fun main() {
    println("Hier drucken wir jede Erhöhung von i aus:")
    var wirdInSchleifeGedruckt = 1
    while (wirdInSchleifeGedruckt <= 3) {
        println("i ist jetzt " + wirdInSchleifeGedruckt)
        wirdInSchleifeGedruckt++
    }

    println("Hier drucken wir nur das Endergebnis aus:")
    var wirdNachSchleifeGedruckt = 1
    while (wirdNachSchleifeGedruckt < 3) {
        wirdNachSchleifeGedruckt++
    }
    println(wirdNachSchleifeGedruckt)


    /* FRAGEN:
    * 1. Schaut mit dem Debugger nach, welchen Wert die Variable wirdInSchleifeGedruckt am Ende der Schleife hat.
    * Warum wird nicht dieser Wert ausgegeben?
    * ich glaube hat nicht gegeben weil er klein ist als 3 aber wenn ich Debug bei mir komm gar nichts .keine ahunmg welche wert komm
    *
    * 2. Inwiefern unterscheiden sich Schleife 1 und Schleife 2?
    *  println("i ist jetzt " + wirdInSchleifeGedruckt) das gibt 1bis 3
    * */

}