import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        createFile();
        getFileİnfo();
        readFile();
        writeFile();
        readFile();
    }
    public static void createFile(){
        File testFile = new File("C:\\Users\\fb-du\\Desktop\\Github\\language-exercise\\Java-exercise\\testFiles\\testFile.txt");
        try{
            if(testFile.createNewFile()){
                System.out.println("Created new file");
            }else{
                System.out.println("File already exist");
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
    public static void getFileİnfo(){
        File testFile = new File("C:\\Users\\fb-du\\Desktop\\Github\\language-exercise\\Java-exercise\\testFiles\\testFile.txt");
        if(testFile.exists()){
            System.out.println("File path: " + testFile.getAbsolutePath());
            System.out.println("File name: " + testFile.getName());
            System.out.println("File is writable: " + testFile.canWrite());
            System.out.println("File is readable: " + testFile.canRead());
        }else{
            System.out.println("File not found");
        }
    }
    public static void readFile(){
        File testFile = new File("C:\\Users\\fb-du\\Desktop\\Github\\language-exercise\\Java-exercise\\testFiles\\testFile.txt");
        try {
            Scanner reader = new Scanner(testFile);
            while(reader.hasNextLine()){
                System.out.println(reader.nextLine());
            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static void writeFile(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\fb-du\\Desktop\\Github\\language-exercise\\Java-exercise\\testFiles\\testFile.txt",true));
            // Parametre olarak true girmezsek dosya icerigine sifirdan olusturarak ekleme yapar
            // Eklemek istedigimiz icerigi yeni satira eklemek icin \n yada writer.newLine() kullanmamiz gerekir
            writer.write("\nWriter!!");
            writer.write("\nWriter!!!!");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}