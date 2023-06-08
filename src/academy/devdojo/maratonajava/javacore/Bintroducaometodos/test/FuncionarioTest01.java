package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Fabiano");
        funcionario.setIdade(43);
        funcionario.setSalarios(new double[]{1200,987.32,2000}) ;

        funcionario.imprime();
       // funcionario.setMedia(10000);
        //System.out.println("Média "+ funcionario.getMedia());
        //funcionario.imprimeMediasalario();
    }
}
