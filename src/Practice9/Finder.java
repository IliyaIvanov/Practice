package Practice9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Finder {
    public static void sort(Comparable[] list) {
        List<Comparable> result = new ArrayList<>(list.length);
        for (Comparable c : list) {
            int i;
            for (i = 0; i < result.size(); i++) {
                if (result.get(i).compareTo(c) > 0)
                    break;
            }
            result.add(i, c);
        }
        for (int i = 0;i<list.length; i++){
            list[i] = result.get(i);
        }
    }
    public static void main(String[] args){
        Student[] students = {
                new Student("Иванов", 3),
                new Student("Петров", 5),
                new Student("Сидоров", 4),
        };
        sort(students);
        try (Scanner in = new Scanner(System.in)){
            System.out.println("Введите фамилию");
            String name = in.next();
            Student res = null;
            for (Student student : students){
                if (name.equals(student.getName())){
                    res = student;
                    break;
                }
            }
            if (res == null)
                throw new StudentNotFoundException();
            System.out.println(res);
        } catch (StudentNotFoundException e){
            System.out.println("Ошибка! Данный студент не найден");
        }
    }
}
