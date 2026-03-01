import java.util.Scanner;
public class Ex1{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		int numero[];
		numero = new int[20];
		int i;
		//Ordem correta
		for(i = 0; i<=19;i++){
			System.out.println("Digite um valor: ");
			numero[i] = scanner.nextInt();
		}
		System.out.println("----Ordem Inversa----");
		//Ordem Inversa
		for(i = 19; i>=0;i--){
			System.out.print(numero[i] + "|");
		}
		scanner.close();
	}
}