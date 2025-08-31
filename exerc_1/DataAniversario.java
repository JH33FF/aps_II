package JAVA.aps_II.exerc_1;

public class DataAniversario {
	
	private int dia;
	private int mes;

	
	public DataAniversario(int dia2, int mes2) {
		this.dia = dia2;
		this.mes = mes2;

		
    }
	
	
	public boolean equals(Object outraData){
		if (outraData instanceof DataAniversario){
			DataAniversario outraDataAniversario = (DataAniversario) outraData;
			return (outraDataAniversario.dia == this.dia && outraDataAniversario.mes == this.mes);
		}
		return false;
	}
	
	public String toString(){
		return this.dia+"/"+this.mes;
	}
	
}