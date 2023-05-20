/* Nome do Aluno: Antonio Carlos Rodrigo de Oliveira Russo
* RA: 12523118842
* Nome do Programa: Problema 2
* Data: 21/05/2023
*/

import java.util.Scanner;
import java.util.Arrays;

public class Problema2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double valorA, valorB, valorC;

        System.out.println("Digite o primeiro valor.");
        valorA = input.nextDouble();
        
        System.out.println("Digite o segundo valor.");
        valorB = input.nextDouble();

        System.out.println("Digite o terceiro valor.");
        valorC = input.nextDouble();

        double[] listaValores = {valorA, valorB, valorC};

        Arrays.sort(listaValores);

        System.out.println("Os valores em ordem são: ");

        for (double numero : listaValores) {
            System.out.println(numero);
        }

        input.close();

    }
    
}
