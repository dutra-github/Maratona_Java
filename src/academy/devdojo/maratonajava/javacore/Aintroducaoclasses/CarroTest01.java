package academy.devdojo.maratonajava.javacore.Aintroducaoclasses;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        carro1.marca = "Citroen";
        carro1.modelo = "C4 Pallas 2.0";
        carro1.ano = 2014;

        carro2.marca = "Ford";
        carro2.modelo = "Mustang GT 500";
        carro2.ano = 1968;

        System.out.println("Carro 1");
        System.out.println(carro1.marca);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);

        System.out.println("\nCarro 2");
        System.out.println(carro2.marca);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
    }
}
