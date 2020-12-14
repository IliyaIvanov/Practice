package Practice9;

import java.util.Scanner;

public class INN {
    public static void main(String[] args){
        try (Scanner in = new Scanner(System.in)){
            System.out.println("Введите ИНН");
            String inn = in.next();
            if (inn.length()!=10)
                throw new IncorrectINNException();
            System.out.println("ИНН корректен");
        } catch (IncorrectINNException e){
            System.out.println("Ошибка! Введённый ИНН не корректен");
        }
    }
}
