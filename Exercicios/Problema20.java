/* Nome do Aluno: Antonio Carlos Rodrigo de Oliveira Russo
* RA: 12523118842
* Nome do Programa: Problema 20
* Data: 21/05/2023
*/

import java.util.Scanner;

public class Problema20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a carga máxima do elevador em KG: ");
        double cargaMaxima = input.nextDouble();

        System.out.println("Agora digite a quantidade máxima de pessoas: ");
        int cargaMaxPessoas = input.nextInt();;
        System.out.println();

        double pesoTotalPessoas = 0f;
        double pesoIndividual;
        int numPessoa = 0;

        do {
            System.out.println("Digite o peso da pessoa " + (numPessoa + 1) + ": ");
            pesoIndividual = input.nextDouble();
            pesoTotalPessoas += pesoIndividual; 
            numPessoa++;

        } while (pesoTotalPessoas < cargaMaxima && numPessoa < cargaMaxPessoas);

        System.out.println("Há " + numPessoa + " pessoa(s) no elevador.");
        System.out.println("O peso total dessa(s) pessoa(s) é " + pesoTotalPessoas + " KG.");
        input.close();
    }
}
