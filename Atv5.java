/* Nome do Aluno: Fábio Augusto V.
* RA: 323135349
* Nome do Programa: Programa que informa o fatorial
* Data: 29/04/2023
*/

import javax.swing.JOptionPane;

public class Atv5{
    public static void main(String args[]) {

        int num;
        int resultado = 1;

        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número para saber o fatorial"));
        
        for (int i = 1; i <= num; i++) {
            resultado *= i;
        }
        JOptionPane.showMessageDialog(null, "O fatorial de " + num + " é " + resultado);
    }
}