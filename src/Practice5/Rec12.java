package Practice5;

import java.util.Scanner;

public class Rec12 {
    public static void recursion() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // Базовый случай
        if (n > 0) {
            // Шаг рекурсии / рекурсивное условие
            if (n % 2 == 1) {
                System.out.println(n);
                recursion();
            } else {
                recursion();
            }
        }
    }
    public static void main(String[] args) {
        recursion(); // вызов рекурсивной функции
    }
}
