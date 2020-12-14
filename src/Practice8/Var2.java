package Practice8;

import java.io.FileReader;
import java.io.IOException;

public class Var2 {
    public static void main(String [] args){
        try(FileReader reader = new FileReader("D:\\soft\\IntelliJ IDEA 2020.2.2\\PracFile\\note1.txt")) {
            // читаемпосимвольно
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        }
}
