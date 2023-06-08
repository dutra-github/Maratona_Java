package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios ;
    //0 - Bloco de iniciaclização é executado quando a JVM carregar a classe
    //1 - Alocado espaço em memória
    //2 - Cada atributo de classe é criado e inicializado com valors defalt ou o qu for passado
    //3 - Bloco de inicialização é executado
    //4 - Construtor é executado

 static {

        System.out.println("Dentro do bloco de inicialização estatico 1");
        episodios =new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    static {

        System.out.println("Dentro do bloco de inicialização estático 2");
    }
    static {

        System.out.println("Dentro do bloco de inicialização estatico 3");
    }

    {
        System.out.println("Dentro do bloco de inicialização não estatico");
    }
    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime(){

        for (int episodio: Anime.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }



    public int[] getEpisodios() {
        return episodios;
    }


}
