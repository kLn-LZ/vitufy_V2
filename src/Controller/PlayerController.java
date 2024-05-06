package Controller;

import Model.Lista;
import Model.Musica;

public class PlayerController {

    public PlayerController(){
        super();
    }


    public void adicionaMusica(Lista lista, String musica) throws Exception {



        String [] vet = musica.split(";");
        Musica msc = new Musica(vet[0], vet[1],  Integer.parseInt(vet[2]));

        if(lista.isEmpty()) {
            lista.addFirst(msc);
        }
        else{
            lista.addLast(msc);
        }

    }


    public void removeMusica(Lista lista, int pos) throws Exception {

        lista.remove(pos);

    }

    public void executaPlaylist(Lista lista) throws Exception {

        if (lista.isEmpty()) {
            throw new Exception("Lista vazia");
        }

        int tam = lista.size();
        int cont = 0;
        System.out.println("Executando Playlist...");
        while(cont < tam) {

            Musica msc = (Musica) lista.get(cont);

            System.out.println("[Música: " + msc.nome.replace(",", " ") + " - Artista: " + msc.nomeArtista.replace(",", " ") + " - Duração: " + msc.duracao + " Segundos");
            Thread.sleep(msc.duracao);
            cont++;
        }

    }



}
