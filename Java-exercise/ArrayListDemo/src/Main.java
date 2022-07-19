import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,3};
        // New ile yeni bir liste tanimlandiginda bellekten bir alan ayrilir.
        System.out.println(numbers[0]);
        numbers = new int[4];
        // Aynı degiskene tekrar new dersek eski degerler gecerliligini kaybeder ve default deger olan 0 atanir
        System.out.println(numbers[0]);
        ArrayList numbers2 = new ArrayList();
        numbers2.add(1); // arrayListName.add(eklenecekDeger) -> yeni bir deger ekleme
        numbers2.add(10);
        numbers2.add("Bursa");
        numbers2.add(30);
        numbers2.add(40);
        numbers2.add(50);
        numbers2.add("Ankara");

        // Array list obje tutabilir. int, string gibi farklı turde degiskenler bulunabilir
        System.out.println(numbers2.size());
        System.out.println(numbers2.get(2)); // get ile istenilen index'teki deger cagirilabilir ->  arrayListName.get(indexNumber)
        numbers2.set(0,100); // Set ile liste icindeki deger degistirilebilir -> arrayListName.set(degisecekIndex,yeniEleman)
        System.out.println(numbers2.get(0));
        System.out.println("0. index -> " + numbers2.get(0));
        numbers2.remove(0); // remove ile istedigimiz index'teki elemani silebiliriz
        System.out.println("After remove -> 0. index -> " + numbers2.get(0));

        for(int i=0;i<numbers2.size();i++){
            System.out.println(i + ".index -> " + numbers2.get(i));
        }

        // Normal diziler gibi de for dongusune alabiliriz
        System.out.println("----------------------");
        for(Object i:numbers2){
            System.out.println(numbers2.indexOf(i) +".index -> " + i);
        }
        numbers2.clear(); // Tum elemanlari silmeye yarar
    }
}