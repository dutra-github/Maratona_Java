package academy.devdojo.maratonajava.introducao;
public class Aula05EstruturasCondicionais04 {
    //€ 0	€ 34,712	9.70%	27.65%	37.35%
    //€ 34,713	€ 68,507	37.35%	0%	37.35%
    //€ 68,508		49.50%	0%	49.50%
    public static void main(String[] args) {
        double salarioAnual = 55000;
        double primeiraFaixa = 9.70/100;
        double segundaFaixa = 37.35/100;
        double terceiraFaixa = 49.50/100;
        double valorImposto;
        if (salarioAnual <=34712) {
            valorImposto = salarioAnual * primeiraFaixa;
            System.out.println("Você se enquadra na primeira faixa de impostos de 9.7 %");
            System.out.println("O valor do imposto a ser pago é de " +valorImposto + " Euros");
        }else if (salarioAnual>= 34713 && salarioAnual <=68507) {
            valorImposto = salarioAnual*segundaFaixa;
            System.out.println("Você se enquadra na segunda faixa de impostos de 37.35 %");
            System.out.println("O valor do imposto a ser pago é de " +valorImposto + " Euros");
        } else {
            valorImposto = salarioAnual*terceiraFaixa;
            System.out.println("Você se enquadra na terceira faixa de impostos de 49.50 %");
            System.out.println("O valor do imposto a ser pago é de " +valorImposto + " Euros");
        }
    }
}
