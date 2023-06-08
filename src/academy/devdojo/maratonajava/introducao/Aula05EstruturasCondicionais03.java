package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        //Doar se salario > 5000
        double salario = 3000;
        String mensagemDoar = "Doar 500 reais";
        String mensagemNaoDoar = "Não vou doar";
        //String resultado;
        //Operador ternário
        //(condicao) ? verdadeiro : falso
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);

        System.out.println(salario > 5000 ? mensagemDoar : mensagemNaoDoar);



        // Modo classico/antigo
        if (salario > 5000){
            resultado = mensagemDoar;
        } else {
            resultado = mensagemNaoDoar;
        }
        System.out.println(resultado);


    }
}


