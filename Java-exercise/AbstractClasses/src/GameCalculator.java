public abstract class GameCalculator {
    public abstract void calculate();
    /*Abstract sinifin atlindaki abstract metodlar miras alan siniflar icin override edilmek zorundandir.
    * Ancak abstract siniflarda abstract metod bulunmayabilir. Normal metodlar override edilmek zorunda degil
    * oldugu gibi kullaniliabilirler.*/
    // Example
    public void gameOver(){
        System.out.println("Game-Over");
    }
}
