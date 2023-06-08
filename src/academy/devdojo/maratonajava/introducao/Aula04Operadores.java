package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // +  - /  *
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01/ (double)numero02;
       /* System.out.println(numero02+numero01 +"Valor " +numero02+numero01);
        System.out.println(resultado);

        //%
        int resto = 20%3;
        System.out.println(resto);

        // < > <= >= == !=
        //retornam sempre valores booleanos
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferentelDez = 10 != 10;

        System.out.println("isDezMaiorQueVinte = "+ isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte = "+ isDezMenorQueVinte);
        System.out.println("isDezIgualVinte = "+ isDezIgualVinte);
        System.out.println("isDezIgualDez = "+ isDezIgualDez);
        System.out.println("isDezDiferentelDez = "+ isDezDiferentelDez);

        //&& (AND)  || (or) !

        int idade = 29;
        float salario = 3380;
        boolean isIdadeMaiorQueTrinta = idade >= 30;
        boolean isIdadeMenorQueTrinta = idade <= 30;

        boolean isDentroDaLeiMaiorIdadeSalario = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorIdadeSalario = idade <=30 && salario <= 3381;
        System.out.println("isIdadeMaiorQueTrinta " + isIdadeMaiorQueTrinta);
        System.out.println("isIdadeMenorQueTrinta " + isIdadeMenorQueTrinta);

        System.out.println("isDentroDaLeiMaiorIdadeSalario " + isDentroDaLeiMaiorIdadeSalario);
        System.out.println("isDentroDaLeiMenorIdadeSalario " + isDentroDaLeiMenorIdadeSalario);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPopanca = 10000;
        float valorPlayStation = 5000F;

        boolean isPlayStationCincoCompravel = valorTotalContaCorrente > valorPlayStation || valorTotalContaPopanca > valorPlayStation;
        System.out.println("isPlayStationCincoCompravel "+ isPlayStationCincoCompravel);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus+=1000; //2800
        bonus-=1000; //1800
        bonus *=2; //3600
        bonus /=2; //1800
        bonus %=2; //0.0
        System.out.println(bonus);

        // ** --
        //contador = contador + 1
        int contador = 0;
        contador += 1; // 1
        contador++; // 2
        contador--; // 1
        ++contador; // 2
        --contador; // 1 */

        int contador2 = 0;
        System.out.println(contador2++); // 0
        System.out.println(contador2); // 1
        System.out.println(contador2--); // 1
        System.out.println(contador2); // 0
        System.out.println(++contador2); // 1
        System.out.println(contador2); // 1

       // System.out.println(contador);

    }
}
