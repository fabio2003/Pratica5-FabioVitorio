/* Nome do Aluno: Fábio Augusto V.
* RA: 323135349
* Nome do Programa: Programa que preenche com zeros todas as posições de uma matriz
* Data: 29/04/2023
*/

public class Atv9 {
    public static void main(String args[]) {

        int[][] matriz = new int[10][10];
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = 0;
            }
        }
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
