/* Nome do Aluno: Antonio Carlos Rodrigo de Oliveira Russo
* RA: 12523118842
* Nome do Programa: Problema 1
* Data: 21/05/2023
*/

import java.util.Scanner;

public class Problema1{
    public static void main(String[] args) {
        
        Double num1, num2;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite dois números para calcular o maior.");

        System.out.println("Numero 1: ");
        num1 = input.nextDouble();
        System.out.println("Numero 2: ");
        num2 = input.nextDouble();

        if(num1 > num2){
            System.out.println("O numero 1 (" + num1 + ") é o maior.");
        } 
        else if(num2 > num1){
            System.out.println("O numero 2 (" + num2 + ") é o maior.");
        }
        else{
            System.out.println("Os números possuem o mesmo valor.");
        }

        input.close();
    }

}