package figuras;

public class Esfera implements figura {

    protected double r;

    public Esfera(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(r, 2);
    }

    @Override
    public double getVolumen() {
        return (4 / 3) * Math.PI * Math.pow(r, 3);
    }

    @Override
    public String toString() {
        return String.format("Esfera:"
            + "\n\tEl radio de la esfera es: "+ r
            + "\n\tEl área de la esfera es: " +getArea()
            + "\n\tEl volumen de la esfera es: " +getVolumen());
    }
}
