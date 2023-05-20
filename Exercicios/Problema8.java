/* Nome do Aluno: Antonio Carlos Rodrigo de Oliveira Russo
* RA: 12523118842
* Nome do Programa: Problema 8
* Data: 21/05/2023
*/

import java.util.Scanner;

public class Problema8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mes;
        String estacao = "estacao";
        String nomeMes = "nomeMes";

        System.out.println("Digite um número de 1 a 12");
        mes = input.nextInt();

        if ((mes >= 1 && mes < 3) || mes == 12){
            estacao = "Verão";

            if (mes == 1){
                nomeMes = "Janeiro";
            }
            else if (mes == 2){
                nomeMes = "Fevereiro";
            }
            else {
                nomeMes = "Dezembro";
            }
        }
        else if(mes >= 3 && mes < 6){
            estacao = "Outono";

            if (mes == 3){
                nomeMes = "Março";
            }
            else if (mes == 4){
                nomeMes = "Abril";
            }
            else {
                nomeMes = "Maio";
            }
        }
        else if (mes >= 6 && mes < 9){
            estacao = "Inverno";

            if (mes == 6){
                nomeMes = "Junho";
            }
            else if (mes == 7){
                nomeMes = "Julho";
            }
            else {
                nomeMes = "Agosto";
            }
        }
        else if (mes >= 9 && mes < 12){
            estacao = "Primavera";

            if (mes == 9){
                nomeMes = "Setembro";
            }
            else if (mes == 10){
                nomeMes = "Outubro";
            }
            else {
                nomeMes = "Novembro";
            }
        }
        else{
            System.out.println("Mês inexistente.");
        }
        
        System.out.println(String.format("Mês: %s - Estação: %s ", nomeMes, estacao));
        input.close();
    }
}
