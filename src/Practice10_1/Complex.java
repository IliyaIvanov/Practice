package Practice10_1;

public class Complex {
    private int real, image;

    public Complex(int real, int image){
        this.real=real;
        this.image=image;
    }

    public Complex() {

    }

    public void setReal(int real) {
        this.real = real;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getReal(){
        return real;
    }
    public int getImage(){
        return image;
    }

}
