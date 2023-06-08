package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean
        int idade = (int) 10000000000L;
        long numeroGrande = (long)155.23;
        double salarioDouble = 2000.0D;
        double salarioFloat = 2500.0F;
        byte idadeByte = 127;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';
        String nome = "Giraya";

        //Alterado a liguagem para Java 8 - var só funciona a partir da versão 10.
        //var nome2 = "Vegeta";

        System.out.println("A idade é " + idade + " anos");
        System.out.println(verdadeiro);
        System.out.println("char" + caractere);
        System.out.println(numeroGrande);
        System.out.println("Meu nome é "+nome);

    }
}
