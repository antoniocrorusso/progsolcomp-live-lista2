/* Nome do Aluno: Antonio Carlos Rodrigo de Oliveira Russo
* RA: 12523118842
* Nome do Programa: Problema 18
* Data: 21/05/2023
*/

import java.util.Scanner;

public class Problema18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Programa do fatorial.");
        System.out.println("Digite o número que se quer o fatorial: ");
        int num = input.nextInt();
        
        int fatorial = 1;
        int contador = 1; 

        while(contador <= num){
            fatorial = fatorial * contador;
            contador++;
        }

        System.out.println("O fatorial é: " + fatorial);
        input.close();
    }
}
