package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.test.FuncionarioTest02;

public class Funcionario01 {
    public String nomefun;
    public int idadefun;
    public double[] pagamentos;

    public void imprimePagamentos(){
        System.out.println(this.nomefun);
        System.out.println(this.idadefun);

//        System.out.println(this.pagamentos[0]);
//        System.out.println(this.pagamentos[1]);
//        System.out.println(this.pagamentos[2]);
        for (double pagamento:pagamentos) {
            System.out.print(pagamento+ " ");

        }
    }
    public  void  imprimeMediaPagamentos(){
        double media = 0;
        for (double pagamento:pagamentos) {
            media += pagamento;
        }
        media /= pagamentos.length;
        System.out.println("\nMedia Salarial "+ media);

    }

}

