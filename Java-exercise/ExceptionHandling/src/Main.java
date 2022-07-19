public class Main {
    public static void main(String[] args) {
        // Derlenemeyen hatalar'a handling yapilamaz
        // Example:
        /*String city = "New York";
        int num = city;*/
        // java: incompatible types: java.lang.String cannot be converted to int
        // Bu ornekte derleme islemine bile gecilemeden hata verdi

        try{ // Blok içindeki yazilan kod çalistirilir ve hata alırsa catch bloguda calistirilir
            int[] numbers = new int[]{1,2,3};
            System.out.println(numbers[5]);
        // Hatalari yakalamak icin Exception excepiton yerine ayri ayri bloklarda da hata gore islem uygulayabiliriz
        // Bunun bir onregi kullanicinin karsilastigi hatalara gore kullanici yonlendirmektir
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println(exception);
        }catch (StringIndexOutOfBoundsException exception){
            System.out.println(exception);
        }catch (Exception exception){ // Eger hangi hata oldugunu bulamiyorsak bu sekilde yakalayabiliriz
            System.out.println("Error logged! -> " + exception);
        }finally { // Her 2 durumda da calisan bir bloktur
            // Gercek hayat kullanimina ornek verebilirsek database calistirilirken en sonunda islemler bittikten sonra finally blogu kullanilarak kapatma islemi yapilir
            System.out.println("'Finally' Always works...");
        }
        // Java'daki Hatalar
        /*-> Java'da hatalar ikiye ayrilir . 1-Exceptions 2-Errors
        * -> Errors: Bizim müdahale edemedigimiz hatalardir
        * -> Exception: Uygulamamizda yaptigimiz hatalardir
        * -> Exception'lar throwable isimli nesneden inherit edilirler.
        * -> Try-catch blogu ile kontrol altina alinabilir
        * -> RuntimeException , IOExcepiton , SQLException , AWTException
        * -> Excepiton'larin hepsi temel bir excepiton'dan inherit edilir*/
    }
}