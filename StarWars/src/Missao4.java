import java.util.Scanner;

public class Missao4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		do {
			
			System.out.print("Número: ");
			num = sc.nextInt();
			
			if(num % 2 == 0) {
				System.out.println("Digite um Número Válido!");
			} else {
				
				int espacos = (int) (num / 2);
				int asteriscos = 1;
				String resposta = "";
				
				for(int i = 0; i < num; i++) {
					
					String espacoAtual = "";
					for(int a = 0; a < espacos; a++) {
						espacoAtual += " ";
					}
					
					String asteriscosAtuais = "";
					for(int b = 0; b < asteriscos; b++) {
						asteriscosAtuais += "*";
					}
					resposta += espacoAtual + asteriscosAtuais + "\n";
					
					if(i < (int) (num / 2)) {
						espacos--;
						asteriscos += 2;
					} else {
						espacos++;
						asteriscos -= 2;
					}
				}
				System.out.println(resposta);
			}
			
		} while(num > 0);
		
		sc.close();
	}
}
