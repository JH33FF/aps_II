package JAVA.aps_II.exerc_2;

public class Losango implements FiguraGeometrica {
    private double diagonalMaior;
    private double diagonalMenor;

    public Losango(double diagonalMaior, double diagonalMenor) {
        this.diagonalMaior = diagonalMaior;
        this.diagonalMenor = diagonalMenor;
    }

    public double calcularArea() {
        return (this.diagonalMaior * this.diagonalMenor) / 2;
    }

    public String getNomeFigura() {
        return "Losango";
    }
    
}
