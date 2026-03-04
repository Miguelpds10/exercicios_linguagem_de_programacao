import java.util.Scanner;
public class Ex7{
	public static void main(String[]args){
	Scanner scanner = new Scanner(System.in);
		int vetorA[];
		vetorA = new int[30];
		int i, naodiv =0;
		System.out.print("Digite valores divisiveis por 5: ");
		for(i = 0; i<=29;i++){
			vetorA[i] = scanner.nextInt();
			if(vetorA[i] % 5 !=0){
				naodiv = naodiv+1;
				i = i-1;
			}
			else{
				vetorA[i] = vetorA[i];
			}
		}
		System.out.println("\nVetor A: ");
		for(i=0; i<=29; i++){
			System.out.print(vetorA[i] + "|");
		}
		System.out.println("\n Quantidade valores não divisiveis por 5 -> " + naodiv);
		scanner.close();
	}
}