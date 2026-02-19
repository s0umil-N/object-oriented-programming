import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteReadExample_2 {
    public static void main(String[] args) {
        System.out.println("Content before writing:");
        try {
            FileInputStream fis = new FileInputStream("file.txt");
            int i;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
            fis.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e);
        }
        try {
            FileOutputStream fos = new FileOutputStream("file.txt", true);
            String data = " hello";
            fos.write(data.getBytes());
            fos.close();
            System.out.println("\n\nData written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e);
        }
        System.out.println("\nContent after writing:");
        try {
            FileInputStream fis = new FileInputStream("file.txt");
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
