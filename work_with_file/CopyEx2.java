package work_with_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyEx2 {
    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream("C:\\Users\\IMAST\\Desktop\\12 4.jpg");
             FileOutputStream fileOutputStream = new FileOutputStream("12 4.jpg")) {

            int charachter;

            while ((charachter = inputStream.read()) != -1) {
                fileOutputStream.write(charachter);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
