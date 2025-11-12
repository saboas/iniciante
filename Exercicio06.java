package Iniciante;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
       //entrada
       Scanner entrada = new Scanner(System.in);
       double a = entrada.nextDouble();
       System.out.println("Insira o raio:");
       double raio = 3.14 * a * a; 

       //resultado
       System.out.println("Área da circunferência:");
       System.out.print(raio);
       System.out.println(" cm²");

       entrada.close();
    }
    
}
