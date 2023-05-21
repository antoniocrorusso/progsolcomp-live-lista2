/* Nome do Aluno: Antonio Carlos Rodrigo de Oliveira Russo
* RA: 12523118842
* Nome do Programa: Problema 12
* Data: 21/05/2023
*/

public class Problema12 {
    public static void main(String[] args) {
        
        int i = 0;

        do{
            if(i % 2 == 0){
                System.out.println("Número: " + i);
            }
            i++;
        }
        while( i % 7 != 0);
    }
}
