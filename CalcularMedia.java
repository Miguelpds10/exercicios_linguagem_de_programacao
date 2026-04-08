import java.util.Scanner;

public class CalcularMedia {
	public static void main(String arg[]){
		Scanner entra = new Scanner(System.in);
		
		String letra;
		System.out.println("\n Informe A se quer calcular média aritmética ou B se quer calcular média ponderada: ");
		letra = entra.nextLine();
		
		Double nota1, nota2;
		System.out.println("\n Informe a primeira nota: ");
		nota1 = entra.nextDouble();
		
		System.out.println("\n Informe a segunda nota: ");
		nota2 = entra.nextDouble();
		
		Double result = calcularMedia(nota1,nota2,letra);
		
	}
	
	public static double calcularMedia(Double p1, Double p2, String AB){
		Double result;
		if (letra == "A" || letra == "a"){
			result = (p1 + p2) /2;
		} else{
			media = (p1 * 0.7)+();
		}
		
		
		
		return result;
	}
}