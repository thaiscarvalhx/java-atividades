package ListaAtividades;

import java.util.Scanner;

public class MediaAritmeticaLoop {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira a quantidade de valores desejados: ");
        int valorInserido = entrada.nextInt();
        int soma = 0, cont = 0;

        do {
            System.out.println("Insira os números desejados para cálculo " +
                    "de média: ");
            valorInserido = entrada.nextInt();//digitar os números para
            // calcular a média

            if(valorInserido<=0) {
                soma = valorInserido + soma; cont++;
            }

        }  while(valorInserido>=0);
        System.out.println("A média é: "+ soma / cont);
    }
}
