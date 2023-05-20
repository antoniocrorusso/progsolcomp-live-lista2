/* Nome do Aluno: Antonio Carlos Rodrigo de Oliveira Russo
* RA: 12523118842
* Nome do Programa: Problema 4
* Data: 21/05/2023
*/

import java.util.Scanner;

public class Problema4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;

        System.out.println("Digite o numero inteiro.");
        numero = input.nextInt();

        input.close();

        if(numero % 2 == 0){
            System.out.println("O numero é par.");
        } else{
            System.out.println("O número é ímpar.");
        }

        if(numero > 0){
            System.out.println("O número é positivo.");
        }
        else if(numero < 0){
            System.out.println("O número é negativo.");
        } 
        else{
            System.out.println("O número é 0.");
        }
    }
}
