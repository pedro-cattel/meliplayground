package br.com.playground.aula1;
import java.math.BigDecimal;
public class Produtos {
    /**
     * Para um protótipo de supermercado, crie um programa que leia 3 produtos e imprima no
     * console: nome, preço, quantidade e o valor total da compra.
     * */
    public static void main(String[] args) {
        Produto p1 = new Produto("Carne", 1., 4);
        Produto p2 = new Produto("Sabao", 1., 4);
        Produto p3 = new Produto("Peixe", 1., 6);
        System.out.println("Produto 01: " + p1);
        System.out.println("Produto 02: " + p2);
        System.out.println("Produto 03: " + p3);
        System.out.println("Valor total:" + (p1.getTotalCompra()+p2.getTotalCompra()+p3.getTotalCompra()));
    }
    public static class Produto {
        String nome;
        Double preco;
        int quantidade;
        public Produto(String nome, Double preco, int quantidade) {
            this.nome = nome;
            this.preco = preco;
            this.quantidade = quantidade;
        }
        public String getNome() {
            return nome;
        }
        public Double getPreco() {
            return preco;
        }
        public int getQuantidade() {
            return quantidade;
        }
        public Double getTotalCompra() {
            return this.quantidade * this.preco;
        }
        @Override
        public String toString() {
            return "{" +
                    "nome='" + nome + '\'' +
                    ", preco=" + preco +
                    ", quantidade=" + quantidade +
                    '}';
        }
    }
}