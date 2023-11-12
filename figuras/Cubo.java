package figuras;

public class Cubo implements figura {

    protected double a;

    public Cubo(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public double getArea() {
        return 6 * a * a;
    }

    @Override
    public double getVolumen() {
        return a * a * a ;
    }
    @Override
    public String toString() {
        return String.format("Cubo:"
            + "\n\tEl lado del cubo es: "+ a
            + "\n\tEl área del cubo es: " +getArea()
            + "\n\tEl volumen del cubo es: " +getVolumen());
    }
}
