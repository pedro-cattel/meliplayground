package br.com.playground.aula1;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collections;

public class Aula3Ex2 {

    public static void main(String[] args) {
        Exercicio1();
    }

    public static void Exercicio1() {
        Integer[] array = {52, 10, 85, 1324, 1, 13, 62, 30, 12, 127};

        Arrays.sort(array);

        // Letra a
        for (Integer integer : array) {
            System.out.println(integer);
        }


    }

    public static void Exercicio2() {
        Integer[] array = {52, 10, 85, 1324, 1, 13, 62, 30, 12, 127};
        Arrays.sort(array, Collections.reverseOrder());

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void Exercicio3() {
        BigDecimal x = new BigDecimal("1.13");
        BigDecimal y = new BigDecimal("18.4");
        int data = 2021;
        while (x.compareTo(y) < 0) {
            System.out.println("Empresa X - 01/01/" + data + " - Valor da Empresa "
                    + x.setScale(2, RoundingMode.HALF_UP) + "M");
            System.out.println("Empresa Y - 01/01/" + data + " - Valor da Empresa "
                    + y.setScale(2, RoundingMode.HALF_UP) + "M");
            x = x.multiply(BigDecimal.valueOf(2.48));
            y = y.multiply(BigDecimal.valueOf(1.32));
            data++;
        }
    }
}
