package br.com.looplex;

import entites.Estudante;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Estudante estudante = new Estudante();

        System.out.print("Insira a nota da prova oficial: ");
        estudante.nota1 = sc.nextDouble();
        if (estudante.nota1 >= 70.0) {
            System.out.println("Parabens você está aprovado sua nota é: " + estudante.nota1);
            return;
        }
        else {
            System.out.println("Sua nota não foi suficiente sera necessario fazer um prova de recuperacao");
        }
        System.out.print("Insira a nota da prova de recuperacao: ");
        estudante.nota2 = sc.nextDouble();
        if (estudante.nota2 < 50.0) {
            System.out.println("Infelizmente você está reprovado sua nota é: " + estudante.nota2);
            return;
        }
        else if(estudante.nota2 < 70.0) {
            System.out.println("Sua nota é " + estudante.nota2 + ", sera necessario fazer um trabalho complementar");
        }
        else{
            System.out.println("Parabens você está aprovado sua nota é: " + estudante.nota2);
            return;
        }
        System.out.print("Insira a nota do trabalho complementar: ");
        estudante.nota3 = sc.nextDouble();
        if (estudante.nota3 >= 70.0) {
            System.out.println("Parabens você está aprovado sua nota é: " + estudante.nota3);
            return;
        }
        else {
            System.out.println("Infelizmente você está reprovado sua nota é: " + estudante.nota3);
        }
        sc.close();
    }
}
