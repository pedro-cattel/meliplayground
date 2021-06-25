package br.com.playground.aula2Ex2;

public class Counter {

    private static int counter;

    public static void main(String[] args) {
        aumentaCounter(counter);
        System.out.println(counter);
    }

    public static void aumentaCounter(int counter){
        counter++;
    }

    public static void diminuiCounter(int counter){
        counter--;
    }
}
