package ejercicio2;

public class Triangulo extends FiguraGeometrica{
    private double base,altura;

    public Triangulo(double b, double h) {
        this.base = b;
        this.altura = h;
    }

    public double area() {
        return base*altura/2;
    }
}
