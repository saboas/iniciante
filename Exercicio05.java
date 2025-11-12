package Iniciante;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
    //entrada
    Scanner entrada = new Scanner (System.in);
    System.out.println("Conversor de metro para centimetro 3000:");
        double centimetro = 100 * entrada.nextDouble();
        
    //saida
        System.out.print(centimetro);
        
        System.out.println(" cm");
        


        entrada.close();
         
    }
 
    
}
