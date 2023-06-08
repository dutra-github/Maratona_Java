package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        //Imprima todos os números pares de 0 a 1000000.
        //Essa solucçõa quando começar de um numero impar, irá mostrar somente os nuymeros impares.

        for (int numerosPares = 0; numerosPares <= 10; numerosPares = numerosPares + 2) {
            System.out.println(numerosPares);
        }
        //utilizar esta solução.
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }

//        int count = 0;
//        while (count <= 10) {
//            if (count % 2 == 0) {
//                System.out.println(count++);
//
//            }
//
//        }
//
//        int count1 = 0;
//        do {
//            if (count1 % 2 == 0) {
//                System.out.println(count1++);
//            }
//        } while (count1 <= 10);
    }
}

