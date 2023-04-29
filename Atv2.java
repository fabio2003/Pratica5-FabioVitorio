/* Nome do Aluno: Fábio Augusto V.
* RA: 323135349
* Nome do Programa: Programa que imprime números pares ordem inversa
* Data: 29/04/2023
*/

import javax.swing.JOptionPane;

public class Atv2{
    public static void main(String args[]) {

        for(int i = 100; i >= 1; i--){
            if(i % 2 == 0){
                JOptionPane.showMessageDialog(null, i);
            }
        }    
        
    }
}