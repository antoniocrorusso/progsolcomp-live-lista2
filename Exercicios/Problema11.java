/* Nome do Aluno: Antonio Carlos Rodrigo de Oliveira Russo
* RA: 12523118842
* Nome do Programa: Problema 11
* Data: 21/05/2023
*/

public class Problema11 {
    public static void main(String[] args) {
        System.out.println("Imprimindo os números pares de 1 a 100 na ordem inversa: ");

        for (int i = 100; i >= 0; i--) {
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}

