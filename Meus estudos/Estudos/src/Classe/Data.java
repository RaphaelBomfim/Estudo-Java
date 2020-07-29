package Classe;

public class Data {

	int dia;
	int mes;
	int ano;
	
	
	
	Data (int dia1, int mes1, int ano1970) {
		dia = dia1;
		mes = mes1;
		ano = ano1970;
		
	} Data() {
	dia = 1;
	mes = 1;
	ano = 1970;
			
	
	
		
	} String DataFormatada () {
		return String.format("%s/%s/%s", dia, mes, ano);
		
	
		
	}  void VoltardataPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
		
		
	}
		
}
