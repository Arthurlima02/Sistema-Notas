package br.senai.sp.sistema;

import java.util.Scanner;

public class sistema {
    public static void main (String [] args) {



        //Importar Scanner
        Scanner scanner = new Scanner(System.in);

        boolean verdade = false;

        while(!verdade) {

            System.out.println("Qual seu curso?");
            String curso = scanner.nextLine();

            System.out.println("Qual o professor?: ");
            String prof = scanner.nextLine();

            System.out.println("Qual seu nome: ");
            String nome = scanner.nextLine();

            System.out.println("Qual sua frequencia?: ");
            long frequencia = scanner.nextLong();

            System.out.println("Me informe duas ultimas notas: ");
            int nota = scanner.nextInt();

            System.out.println("");
            int nota2 = scanner.nextInt();

            int notafinal = (nota + nota2)/2;



            System.out.println("______________");
            System.out.println("____forms_____");
            System.out.println("Seu nome é " + nome);
            System.out.println("Seu curso é " + curso);
            System.out.println("Seu professor é o " + prof);
            System.out.println("Sua frequencia é " + frequencia + "%");
            System.out.println("Sua nota1 é " + nota);
            System.out.println("Sua nota2 é " + nota2);

            if (frequencia >= 75 && notafinal >= 7 || frequencia >= 90 && notafinal == 6){
                System.out.println("Aprovado");
            }else {
                System.out.println("Reprovado!");
            }

            System.out.println("Voce deseja continuar? (S/N) ");
            String sim = scanner.next().toUpperCase();
            if (sim.equals("N")) {
                System.out.println("Ok, muito obrigado!");
                verdade = true;
            } else {
                System.out.println("Então vamos la!");
                verdade = false;
            }

            scanner.nextLine();



        }


    }
}
