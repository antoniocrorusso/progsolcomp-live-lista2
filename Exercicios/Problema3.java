/* Nome do Aluno: Antonio Carlos Rodrigo de Oliveira Russo
* RA: 12523118842
* Nome do Programa: Problema 3
* Data: 21/05/2023
*/

import java.util.Scanner;

public class Problema3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numA, numB;

        System.out.println("Digite o primeiro valor.");
        numA = input.nextInt();

        System.out.println("Digite o segundo valor.");
        numB = input.nextInt();

        input.close();

        if(numA % numB == 0 || numB % numA == 0){
            System.out.println("São multiplos");
        } else{
            System.out.println("Não são multiplos");
        }
    }
    
}
