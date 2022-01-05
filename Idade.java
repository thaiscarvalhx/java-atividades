package ListaAtividades;

import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira sua idade: ");
        int anos = entrada.nextInt();
        System.out.println("Insira a quantidade de meses que você tem: ");
        int meses = entrada.nextInt();
        System.out.println("Insira seus dias: ");
        int dias = entrada.nextInt();
        int total = (anos * 365) + (meses * 12) + dias;
        System.out.println("Você tem " + anos + " anos, " + meses + " meses e " + dias + " dias. Totalizando " + total + " dias em sua vida.");
    }
}
