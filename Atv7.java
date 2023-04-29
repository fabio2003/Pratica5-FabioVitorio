/* Nome do Aluno: Fábio Augusto V.
* RA: 323135349
* Nome do Programa: Programa que informa se pode entrar no elevador enquanto a carga máxima não é atingida
* Data: 29/04/2023
*/

import java.util.Scanner;

public class Atv7 {
    public static void main(String args[]) {

        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a carga máxima do elevador (em kg): ");
        double cargaMaxima = scanner.nextDouble();
        
        System.out.print("Digite a quantidade máxima de pessoas no elevador: ");
        int maxPessoas = scanner.nextInt();
        
        double cargaAtual = 0.0;
        int numPessoas = 0;
        
        while (cargaAtual < cargaMaxima && numPessoas < maxPessoas) {
            
            System.out.print("Digite o peso da pessoa (em kg): ");
            double peso = scanner.nextDouble();
            
            if (cargaAtual + peso > cargaMaxima) {
                System.out.println("Carga máxima atingida.");
                break;
            }
            
            cargaAtual += peso;
            numPessoas++;
            
            System.out.println("Carga atual: " + cargaAtual + " kg");
            System.out.println("Pessoas no elevador: " + numPessoas);
            
        }
        
        System.out.println("Encerrando o programa.");
        
        scanner.close();
    }
}
