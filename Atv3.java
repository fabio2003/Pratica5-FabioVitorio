/* Nome do Aluno: Fábio Augusto V.
* RA: 323135349
* Nome do Programa: Programa que mostra o valor total da soma de 1 a 100
* Data: 29/04/2023
*/

import javax.swing.JOptionPane;

public class Atv3{
    public static void main(String args[]) {

        int soma = 0;

        for(int i = 1; i <= 100; i++){
            soma += i;
        }    
        
        JOptionPane.showMessageDialog(null, soma);
    }
}