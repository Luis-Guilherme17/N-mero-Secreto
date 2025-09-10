//Olá, meu nome é Luís e hoje eu vou fazer uma nova atividade.
package com.mycompany.numerosecreto;

import java.util.Scanner;
import java.util.Random;

public class NumeroSecreto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        Random NumeroAleatorio = new Random();
        int NumeroSecreto = NumeroAleatorio.nextInt(1, 11);
        
        int tentativas = 0;
        
        
    do{  
        System.out.println("Tente adivinhar o número secreto, digite de 1 a 10: ");
        N = scanner.nextInt();
        
        if(N > NumeroSecreto){
           System.out.println("O número é menor que esse.");
       }else {
           System.out.println("O número digitado é maior que esse.");
       }
        
        if(N != NumeroSecreto){
            System.out.println("Número errado, tente novamente.");
        }
        tentativas++;
        }while(N != NumeroSecreto);
            System.out.println("Número correto, parabéns!");

        System.out.println("Você acertou em " + tentativas + " tentativas.");
       
        scanner.close();
    }
}
