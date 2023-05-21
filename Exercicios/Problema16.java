/* Nome do Aluno: Antonio Carlos Rodrigo de Oliveira Russo
* RA: 12523118842
* Nome do Programa: Problema 16
* Data: 21/05/2023
*/

import java.util.Scanner;

public class Problema16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número menor que 0.");

        double num = input.nextDouble();

        while(num >= 0){
            System.out.println("Digite um número menor que 0.");
            num = input.nextDouble();
            System.out.println("O número digitado foi: " + num);
        }
        System.out.println("O número digitado (" + num + ") é menor que zero.");
        input.close();
        
    }
}
