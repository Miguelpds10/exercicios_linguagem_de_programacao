import java.util.Scanner;
public class Ex3{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		int numero[];
		numero = new int[50];
		int maiornumero;
		int i;
		System.out.print("Digite um valor: ");
		for(i = 0; i<=49;i++){
			numero[i] = scanner.nextInt();
		}
		maiornumero = numero[0];
		for(i = 0; i<= 49; i++){
			if(numero[i] > maiornumero){
				maiornumero = numero[i];
			}
		}
		System.out.println("O maior numero é : " + maiornumero);
		scanner.close();
	}
}