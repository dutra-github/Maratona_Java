package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro.setVelocidadeLimite(180);
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Porsche", 350);
        Carro c3 = new Carro("Mercedes", 290);

        c1.imprime();
        c2.imprime();
        c3.imprime();

    }
}
