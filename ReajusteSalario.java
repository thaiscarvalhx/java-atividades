package ListaAtividades;

import java.util.Scanner;

public class ReajusteSalario {
    public static void main(String[] args) {
        //Informar um saldo e imprimir o saldo com reajuste de 1%
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o saldo em sua conta: ");
        int saldo = entrada.nextInt();
        double reajuste = 1.01 / 100.0;
        double total = saldo + (saldo * reajuste);

        System.out.println("Seu saldo com o reajuste de 1% é de " + total + " reais.");

    }
}
