import java.util.Scanner;
public class Vetores{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		int[] vetA = new int[5];
		int[] vetB = new int[5];
		int n = 0;
		
		System.out.println("Digite um valor: ");
		n = scanner.nextInt();
		
		while(n < 1000 || n > 9999){
			System.out.println("Nao Encaixa");
			n = scanner.nextInt();
			vetA[i] = n;
		}
		
		scanner.close();
	}
}