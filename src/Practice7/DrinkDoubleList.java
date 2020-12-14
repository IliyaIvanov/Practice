package Practice7;

import processing.data.DoubleList;

import java.util.Scanner;

public class DrinkDoubleList {
    public static void main(String[] args){
        DoubleList p1= new DoubleList();
        DoubleList p2= new DoubleList();

        inputStr(p1);
        inputStr(p2);
        for (int i=0; i<106; i++){
            if (p1.size() == 0){
                System.out.println("second " + i);

                return;
            }
            else if (p2.size() == 0){
                System.out.println("first " + i);
                return;
            }

            int card1 = (int)p1.pop();
            int card2 = (int)p2.pop();
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
    private static void inputStr(DoubleList p){
        Scanner in = new Scanner(System.in);

        for (int i=0; i<5; i++){
            int card = in.nextInt();
            p.add(0, card);
        }
    }
}
