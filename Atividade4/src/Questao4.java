import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int horaFinal, minutoFinal;
		
		System.out.print("Qual a hora do início? ");
		int horaInicio = sc.nextInt();
		
		System.out.print("Qual o minuto de início? ");
		int minutoInicio = sc.nextInt();
		
		System.out.print("Qual a hora de término? ");
		int horaTermino = sc.nextInt();
		
		System.out.print("Qual o minuto de término? ");
		int minutoTermino = sc.nextInt();
		
		int minutosInicio = minutoInicio + (horaInicio * 60);
		int minutosTermino = minutoTermino + (horaTermino * 60);
		
		if(minutosTermino > minutosInicio) {
			
			horaFinal = (minutosTermino - minutosInicio) / 60;
			minutoFinal = (minutosTermino - minutosInicio) % 60;
			System.out.println("O jogo durou " + horaFinal + " horas e " + minutoFinal + " minutos!");
			
		} else if (minutosInicio > minutosTermino) {
			
			horaFinal = (minutosTermino + (24 * 60) - minutosInicio) / 60;
			minutoFinal = (minutosTermino + (24 * 60) - minutosInicio) % 60;
			System.out.println("O jogo durou " + horaFinal + " horas e " + minutoFinal + " minutos!");
			
		} else {
			System.out.println("O jogo durou 24 horas!");
		}
		
		sc.close();
	}
}
