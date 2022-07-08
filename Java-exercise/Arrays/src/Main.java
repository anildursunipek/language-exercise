public class Main {
    public static void main(String[] args) {
        // Arrays
        // Tekrar tekrar aynı tip tanımı yapmak yerine tek bir degisken adı altında kayıt altında tutabiliriz
        // Bir sınıftaki ogrecileri ayri ayri tutmak yerine tek bir dizi icerisinde tutabiliriz
        String[] students = new String[3]; // Sola tip tanımını sag tarafa kac elemandan olusucagini tanımliyoruz
        students[0] = "Mike Ross";
        students[1] = "Harvey";
        students[2] = "Jessica";
        for (int i = 0; i < students.length; i++) { // arrayName.lenght : Dizi uzunlugunu belirtir
            System.out.println(students[i]);
        }
        System.out.println("-------------------");
        // Eger belirledigimiz eleman sayısının ustune cikarsak 'ArrayIndexOutOfBoundsException' hatasi aliriz
        // Yada henuz icerigi doldurulmamis bir dizi elamanini yazdirirsak null deger dondurecektir

        // Diziler icin farkli bir for kullanimi -> Genellikle bu yontem kullanilir
        for (String student : students) { // for(degiskenTip degiskeninDonguIcindekiIsmi:dizininAdi){islemler}
            System.out.println(student);
        }
        // Recap Demo
        // Diziler Double[] myList = new Double[arrayLength] -> seklinde yazidligi gibi farkli bir sekildede yazilabilir
        double[] myList = {1.2, 1.3, 4.3, 5.6};
        double total = 0;
        double max = myList[0];
        for (double number : myList) {
            System.out.println(number);
            total += number;
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Total: " + total + " Max: " + max);
        System.out.println("Multi-dimensional Arrays");
        // Multi-dimensional Arrays
        String[][] cities = new String[3][3]; // 3 e 3'lük bir cok boyutlu bir dizi -> 3 Satir 3 Sutun
        cities[0][0] = "Istanbul";
        cities[0][1] = "Bursa";
        cities[0][2] = "Bilecik";
        cities[1][0] = "Ankara";
        cities[1][1] = "Konya";
        cities[1][2] = "Aksaray";
        cities[2][0] = "Diyarbakir";
        cities[2][1] = "Sanliurfa";
        cities[2][2] = "Gaziantep";
        for(int i=0;i<3;i++){
            System.out.println("Region-" + (i+1));
            System.out.println("------------------");
            for(int j=0;j<3;j++){
                System.out.println(cities[i][j]);
            }
        }

    }
}