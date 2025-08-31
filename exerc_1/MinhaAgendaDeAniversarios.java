package JAVA.aps_II.exerc_1;

import java.util.ArrayList;
import java.util.List;

public class MinhaAgendaDeAniversarios implements AgendaDeAniversarios {
    private List<Aniversariante> lista;

    public MinhaAgendaDeAniversarios() {
        lista = new ArrayList<>();
    }

    public void adicionar(Aniversariante aniversariante) {
        lista.add(aniversariante);
    }

    public boolean remover(Aniversariante aniversariante) {
        return lista.remove(aniversariante);
    }

    public List<Aniversariante> listar() {
        return new ArrayList<>(lista);
    }
}