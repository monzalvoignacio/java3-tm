package ejercicio2;

public class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(double r) {
        this.radio = r;
    }

    public double area() {
        return Math.PI*Math.pow(radio, 2);
    }
}
