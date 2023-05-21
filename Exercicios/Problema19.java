/* Nome do Aluno: Antonio Carlos Rodrigo de Oliveira Russo
* RA: 12523118842
* Nome do Programa: Problema 19
* Data: 21/05/2023
*/

import java.util.Scanner;

public class Problema19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o volume inicial do gás em Cm3: ");
        double vol = input.nextDouble();
        int segundos = 0;

        while(vol <= 1000)
        {
            vol = vol * 2;
            segundos++;
        }

        System.out.println("Demorará " + segundos + " segundos para o gás ficar com mais de 1000 Cm3");
        System.out.println("O volume final será de " + vol + " Cm3.");
        input.close();
    }
}
