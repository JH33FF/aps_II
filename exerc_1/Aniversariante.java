package JAVA.aps_II.exerc_1;

public class Aniversariante {
    private String nome;
	private DataAniversario dataAniversario;

    public Aniversariante(String nome, int dia, int mes) {
        this.nome = nome;
        this.dataAniversario = new DataAniversario(dia, mes);
    }

    // Construtor recebendo nome e objeto DataAniversario
    public Aniversariante(String nome, DataAniversario dataAniversario) {
        this.nome = nome;
        this.dataAniversario = dataAniversario;
    }

    @Override
    public String toString() {
        return nome + " - " + dataAniversario;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Aniversariante outro = (Aniversariante) obj;
        return nome != null && nome.equals(outro.nome)
            && dataAniversario != null && dataAniversario.equals(outro.dataAniversario);
            }

    
    
}
