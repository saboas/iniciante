package Iniciante;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    System.out.println("Digite a nota do primeiro bimestre:");
        double nota1 = entrada.nextDouble();
    System.out.println("Digite a nota do segundo bimestre:");
        double nota2 = entrada.nextDouble();
    System.out.println("Digite a nota do terceiroo bimestre:");
        double nota3 = entrada.nextDouble();
    System.out.println("Digite a nota do quarto bimestre:");
        double nota4 = entrada.nextDouble();
        double a = nota1 + nota2 + nota3 + nota4;
        double b = a/4; 
    System.out.println(b);
    entrada.close();
    }
}