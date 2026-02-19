import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MergeFiles {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("file.txt");
            FileOutputStream fos = new FileOutputStream("text_2.txt", true); 

            int i;
            while ((i = fis.read()) != -1) {
                fos.write(i);   
            }

            fis.close();
            fos.close();

            System.out.println("Data appended successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
        System.out.println("\nappended data");
        try {
            FileInputStream fis = new FileInputStream("text_2.txt");
            int i;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
            fis.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e);
        }
    }
}
