package JAVA.aps_II.LocadoraRef;

import java.util.*;

public class Cliente implements Extrato {
    private String nome;
    private List<Aluguel> alugueis = new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

    public void adicionaAluguel(Aluguel aluguel) {
        alugueis.add(aluguel);
    }

    public double calcValorTotal() {
        double total = 0;
        for (Aluguel aluguel : alugueis) {
            total += aluguel.calcValor();
        }
        return total;
    }

    public int calcPontosTotal() {
        int total = 0;
        for (Aluguel aluguel : alugueis) {
            total += aluguel.calcPontos();
        }
        return total;
    }

    @Override

    public String criarExtrato() {
        String result = "Extrato: " + nome + "\n";
        for (Aluguel aluguel : alugueis) {
            result += aluguel.criarExtrato();
        }
        result += "Valor total: " + calcValorTotal() + "\n";
        result += "Pontos totais: " + calcPontosTotal() + "\n";
        return result;

    }
}