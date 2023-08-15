package br.senai.sp.balada;

import com.sun.source.tree.WhileLoopTree;

import java.awt.event.WindowFocusListener;
import java.util.Scanner;

public class Pub {

    static public void main(String[] args) {

        /**Declarar as Variaveis*/

        String nome, nomeAcompanhante;
        int idade, idadeAcompanhante = 0;
        int cpf, cpfAcompanhante;
        boolean continuar = true;
        /** Instanciar scanner*/
        Scanner Teclado = new Scanner(System.in);

        while (continuar) {
            /** coletar dados*/
            System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/");
            System.out.println("Bem vindo Ao Meu pug !");
            System.out.print("Qual seu nome: ");
            nome = Teclado.next();
            System.out.println("Digite Seu Cpf");
            cpf = Teclado.nextInt();
            System.out.println("Digite sua Idade");
            idade = Teclado.nextInt();

            /** Printa dados de usuario*/

            System.out.println("------------------");
            System.out.println("Olá" + "" + nome);
            System.out.println("Cpf digitado:" + "" + cpf);
            System.out.println(" sua idade" + "" + idade);

            System.out.println("-----------------");

            /** Condições da Balada */
            if (idade >= 18 && idade % 2 == 0) {

                System.out.println("Entrada Liberada");

            } else if (idade >= 18 && idade % 2 == 1) {
                System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/");

                System.out.print("Qual nome Acompanhante: ");
                nomeAcompanhante = Teclado.next();
                System.out.println("Cpf Do Acompanhante");
                cpfAcompanhante = Teclado.nextInt();
                System.out.println("Idade do Acompanhante");
                idadeAcompanhante = Teclado.nextInt();

            } else {
                System.out.println("Não Entra !!");


            }
            if ((idade + idadeAcompanhante) % 2 == 0 && idadeAcompanhante >= 18) {
                System.out.println("pode entrar");
            } else {
                System.out.println("nao pode entrar");

            }


            /** Availaçao Loop*/
            System.out.println("------------");
            System.out.println("Deseja continuar: [1-sim / 2-nao]");
            int opçao = Teclado.nextInt();

            if (opçao == 2) {
                continuar = false;
            }
        }
    }
}
