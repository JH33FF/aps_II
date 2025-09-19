package JAVA.aps_II.exerc_2;
import java.util.ArrayList;
import java.util.List;

public class GerenteDeFiguras {
    private List<FiguraGeometrica> figuras;
    public GerenteDeFiguras() {
        figuras = new ArrayList<>();
    }

    public void adicionarFigura(FiguraGeometrica figura) {
        figuras.add(figura);
    }
    public void imprimeFiguras(){
        for (FiguraGeometrica figura : figuras) {
            System.out.println(figura.getNomeFigura() + " - Área: " + figura.calcularArea());
        }
    }
    public double getMaiorAreaDeFigura(){
        double maiorArea = 0;
        for (FiguraGeometrica figura : figuras) {
            double area = figura.calcularArea();
            if (area > maiorArea) {
                maiorArea = area;
            }
        }
        return maiorArea;
    }

    public double calcAreaTot(){
        double areaTotal = 0;
        for (FiguraGeometrica figura : figuras) {
            areaTotal += figura.calcularArea();
        }
        return areaTotal;
    }
}
