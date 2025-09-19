package JAVA.aps_II.LocadoraRef;

public class Aluguel implements Extrato{
	private int diasAlugada;
	private Fita fita;
  
	public Aluguel(Fita fita, int diasAlugada) {
		this.fita = fita;
		this.diasAlugada = diasAlugada;
	}
	
	public Fita getFita() {
		return fita;
	}
	
	public int getDiasAlugada() {
		return diasAlugada;
	}

	public double calcValor(){
		switch (fita.getCodigoDePreco()) {
			case Fita.NORMAL:
				return diasAlugada > 2 ? 2 + (diasAlugada - 2) * 1.5 : 2;
			case Fita.LANCAMENTO:
				return diasAlugada * 3;
			case Fita.INFANTIL:
				return diasAlugada > 3 ? 1.5 + (diasAlugada - 3) * 1.5 : 1.5;
			default:
				return 0;
			}
	}

	public int calcPontos(){
		int pontos = 1;
		if (fita.getCodigoDePreco() == Fita.LANCAMENTO && diasAlugada > 1) {
			pontos++;
		}
		return pontos;
	}

	@Override
	public String criarExtrato(){
		return "\t" + fita.getTitulo() + "\t" + String.valueOf(calcValor()) + "\n";
	}

}