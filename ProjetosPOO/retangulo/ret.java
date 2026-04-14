package ProjetosPOO.retangulo;

public class ret {

    public double a, b;

    public double area() {
        return a * b;
    }

    public double perimeter() {
        return 2 * (a + b);
    }

    public double diagonal() {
        return Math.sqrt(a * a + b * b);
    }

}
