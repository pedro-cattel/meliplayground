package br.com.playground.aula1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Aula3Ex1 {

    public static void main(String[] args) {
        exercicio1();
        exercicio2();
        exercicio3();
        exercicio5();
    }

    public static void exercicio1 (){

        Scanner ler = new Scanner(System.in);
        int n = ler.nextInt();
        for (int i = 0; i < n; i++) {
            if ((i % 2) == 0){
                System.out.println(i);
            }
        }


    }

    public static void exercicio2 (){
        Scanner ler = new Scanner(System.in);
        int n = ler.nextInt();
        int m = ler.nextInt();

        ArrayList<Integer> pares = new ArrayList<Integer>();

        while (pares.size() < n)

        for (int i = 0; i < m*n ; i++) {
            if (i % m == 0) {
                pares.add(i);
            }
        }
        System.out.println(pares);

    }

    public static void exercicio3(){
        Scanner ler = new Scanner(System.in);
        int n = ler.nextInt();
        if (n % n != 0){
            System.out.println("Não é primo");
        }else{
            System.out.println("É primo");
        }

    }

    public static void exercicio5 (){
        int numero, qtdRepeticoes;

        Scanner scaner = new Scanner(System.in);

        int n = scaner.nextInt();
        int m = scaner.nextInt();
        int d = scaner.nextInt();

        numero = (int) Math.pow(10, m-1) * d;

        Collection<Integer> numerosEscolhidos = new LinkedHashSet<>();


        while(numerosEscolhidos.size() < n) {
            qtdRepeticoes = 0;

            for (char ch: Double.toString(numero).toCharArray()) {
                if (Character.getNumericValue(ch) == d)
                    qtdRepeticoes++;
            };

            if (qtdRepeticoes >= m)
                numerosEscolhidos.add(numero);

            numero++;
        }

        numerosEscolhidos.forEach(System.out::println);




    }




}
