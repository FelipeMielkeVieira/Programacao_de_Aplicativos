import java.util.Scanner;

public class QuestaoG {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("Digite o número: ");
		num = sc.nextInt();
		
		System.out.println("Tabuada: \n"
				+ num + " X 1 = " + (num * 1) + "\n"
				+ num + " X 2 = " + (num * 2) + "\n"
				+ num + " X 3 = " + (num * 3) + "\n"
				+ num + " X 4 = " + (num * 4) + "\n"
				+ num + " X 5 = " + (num * 5) + "\n"
				+ num + " X 6 = " + (num * 6) + "\n"
				+ num + " X 7 = " + (num * 7) + "\n"
				+ num + " X 8 = " + (num * 8) + "\n"
				+ num + " X 9 = " + (num * 9) + "\n"
				+ num + " X 10 = " + (num * 10) + "\n");
		
		sc.close();
	}
}
