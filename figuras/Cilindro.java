package figuras;

public class Cilindro extends Esfera implements figura {

    private double h;

    public Cilindro(double r, double h) {
        super(r);
        this.h = h;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double getVolumen() {
        return Math.PI * Math.pow(r, 2) * h;
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * r * (r + h);
    }
    @Override
    public String toString() {
        return String.format("Cilindro:"
            + "\n\tEl radio del cilindro es: "+ r
            + "\n\tLa altura del cilindro es: "+ h    
            + "\n\tEl área del cilindro es: " +getArea()
            + "\n\tEl volumen del cilindro es: " +getVolumen());
    }

}
