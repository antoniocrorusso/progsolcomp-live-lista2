/* Nome do Aluno: Antonio Carlos Rodrigo de Oliveira Russo
* RA: 12523118842
* Nome do Programa: Problema 5
* Data: 21/05/2023
*/

import java.util.Scanner;

public class Problema5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome, sobrenome, naturalidade;
        int idade;
        String resposta;

        System.out.println("Digite seu nome: ");
        nome = input.next();

        System.out.println("Digite seu Sobrenome: ");
        sobrenome = input.next();

        System.out.println("Digite sua naturalidade: ");
        naturalidade = input.next();

        System.out.println("Digite sua idade (anos): ");
        idade = input.nextInt();
           
        System.out.println("Deseja visualizar os dados completos?\nS para Sim\nN para não.");
        resposta = input.next();

        switch (resposta)
        {
            case "S":
                System.out.println(String.format("""
                    Nome: %s
                    Sobrenome: %s
                    Idade: %d
                    Naturalidade: %s          
                    """, nome, sobrenome, idade, naturalidade));
                    break;

            case "N":
            System.out.println(String.format("""
                Nome: %s
                Idade: %d       
                """, nome, idade));
                break;

            default:
                System.out.println("Digitação errada. Tente Novamente");
        }

        input.close();
    }
}
