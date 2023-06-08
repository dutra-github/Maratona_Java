package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario01;

public class FuncionarioTest02 {
    public static void main(String[] args) {
        Funcionario01 funcionario01 = new Funcionario01();

        funcionario01.nomefun = "Fabiano Dutra";
        funcionario01.idadefun = 23;
        funcionario01.pagamentos = new double[]{1200, 1500, 2000};

        funcionario01.imprimePagamentos();
        funcionario01.imprimeMediaPagamentos();

    }
}
