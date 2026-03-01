import java.util.Scanner;
public class Ex4{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		int numero[];
		numero = new int[100];
		int i;
		int soma = 0;
		System.out.print("Digite um valor: ");
		
		for(i = 0; i<=99; i++){
		numero[i] = scanner.nextInt();
		}
		
		for(i = 0; i<=99; i++){
			if(i% 2!=0){
				soma = soma + numero[i];
			}
		}
		System.out.println("A soma dos elementos nos índices ímpares é: " + soma);
		scanner.close();
	}
}