package lesson3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainApp {

    public static void main(String[] args) {

        try {
            System.out.println(1);
            int x = 10 / 0;
            System.out.println(2);
        } catch (ArithmeticException e) {
            System.out.println("Catch AE");

        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.println(3);

        try {
            throw new RuntimeException("Runtime Exception");
        } catch (RuntimeException e) {
            System.out.println("RE");
        }
    }

    public static int sqrt(int n) {
        if (n < 0) {
            throw new ArithmeticException("not -");
        }
        return n / 2;
    }

    public static int doo() {
        try {
            return 1;
        } finally {
            return 2;
        }
    }

    FileOutputStream outputStream;

    {
        try {
            outputStream = new FileOutputStream("asdf");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (outputStream != null)
                    outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try(FileOutputStream fileOutputStream1 = new FileOutputStream("asdf")){

        }catch (IOException e){

        }
    }


}
