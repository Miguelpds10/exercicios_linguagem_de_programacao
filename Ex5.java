import java.util.Scanner;
public class Ex5{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		int numero[];
		numero = new int[50];
		int i;
		System.out.print("Digite um valor: ");
		for(i = 0; i<=49;i++){
			numero[i] = scanner.nextInt();
		}
		
		 System.out.println("Números positivos encontrados:");
		for(i = 0; i<=49;i++){
			if(numero[i] > 0){
				System.out.println(numero[i]);
			}
		}
		scanner.close();
	}
}