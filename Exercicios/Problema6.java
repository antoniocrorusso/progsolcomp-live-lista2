/* Nome do Aluno: Antonio Carlos Rodrigo de Oliveira Russo
* RA: 12523118842
* Nome do Programa: Problema 6
* Data: 21/05/2023
*/

import java.util.Scanner;

public class Problema6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nota;

        System.out.println("Informe a nota: ");
        nota = input.nextInt();

        if(nota >= 85)
        {
            System.out.println("Nota conceito ÓTIMO");
        }
        else if (nota >= 65 && nota < 85)
        {
            System.out.println("Nota conceito BOM");
        }
        else if (nota >= 50 && nota < 65)
        {
            System.out.println("Nota conceito REGULAR");
        }
        else 
        {
            System.out.println("Nota conceito INSUFICIENTE");
        }

        input.close();
    }
}
