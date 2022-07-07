public class Main {
    public static void main(String[] args) {
        // Java büyük küçük harf duyarlı bir dildir
        int studentNumber = 10; // Camel casing
        System.out.println("Number of students: " + studentNumber);
        studentNumber = 12;
        System.out.println("Number of students: " + studentNumber);
        // Reusabilty : Tekrar tekrar kullanabilme
        String string = "Number of student: ";
        System.out.println(string + studentNumber); // Same output
        // Veriable: Değişkenler bellekte daha fazla yer ayırabilmek için aynı şeyleri tekrar tekrar yazmak yerine tek seferde yazabiliriz
        // Bu sayede bellek alanını daha iyi yönetmiş oluruz
        // Ayrıca kodun okunabilirliğini ve değişkenin değerinin değiştirilebilmesini kolaylaştırmış oluruz
        // Kısaca daha iyi bir kod yazmamızı sağlar
        // int -> tam sayı ifadeleri için
        // String -> text ifadeleri için

        /* DATA TYPES */
        // Java tip güvenli bir dildir. Verinin tipini bilmek ister

        /* Primitive Types (ilkel tipler)*/
        // Boolean  -> 1 byte
        // Char -> 2 byte
        // Byte -> 1 byte  -> -128 ile +127
        // Int -> 4 byte
        // Short int -> 2 byte
        // Long int -> 8 byte
        // Float -> 4 byte -> Ondalıklı sayı
        // Double -> 8 byte -> Ondalıklı sayı

        // Note: Veri tipleri seçilirken optimum alanı sağlamak için değer aralıklarımıza göre seçmemiz gerekir
        // Genellikle programcılar integer ve double kullanırlar. İhtiyaca göre diğerleri de kullanılabilir

        double number = 12.5;
        char character = 'A'; // Char tipi değişken ataması yaparken çift tırnak değil tek tırnak kullanmamız gerekir aksi halde hata verir
        boolean bool = true;
        boolean bool2 = false;
    }
}