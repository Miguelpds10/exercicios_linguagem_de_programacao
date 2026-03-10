import java.util.Scanner;

public class VerificadorMatrizIdentidade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        boolean ehIdentidade = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    if (matriz[i][j] != 1) {
                        ehIdentidade = false;
                    }
                } else {
                    if (matriz[i][j] != 0) {
                        ehIdentidade = false;
                    }
                }
            }
        }

        if (ehIdentidade) {
            System.out.println("A matriz e uma matriz identidade.");
        } else {
            System.out.println("A matriz nao e uma matriz identidade.");
        }
    }
}
