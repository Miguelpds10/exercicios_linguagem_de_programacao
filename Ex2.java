import java.util.Scanner;
public class Ex2{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		int numeros[];
		numeros = new int[15];
		int[] multiplicadospor3 = new int[15];
		int i;
		for(i = 0; i<= 14; i++){
			System.out.println("Digite um numero: ");
			numeros[i] = scanner.nextInt();
		}
		
		for(i = 0; i<= 14;i++){
			multiplicadospor3[i] = 3 * numeros[i];
		}
		
		 System.out.println("\n--- Resultados (x3) ---");
        for ( i = 0; i < 14; i++) {
            System.out.println(numeros[i] + " x 3 = " + multiplicadospor3[i]);
        }
		scanner.close();
	}
}