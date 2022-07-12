import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String mesFinal = "";
		boolean verificar = true;
		
		System.out.print("Qual o dia do mês? ");
		int dia = sc.nextInt();
		
		System.out.print("Qual o mês? (Número) ");
		int mes = sc.nextInt();
		
		System.out.print("Qual o ano? ");
		int ano = sc.nextInt();
		
		System.out.print("Qual a hora? ");
		int hora = sc.nextInt();
		
		System.out.print("Quais os minutos? ");
		int minutos = sc.nextInt();
		
		if(mes == 1) {
			mesFinal = "Janeiro";
		} else if(mes == 2) {
			mesFinal = "Fevereiro";
		} else if (mes == 3) {
			mesFinal = "Março";
		} else if (mes == 4) {
			mesFinal = "Abril";
		} else if (mes == 5) {
			mesFinal = "Maio";
		} else if (mes == 6) {
			mesFinal = "Junho";
		} else if (mes == 7) {
			mesFinal = "Julho";
		} else if (mes == 8) {
			mesFinal = "Agosto";
		} else if (mes == 9) {
			mesFinal = "Setembro";
		} else if (mes == 10) {
			mesFinal = "Outubro";
		} else if (mes == 11) {
			mesFinal = "Novembro";
		} else if (mes == 12) {
			mesFinal = "Dezembro";
		} else {
			System.out.println("Mês Inválido!");
		}
		
		if(mesFinal.equals("") || hora > 23 || minutos > 59 || dia > 31) {
			verificar = false;
		}
		
		if(verificar) {
			System.out.println("Data Final: " + dia + "/" + mesFinal + "/" + ano + " " + hora + ":" + minutos);	
		} else {
			System.out.println("Data Inválida!");
		}
 		
		sc.close();
	}
}
