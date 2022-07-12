import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Valor da Compra: ");
		double compra = sc.nextDouble();

		System.out.println(
				"Opções de Pagamento: \n1 - À Vista \n2 - Cheque pré-datado de 30 dias \n3 - Parcelado em 6 vezes \n4 - Parcelado em 12 vezes");
		int opcao = sc.nextInt();
		
		int numParcelas = 0;
		double valorTotal = 0, parcelas, diferenca;
		switch(opcao) {
		case 1:
			valorTotal = compra - compra * 0.15;
			break;
		case 2:
			valorTotal = compra - compra * 0.10;
			break;
		case 3:
			valorTotal = compra;
			numParcelas = 6;
			break;
		case 4:
			valorTotal = compra + compra * 0.08;
			numParcelas = 12;
			break;
		default:
			System.out.println("Pagamento Inválido!");
			System.exit(0);
		}
		
		parcelas = valorTotal / numParcelas;
		diferenca = compra - valorTotal;
		System.out.println("Total da Compra: R$ " + compra);
		System.out.println("Valor Total: R$ " + valorTotal);
		
		if(diferenca > 0) {
			System.out.println("Desconto: R$ " + diferenca);
		} else if (diferenca < 0) {
			System.out.println("Juros: R$ " + (diferenca * -1));
		}
		
		if(numParcelas != 0) {
			System.out.println("Quantidade de parcelas: " + numParcelas);
			System.out.println("Valor de cada parcela: R$ " + parcelas);
		}

		sc.close();
	}
}
