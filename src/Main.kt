//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val eclairage = AmpouleIncandescente();
    val led = AmpouleLed()
    val tube = AmpouleTube()
    /**
     * Cycles d'éclairage et d'extinction d'une ampoule
     */
    var nbCycles = 0;
    do{
        eclairage.allumer();
        while(eclairage.etat() > 0 ){
            eclairage.diminuer();
        }
        println(eclairage.toString());
        nbCycles ++;
    }
    while (nbCycles < 1000 && eclairage.etat() != -1);
    println("nombre de cycles "+nbCycles);

    do{
        led.allumer();
        while(led.etat() > 0 ){
            led.diminuer();
        }
        println(led.toString());
        nbCycles ++;
    }
    while (nbCycles < 1000 && led.etat() != -1);
    println("nombre de cycles "+nbCycles);

    do{
        tube.allumer();
        while(tube.etat() > 0 ){
            tube.diminuer();
        }
        println(tube.toString());
        nbCycles ++;
    }
    while (nbCycles < 1000 && tube.etat() != -1);
    println("nombre de cycles "+nbCycles);
}