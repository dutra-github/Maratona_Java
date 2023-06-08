package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int [] numeros = new int [3];
        int [] numeros02 = {1,2,3,4,5};
        int[] numeros03 = new int[] {1,2,3,4,5};

        for (int i = 0; i < numeros03.length; i++) {
            System.out.println(numeros03[i]);
        }
        //Versão simplificada para listar todos os valores do array.
        for (int num : numeros03) {
            System.out.println(num);
        }
        //Neste caso seria o mesmo que fazer a impressão de cada espaço referenciado.
//        int num = numeros03[0];
//        System.out.println(num);
//        num = numeros03[1];
//        System.out.println(num);
//        num = numeros03[2];
//        System.out.println(num);
//        num = numeros03[3];
//        System.out.println(num);
//        num = numeros03[4];
//        System.out.println(num);
    }
}
