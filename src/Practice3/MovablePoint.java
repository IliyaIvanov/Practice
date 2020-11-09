package Practice3;

public class MovablePoint implements Movable{

    int x, y, xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" + "x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + '}';
    }

    @Override
    public void moveUp() {
        y += 1;
        xSpeed = 0;
        ySpeed = 1;
    }

    @Override
    public void moveDown() {
        y -= 1;
        xSpeed = 0;
        ySpeed = -1;

    }

    @Override
    public void moveLeft() {
        x -= 1;
        xSpeed = -1;
        ySpeed = 0;

    }

    @Override
    public void moveRight() {
        x += 1;
        xSpeed = 1;
        ySpeed = 0;

    }
}
