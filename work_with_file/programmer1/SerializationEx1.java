package work_with_file.programmer1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializationEx1 {
    public static void main(String[] args) {
        List<String> employees = new ArrayList<>();
        employees.add("Awr");
        employees.add("Niz");
        employees.add("Mof");

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("employees1.bin"));
        ) {
            outputStream.writeObject(employees);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
