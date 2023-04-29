/* Nome do Aluno: Fábio Augusto V.
* RA: 323135349
* Nome do Programa: Programa solicita números enquanto for diferente de zero
* Data: 29/04/2023
*/

import javax.swing.JOptionPane;

public class Atv4{
    public static void main(String args[]) {

        int num = 0;

        do {
           num = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número: "));
        } while (num >= 0);

    }
}