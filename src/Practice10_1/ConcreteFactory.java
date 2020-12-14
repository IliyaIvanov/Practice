package Practice10_1;

public class ConcreteFactory implements pack.ComplexAbstractFactory {
    @Override
    public pack.Complex createComplex(){
        return new pack.Complex();

    }

    @Override
    public pack.Complex createComplex(int real, int image) {
        return new pack.Complex(real,image);
    }
}
