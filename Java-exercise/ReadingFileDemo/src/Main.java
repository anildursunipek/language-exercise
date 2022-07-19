import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Java dosya islemlerinde error handling'i zorunlu kilmaktadir
        // Bu nedenle FileNOtFoundException hatasini catch blogunun icine alarak dosya okunamadiginda yada acilamadiginda catch bologunun calismasini sagliyoruz
        // Dosya icin dizin adresini kopyaladiktan sonra BufferedReader class'indan bir obje olustururarak new FileReader(path)) parametreleri ile dosyayi aciyoruz
        // Finaly kisminda ne olursa olsun islem bittikten sonra dosyayi kapama islemini yapmamiz gerekiyor
        // Bu nedenle try icinde degilde objeyi blok disinda olusturuyoruz. 2 blogunda kullanabilmesi icin
        // reader.close() yaptigimizda yine error handling yapmamiz gerekiyor
        BufferedReader reader = null;
        try { // path'de \\ çift back slash olmasinin sebebi java'nin \n \m gibi built in komutlarinin olmasidir
            reader = new BufferedReader(new FileReader("C:\\Users\\fb-du\\Desktop\\Github\\language-exercise\\Java-exercise\\ReadingFileDemo\\src\\numbers.txt"));
            // Dosya okuma islemleri satir satir olmaktadir
            String line = null;
            int total = 0;
            while((line = reader.readLine()) != null){
                total += Integer.valueOf(line); // Sayilari integer'a dondurur
            }
            System.out.println("Total: " + total);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}