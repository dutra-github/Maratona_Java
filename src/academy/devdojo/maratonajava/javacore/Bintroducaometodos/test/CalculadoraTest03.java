package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.divideDoisNumeros(20,2);
        double result = calculadora.divideDoisNumeros(20,2);
        //calculadora.imprimeDivisaoDeDoisNumeros(30,3);
        System.out.println(result);
        System.out.println(calculadora.divideDoisNumeros(25,0));
        System.out.println(calculadora.divideDoisNumeros2(20,2));

        System.out.println("-----------------------------------------------");

        calculadora.imprimeDivisaoDeDoisNumeros(30,5);
    }
}
