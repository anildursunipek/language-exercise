public class Main {
    public static void main(String[] args) {
        GameCalculator gameCalculator = new WomanGameCalculator();
        /*Referans tipinde oldugu icin parametre olarak abstract sinif girilen yerlerde diger mirasci
        * siniflarida kullanabiliriz.*/
        // Abstract siniflar new'lenemez. New islemi yapilsa bile abstract metodlari override etmemiz gerekir
        // Bu da iyi bir kod ornegi degildir
        gameCalculator.calculate();
        gameCalculator.gameOver();
    }
}