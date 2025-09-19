package JAVA.aps_II.exerc_2;

public class Triangulo implements FiguraGeometrica {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return (this.base * this.altura) / 2;
    }

    public String getNomeFigura() {
        return "Triângulo";
    }

    
}
