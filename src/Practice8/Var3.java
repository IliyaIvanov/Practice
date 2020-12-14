package Practice8;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Var3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        try(FileWriter writer = new
                FileWriter("D:\\soft\\IntelliJ IDEA 2020.2.2\\PracFile\\note1.txt", false))
        {
            // запись всей строки
            for(;;){
                String str = in.next();
                if(str.equals("end"))
                    break;
                writer.write(str);
                //writer.append(str);
                writer.append('\n');
            }
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        in.close();
    }
}
