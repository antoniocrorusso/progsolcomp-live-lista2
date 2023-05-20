/* Nome do Aluno: Antonio Carlos Rodrigo de Oliveira Russo
* RA: 12523118842
* Nome do Programa: Problema 9
* Data: 21/05/2023
*/

import java.util.Scanner;

public class Problema9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double valorVenda;
        int condicaoVenda;

        System.out.println("Digite o valor da Venda: ");
        valorVenda = input.nextDouble();

        System.out.println("""
                Digite a condição de Venda de acordo com as opções abaixo:
                1 - para Venda a Vista
                2 - para Venda a Prazo 30 dias
                3 - para Venda a Prazo 60 dias
                4 - para Venda a Prazo 90 dias
                5 - para Venda com cartão de débito
                6 - para Venda com cartão de crédito
                """);
        condicaoVenda = input.nextInt();

        switch(condicaoVenda)
        {
            case 1:
                System.out.println("Desconto de 10%");
                valorVenda -= valorVenda * (10/100f);
                break;

            case 2:
                System.out.println("Desconto de 5%");
                valorVenda -= valorVenda * (5/100f);
                break;

            case 3:
                System.out.println("Mesmo preço");
                break;

            case 4:
                System.out.println("Acréscimo de 5%");
                valorVenda += valorVenda * (5/100f);
                break;

            case 5:
                System.out.println("Desconto de 8%");
                valorVenda -= valorVenda * (8/100f);
                break;

            case 6:
                System.out.println("Desconto de 7%");
                valorVenda -= valorVenda * (7/100f);
                break;
            
            default:
                System.out.println("Opção inexistente, tente novamente.");
        }

        System.out.println(String.format("Valor Final: R$ %.2f", valorVenda));
        input.close();
    }
}
