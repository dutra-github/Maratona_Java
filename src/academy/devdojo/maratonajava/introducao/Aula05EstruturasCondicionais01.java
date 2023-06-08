package academy.devdojo.maratonajava.introducao;
public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida Alcoolica");
        } else {
            System.out.println("Sua idade é menos que 18 anos. Você não está autorizada a comprar bebidas alcoolicas");
        }

        if (isAutorizadoComprarBebida == false) {
            System.out.println("Sua idade não Autoriza comprar bebidas alcoolicas");
        }
        if (!isAutorizadoComprarBebida) {  //(Mesmo que usar == false)
         System.out.println("Não autorizado a comprar bebidas e/ou cigarros");
    }
        boolean c = false;
        if (c==true) {
            System.out.println("Dentro de algo que não deve ser feito");
        }
    }
}




