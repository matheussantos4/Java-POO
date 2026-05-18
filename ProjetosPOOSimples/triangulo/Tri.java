package ProjetosPOO.triangulo;

// Classe destinada a criar a instância Triângulo e a função área que

// calcula perímetro e área do triângulo.

public class Tri {

    public double a;
    public double b;
    public double c;

    public double area() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));

    }
}