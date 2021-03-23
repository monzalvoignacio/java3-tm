package ejercicio2;

public class Main {
    public static void main(String[] args){
        FiguraGeometrica t = new Triangulo(3, 4);
        FiguraGeometrica c = new Circulo(3);
        FiguraGeometrica r = new Rectangulo(3, 4);
        System.out.println(t);
        System.out.println(c);
        System.out.println(r);

        FiguraGeometrica arr[] = new FiguraGeometrica[3];
        arr[0] = t;
        arr[1] = c;
        arr[2] = r;
        System.out.println(FigUtils.areaPromedio(arr));
    }

}
