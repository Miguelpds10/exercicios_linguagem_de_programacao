import java.util.Scanner;
public class NumEDivis{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		int[] num = new int[10];
		int[] divis = new int[5];
		
		System.out.println("Digite 10 numeros inteiros no vetor: ");
		for(int i = 0; i<=9; i++){
			num[i] = scanner.nextInt();
		}
		
		System.out.println("Digite 5 numeros inteiros no vetor: ");
		for(int i = 0; i <=4; i++){
			divis[i] = scanner.nextInt();
		}
		int flag = 0;
		for(int i = 0; i <=9; i++){
			for(int j = 0; j <=4; j++){
				if(num[i]%divis[j] == 0){
					System.out.println("Numero " + num[i]);
					System.out.println("Divisivel por  " + num[i] + " na posicao " + divis[j]);
					flag = 1;
				}				
			}
			if(flag == 0){
					System.out.println("Numero " + num[i]);
					System.out.println("Nao possui divisores no segundo vetor");
			}
		}
		scanner.close();
	}
}