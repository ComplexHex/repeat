package work_with_file;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) throws IOException {
        String s = "Yesterday, all my trouble" +
                " inheritance - наследование\n" +
                "demand - запрос\n" +
                "retrieve - вернуть, получить\n" +
                "define - установить\n" +
                "dependency - зависимость\n" +
                "explicity - конкретно, прямо, четко\n";
        String s1 = "part 2";


        try (FileWriter writer = new FileWriter("text2.txt", true)) {

//            for (int i = 0; i < s.length(); i++) {
//                writer.write(s.charAt(i));
//            }
            writer.write(s);
            writer.write(s1);

            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
