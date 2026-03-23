import java.io.File;
import java.io.FileReader;

public class FileNotFoundDemo {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt");
            FileReader fr = new FileReader(file);
            fr.close();
        } catch (Exception e) {
            System.out.println("File doesn`t exist!");
            System.out.println(e.getMessage());
        }
    }
}
