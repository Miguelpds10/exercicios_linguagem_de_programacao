import java.util.Scanner;
 public class CalcularSoma{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		int n1, n2;
		System.out.print("Digite o numero 1: ");
		n1 = scanner.nextInt();
		System.out.print("Digite o numero 2: ");
		n2 = scanner.nextInt();
		int resul = calcularSoma(n1, n2);
		scanner.close();
	}
	public static int calcularSoma(int numero1, int numero2){
		int resultado = numero1 + numero2;
		System.out.print(resultado);
		return resultado;
	}
 }