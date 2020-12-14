package Practice7;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class DrinkQueue {
    public static void main(String[] args){
        Queue<Integer> p1= new ArrayDeque<>();
        Queue<Integer> p2= new ArrayDeque<>();

        inputStr(p1);
        inputStr(p2);
        for (int i=0; i<106; i++){
            if (p1.isEmpty()){
                System.out.println("second " + i);

                return;
            }
            else if (p2.isEmpty()){
                System.out.println("first " + i);
                return;
            }

            int card1 = p1.poll();
            int card2 = p2.poll();
            if (card1 == card2){
                p1.add(card1);
                p2.add(card2);
            } else if (card1 == 0 && card2 == 9) {
                p1.add(card1);
                p1.add(card2);
            } else if (card2 == 0 && card1 == 9) {
                p2.add(card1);
                p2.add(card2);

            }  else if (card1>card2) {
                p1.add(card1);
                p1.add(card2);

            }  else {
                p2.add(card1);
                p2.add(card2);
            }
        }
        System.out.println("botva");
    }
    private static void inputStr(Queue<Integer> p){
        Scanner in = new Scanner(System.in);

        for (int i=0; i<5; i++){
            int card = in.nextInt();
            p.offer(card);
        }
    }
}
