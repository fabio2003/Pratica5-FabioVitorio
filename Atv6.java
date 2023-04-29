/* Nome do Aluno: Fábio Augusto V.
* RA: 323135349
* Nome do Programa: Programa que informa o tempo necessário para um volume ser maior que 1000 cm²
* Data: 29/04/2023
*/

import javax.swing.JOptionPane;

public class Atv6{
    public static void main(String args[]) {

        
        int volume = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o volume em cm³"));
        int tempo = 0;

        while (volume <= 1000) {
            volume *= 2;
            tempo++;
        }

        JOptionPane.showMessageDialog(null, "O volume do gás será maior que 1000 cm³ em " + tempo + " segundos.");

    }
}