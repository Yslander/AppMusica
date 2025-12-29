package br.com.alura.appmusica.principal;

import br.com.alura.appmusica.modelos.MinhasPreferidas;
import br.com.alura.appmusica.modelos.Musica;
import br.com.alura.appmusica.modelos.Podcast;

public class Principal {
    public static void main(String[] args){
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Ashes from de sea");
        minhaMusica.setCantor("Visions of Atlantis");

        for (int i = 0; i<1000; i++){
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
            
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Sons do Metal");
        meuPodcast.setApresentador("Land Souza");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();

        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();

        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);



    }
}