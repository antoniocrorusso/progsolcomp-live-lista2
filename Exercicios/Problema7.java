/* Nome do Aluno: Antonio Carlos Rodrigo de Oliveira Russo
* RA: 12523118842
* Nome do Programa: Problema 7
* Data: 21/05/2023
*/

import java.util.Scanner;

public class Problema7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numDiaria;
        double valorTaxa, valorTotal;

        System.out.println("Digite o numero de diarias: ");

        numDiaria = input.nextInt();

        if(numDiaria > 15) 
        {
            valorTaxa = 5.5f;
        }
        else if (numDiaria == 15) 
        {
            valorTaxa = 6f;
        }
        else 
        {
            valorTaxa = 8f;
        }

        valorTotal = (60 * numDiaria) + (valorTaxa * numDiaria); 

        System.out.println(String.format("O valor total é de: R$ %.2f", valorTotal));

        input.close();
    }
}
