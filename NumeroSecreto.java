//Olá, meu nome é Luís e hoje eu vou fazer uma nova atividade.
package com.mycompany.numerosecreto;

import java.util.Scanner;
import java.util.Random;

public class NumeroSecreto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        // Número secreto entre 1 e 10
        Random NumeroAleatorio = new Random();
        int NumeroSecreto = NumeroAleatorio.nextInt(1, 11);
        
        int tentativas = 0;
        int N = 0;
        
    do{  
        System.out.println("Tente adivinhar o número secreto, digite de 1 a 10: ");
        try {
        N = scanner.nextInt(); 
        } catch (Exception e) {
        System.out.println("Por favor, digite apenas números inteiros!");
        scanner.next(); 
        continue;
        }
        
        if(N > NumeroSecreto){
            
            System.out.println("O número é menor que esse.");
            System.out.println("Número errado, tente novamente.");
            
        } else if (N < NumeroSecreto) {
            
            System.out.println("O número é maior que esse.");
            System.out.println("Número errado, tente novamente.");
        }
        
        tentativas++;
        }while(N != NumeroSecreto);
            System.out.println("Número correto, parabéns!");

        if (tentativas == 1) { 
        System.out.println("Você acertou em " + tentativas + " tentativa.");
        
        } else if (tentativas > 1) {
        System.out.println("Você acertou em " + tentativas + " tentativas.");
        }

    }
}
