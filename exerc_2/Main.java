package JAVA.aps_II.exerc_2;

public class Main {
    public static void main(String[] args) {
        GerenteDeFiguras gerente = new GerenteDeFiguras();

        gerente.adicionarFigura(new Triangulo(15, 10));
        gerente.adicionarFigura(new Losango(8, 6));
        gerente.adicionarFigura(new Losango(20,5));
        gerente.adicionarFigura(new Losango(22, 8));

        gerente.imprimeFiguras();

        System.out.println("Área Maior: " + gerente.getMaiorAreaDeFigura());
        System.out.println("Área Total: " + gerente.calcAreaTot());
    }
    
}
