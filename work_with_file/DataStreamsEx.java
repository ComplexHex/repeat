package work_with_file;

import java.io.*;

public class DataStreamsEx {
    public static void main(String[] args) {
        try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("my_test.bin"));
             DataInputStream inputStream = new DataInputStream(new FileInputStream("my_test.bin"))) {
            outputStream.writeBoolean(true);
            outputStream.writeByte(5);
            outputStream.writeShort(6);
            outputStream.writeInt(565);

            System.out.println(inputStream.readBoolean());
            System.out.println(inputStream.readByte());
            System.out.println(inputStream.readShort());
            System.out.println(inputStream.readInt());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
