package academy.devdojo.maratonajava.introducao;

import org.w3c.dom.ls.LSOutput;

/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salario>, na data <data>
 */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Luiz Fabiano Dutra";
        String endereco = "Rua Girassol, 394 - Bairro Velha Central - Blumenau - CEP 89046440 - Santa Catarina - Brasil";
        double salario = 7850.12;
        String dataRecebimentoSalario = "12/12/2022.";
        String relatorio = "Eu "+nome+", morando no endereço "+endereco+", confirmo que recebi o salário de "+salario+", na data "+dataRecebimentoSalario+".";
        System.out.println(relatorio);

    }



}
