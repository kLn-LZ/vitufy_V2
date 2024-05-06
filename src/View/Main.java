package View;

import Controller.PlayerController;
import Model.Lista;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Lista L = new Lista();
        Scanner scan = new Scanner(System.in);
        PlayerController PC = new PlayerController();

        int opc = 0;


        while(opc != 9) {

            System.out.print("1 - Adicionar música \n 2 - Remover música \n 3 - Tocar playlist \n 9 - sair \n Escolha: ");
            opc = scan.nextInt();

            switch(opc) {
                case 1:
                    System.out.print("Insira separando neste formato: Nome_da_musica;nome_artista;duracao (obrigatoriamente dessa forma), Digite: ");
                    String musca = scan.next();
                    PC.adicionaMusica(L, musca);
                    break;
                case 2:
                    System.out.print("Escolha o número da música (de acordo com a ordem de adição: ");
                    int pos = scan.nextInt();
                    PC.removeMusica(L, pos);
                    break;
                case 3:
                    PC.executaPlaylist(L);
                    break;
                case 9:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;


            }

        }


    }
}
