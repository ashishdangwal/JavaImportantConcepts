import java.io.*;
public class DataOutputStreamExample {
    public static void main(String[] args) throws IOException {
        FileOutputStream file = new FileOutputStream("C:\\JavaPractice\\testout.txt");
        DataOutputStream data = new DataOutputStream(file);
        data.writeInt(65);
        data.flush();
        data.close();
        System.out.println("Succcess...");
    }
}