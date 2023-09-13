import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)throws FileNotFoundException {
        File file = new File("C:\\Users\\oztur\\IdeaProjects\\Files-Working\\src\\students.txt");

        creatFile();
        getFileInf();
        fileWriter();
        readFile();
    }

    public static void creatFile() {

        File file = new File("C:\\Users\\oztur\\IdeaProjects\\Files-Working\\src\\students.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("Dosya Oluşturuldu");
            } else {
                System.out.println("Bu Dosya Zaten Var");

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void getFileInf() {
        File file = new File("C:\\Users\\oztur\\IdeaProjects\\Files-Working\\src\\students.txt");

        if (file.exists()) {
            System.out.println("Dosya İsmi: " + file.getName());
            System.out.println("Dosya Yolu: " + file.getAbsolutePath());
            System.out.println("Dosya Yazılabilir mi: " + file.canWrite());
            System.out.println("Dosya Okunabilir mi: " + file.canRead());
            System.out.println("Dosya boyutu: " + file.length());


        }
    }

    public static void readFile() {
        File file = new File("C:\\Users\\oztur\\IdeaProjects\\Files-Working\\src\\students.txt");

        try {
            Scanner read = new Scanner(file);
            while (read.hasNextLine()){
                String line = read.nextLine();
                System.out.println(line);
            }
            read.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);

        }
    }

    public static void fileWriter(){
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\oztur\\IdeaProjects\\Files-Working\\src\\students.txt", true));
            bufferedWriter.newLine();
            bufferedWriter.write("Ayşe");
            System.out.println("Dosyaya Yazıldı..");
            bufferedWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}