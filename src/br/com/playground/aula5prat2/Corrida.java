package br.com.playground.aula5prat2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Corrida {
    private int distancia;
    private int premioEmDolares;
    private String nome;
    private String quantidadeVeiculosPermitidos;

    public static void main(String[] args) {
        List<Veiculo> listaVeiculos = new ArrayList<>();

        Veiculo subaru = new Carros(250,10,10,"ABC-1234");
        Veiculo moto = new Motos(200, 10,20,"tyu31232");

        registrarCarro(subaru, listaVeiculos);
        registrarCarro(moto, listaVeiculos);
        removerVeiculoo(moto, listaVeiculos);
        removerVeiculoPorPlaca("ABC-1234",listaVeiculos);
    }

    public static void registrarCarro(Veiculo v,List<Veiculo> listaVeiculos){
        listaVeiculos.add(v);
    }

    public void registrarMoto(Veiculo v,List<Veiculo> listaVeiculos){
        listaVeiculos.add(v);
    }

    public static void encontraVencedor(List<Veiculo> listaVeiculos){
        Veiculo element = Collections.max(listaVeiculos, Comparator.comparingInt(Veiculo::getValorMax));
        String veiculoWin = element.toString();
        System.out.println(veiculoWin);
    }

    public static void removerVeiculoo(Veiculo v,List<Veiculo> listaVeiculos){
        for (Veiculo x: listaVeiculos
             ) {
            if ( x == v){
                listaVeiculos.remove(v);
                break;
            }
        }
    }

    public static void removerVeiculoPorPlaca(String placa, List<Veiculo> listaVeiculos){
        listaVeiculos.removeIf(x -> x.getPlaca().equals(placa));
        System.out.println(listaVeiculos.size());
    }

}
