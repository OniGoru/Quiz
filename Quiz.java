package Quiz;

import java.util.Scanner;  //classe de scanner

public class Quiz {public static void main(String[] args) {  //metodo main

    int limTentativa = 3, tentativa = 0; //Variaveis inteiras
    String resposta; //variavel String

    Scanner scanner = new Scanner(System.in); //Função para ler as respostas

    // mensagem de apresentação //

    System.out.println("|-------------------|");
    System.out.println("| Bem-vindo ao Quiz |");
    System.out.println("|-------------------|");
    System.out.println("\nVocê tem direito a 3 tentativas");

    // Laço de repetição da Primeira Pergunta //

    do {
        System.out.println("\nPrimeira pergunta:");

        System.out.print("\nPergunta");
        System.out.println("\na) Resposta Errada");
        System.out.println("b) Resposta Certa");
        System.out.println("c) Resposta Errada");
        System.out.println("d) Resposa Errada");
        System.out.println(" ");
        resposta = scanner.nextLine();

        //Se a resposta for igual a "b", Mostra a mensagem de "Certa Resposta" e encerra o Loop indo para a Segunda Pergunta
        if ("b".equals(resposta)) {
            System.out.println("Certa Resposta");
            break ;
        } else {
            tentativa++;
            System.out.println("\nResposta errada");
            System.out.println("Você perdeu uma tentativa");
        }
        System.out.print("\nEssa foi a sua " + tentativa + "º tentativa" );
    }while(tentativa!=limTentativa);
    if (tentativa==limTentativa){
        System.out.println("\nVocê gastou suas 3 tentativas");
        System.out.println("|-------------------|");
        System.out.println("|    Fim do Jogo    |");
        System.out.println("|-------------------|");
        System.exit(0);
    }

    do {
        System.out.println("\nSegunda pergunta:");

        System.out.print("\nPergunta");
        System.out.println("\na) Resposta Errada");
        System.out.println("b) Resposta Errada");
        System.out.println("c) Resposta Certa");
        System.out.println("d) Resposa Errada");
        System.out.println(" ");
        resposta = scanner.nextLine();

        if ("c".equals(resposta)) {
            System.out.println("Certa Resposta");
            System.out.println("\nVocê ganhou o quiz");
            System.out.println("|-------------------|");
            System.out.println("|    Fim do Jogo    |");
            System.out.println("|-------------------|");
            System.exit(0);

        } else {
            tentativa++;
            System.out.println("\nResposta errada");
            System.out.println("Você perdeu uma tentativa");
        }
        System.out.print("\nEssa foi a sua " + tentativa + "º tentativa" );
    }while(tentativa!=limTentativa);
    System.out.println("\nVocê gastou suas 3 tentativas");
    System.out.println("|-------------------|");
    System.out.println("|    Fim do Jogo    |");
    System.out.println("|-------------------|");
    System.exit(0);
}
}
