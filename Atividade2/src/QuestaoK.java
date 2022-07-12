import java.util.Scanner;

public class QuestaoK {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int horas, minutos;
		
		System.out.print("Horas: ");
		horas = sc.nextInt();
		
		System.out.print("Minutos: ");
		minutos = sc.nextInt();
		
		System.out.println("Hora digitada em minutos: " + (horas * 60) +
				"\nMinutos Totais: " + (minutos + (horas * 60)) +
				"\nSegundos Totais: " + ((minutos + (horas * 60)) * 60));
		
		
		sc.close();
	}
}
