import javax.imageio.IIOException;
import java.io.FileReader;
import java.io.*;
import java.io.BufferedReader;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("student.txt"));
          String line;
         while((line =br.readLine())!= null){
            System.out.println(line);
        }
        br.close();
    }
}
