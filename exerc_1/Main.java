package JAVA.aps_II.exerc_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MinhaAgendaDeAniversarios agenda = new MinhaAgendaDeAniversarios();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Digite o nome do aniversariante (ou 'sair' para encerrar):");
            String nome = sc.nextLine();
            if (nome.equalsIgnoreCase("sair")) break;

            System.out.print("Digite o dia do aniversário: ");
            int dia = sc.nextInt();
            System.out.print("Digite o mês do aniversário: ");
            int mes = sc.nextInt();
            sc.nextLine(); // Limpa o buffer

            Aniversariante aniversariante = new Aniversariante(nome, dia, mes);
            agenda.adicionar(aniversariante);

            System.out.println("Aniversariante adicionado!\n");
        }

        System.out.println("\nLista de aniversariantes cadastrados:");
        for (Aniversariante a : agenda.listar()) {
            System.out.println(a);
        }

        sc.close();
    }
}