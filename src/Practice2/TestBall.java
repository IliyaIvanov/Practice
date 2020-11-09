package Practice2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball1 = new Ball(101, 102);
        System.out.println(ball1);
        ball1.setXY(1,1);
        System.out.println(ball1);
        ball1.move(34, 1);
        System.out.println(ball1);
    }
}