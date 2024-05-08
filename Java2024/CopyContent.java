
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CopyContent {
    public static void main(String[] args) throws IOException {
        File file = new File("C:/Users/Prakash/Documents/rcb.txt");
        FileInputStream inputStream = new FileInputStream(file);

        Scanner sc = new Scanner(inputStream);
        StringBuffer buffer = new StringBuffer();
        while (sc.hasNext()) {
            buffer.append(" " + sc.nextLine());
            System.out.println("Contents of the file:" + buffer);
        }
        File dest = new File("C:/Users/Prakash/Documents/preetam.txt");
        FileWriter writer = new FileWriter(dest);
        writer.write(buffer.toString());
        writer.close();
        System.out.println("File copied successfully........");

    }

}
