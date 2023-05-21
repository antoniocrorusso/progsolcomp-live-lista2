/* Nome do Aluno: Antonio Carlos Rodrigo de Oliveira Russo
* RA: 12523118842
* Nome do Programa: Problema 21
* Data: 21/05/2023
*/

import java.util.Scanner;

public class Problema21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número positivo: ");
        int num = input.nextInt();

        input.close();

        System.out.println("Tabuada até o número " + num);

        for (int i = 1; i <= num; i++) {
            System.out.println("Tabuada do " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " X " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}
