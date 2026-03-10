public class SomaMatriz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int soma = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = input.nextInt();
                soma += matriz[i][j];
            }
        }

        System.out.println(soma);
    }
}