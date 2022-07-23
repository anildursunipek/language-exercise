public class Main {
    public static void main(String[] args) {
        // Multi Thread
        // Calisan operasyonlarin is parcaciklarina ayrilarak ayni zamanli calistirilmasidir
        // Multi thread operasyonlarin calisma suresini hizlandirmaktadir
        // Operasyonlari parcalara bolerek sureyi kisaltir
        // Ancak tum operasyonlar mutli thread yapilamz single thread yapilması gerekenler vardir
        // Single thread'ler sirali islem gerektiren operasyonlarda gecerlidir
        // Web sitede yada mobil uygulamalarda mutli thread yapilarabilir
        // Ornegin kullaniciya birden fazla seyi ayni anda gostermek icin kullanilabilir
        // Stopwatch Example
        Stopwatch thread1 = new Stopwatch("thread1");
        Stopwatch thread2 = new Stopwatch("thread2");
        Stopwatch thread3 = new Stopwatch("thread3");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}