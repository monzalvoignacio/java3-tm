package ejercicio2;

public class Rectangulo extends FiguraGeometrica{
    private double ancho,largo;

    public Rectangulo(double a, double l) {
        this.ancho = a;
        this.largo = l;
    }

    public double area() {
        return ancho*largo;
    }
}
