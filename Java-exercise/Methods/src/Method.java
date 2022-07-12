public class Method {
    public static void main(String[] args) {
        // METHODS
        // !!! DON'T REPEAT YOURSELF
        // Fonksiyonlar ile kendimizi tekrar etmeyi engelliyoruz
        int[] array = {5,15,14,2,67,86,5,65,4,3,56,8,9,7,53,29};
        Method m = new Method(); // Yeni bir nesne olusturuldu
        m.findNumber(array,4); // Nesnenin olusturuldugu sınıftaki metod kullanildi
    }
    public static void findNumber(int []array,int number){
        boolean flag = false;
        for(int num : array){
            if(number == num){
                flag = true;
            }
        }
        if(flag){
            System.out.println("Number found");
        }
        else{
            System.out.println("Number not found");
        }
    }
}