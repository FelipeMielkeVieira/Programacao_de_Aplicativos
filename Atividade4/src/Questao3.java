import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("----- DATA 1 -----\nDia: ");
		int dia1 = sc.nextInt();
	
		System.out.print("Mês: ");
		int mes1 = sc.nextInt();
		
		System.out.print("Ano: ");
		int ano1 = sc.nextInt();
		
		System.out.print("----- DATA 2 -----\nDia: ");
		int dia2 = sc.nextInt();
	
		System.out.print("Mês: ");
		int mes2 = sc.nextInt();
		
		System.out.print("Ano: ");
		int ano2 = sc.nextInt();
		
		int diasData1 = dia1 + (mes1 * 30) + (ano1 * 365);
		int diasData2 = dia2 + (mes2 * 30) + (ano2 * 365);
		
		if(diasData1 > diasData2) {
			System.out.println("Data Maior: " + dia1 + "/" + mes1 + "/" + ano1);
		} else if (diasData2 > diasData1) {
			System.out.println("Data Maior: " + dia2 + "/" + mes2 + "/" + ano2);
		} else {
			System.out.println("As datas são iguais!");
		}
		
		sc.close();
	}
}
