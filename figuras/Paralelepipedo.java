package figuras;

public class Paralelepipedo extends Cubo implements figura {

    private double b;
    private double h;

    public Paralelepipedo(double a, double b, double h) {
        super(a);
        this.b = b;
        this.h = h;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
    
    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public void setA(double a) {
        super.setA(a);
    }

    @Override
    public double getA() {
        return super.getA();
    }

    @Override
    public double getVolumen() {
        return a * b * h;
    }

    @Override
    public double getArea() {
        return 2 * (a * b + b * h + a * h);
    }
    @Override
    public String toString() {
        return String.format("Paralelepipedo:"
            + "\n\tEl 1er lado del paralelepipedo es : "+ a
            + "\n\tEl 2do lado del paralelepipedo es: "+ b
            + "\n\tEl 3er lado del paralelepipedo es: "+ h
            + "\n\tEl área del paralelepipedo es: " +getArea()
            + "\n\tEl volumen del paralelepipedo es: " +getVolumen());
    }
}