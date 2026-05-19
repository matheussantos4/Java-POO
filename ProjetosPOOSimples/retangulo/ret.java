package ProjetosPOOSimples.retangulo;

public class ret {

    //Fórmulas

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
