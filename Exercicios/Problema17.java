/* Nome do Aluno: Antonio Carlos Rodrigo de Oliveira Russo
* RA: 12523118842
* Nome do Programa: Problema 17
* Data: 21/05/2023
*/

public class Problema17 {
    public static void main(String[] args) {
        int i = -1000;

        System.out.println("Múltiplos negativos de 7:");

        do{
            if(i % 7 == 0){
                System.out.println("Número: " + i);
            }
            i++;
        }
        while( i < 0);
    }
}
