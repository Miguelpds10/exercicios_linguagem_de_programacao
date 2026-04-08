import java.util.Scanner;
public class VerificarTempo{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int duracao = 0;
		System.out.print("Digite a quantidade de segundos: ");
		duracao = scanner.nextInt();
		
		verificarTempo(duracao);
		scanner.close();
	}
	
	public static void verificarTempo(int tempoTotal){
		int horas, min, seg;
		horas = tempoTotal/3600;
		min =(tempoTotal%3600)/60;
		seg =(tempoTotal%3600)%60;
		System.out.print(tempoTotal+ "segundo(s) equivale a " + horas + "horas(s)" + min + "minutos(s)" + seg + "segundo(s)");
		return;
	}
}