package Practice7;

import java.util.Scanner;
import java.util.Stack;

public class DrinkStack {
    public static void main(String[] args){
        Stack<Integer> p1= new Stack<>();
        Stack<Integer> p2= new Stack<>();

        inputStr(p1);
        inputStr(p2);
        for (int i=0; i<106; i++){
            if (p1.empty()){
                System.out.println("second " + i);

                return;
            }
            else if (p2.empty()){
                System.out.println("first " + i);
                return;
            }

        int card1 = p1.pop();
        int card2 = p2.pop();
        if (card1 == card2){
            p1.add(0, card1);
            p2.add(0, card2);
        } else if (card1 == 0 && card2 == 9) {
            p1.add(0, card1);
            p1.add(0, card2);
        } else if (card2 == 0 && card1 == 9) {
            p2.add(0, card1);
            p2.add(0, card2);

        }  else if (card1>card2) {
            p1.add(0, card1);
            p1.add(0, card2);

        }  else {
            p2.add(0, card1);
            p2.add(0, card2);
        }
        }
        System.out.println("botva");
    }
    private static void inputStr(Stack<Integer> p){
        Scanner in = new Scanner(System.in);

        for (int i=0; i<5; i++){
            int card = in.nextInt();
            p.add(0, card);
        }
    }
}
