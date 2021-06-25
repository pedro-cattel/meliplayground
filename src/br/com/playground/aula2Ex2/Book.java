package br.com.playground.aula2Ex2;

public class Book {

    String titulo;
    String autor;
    String isbn;

    public Book(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void emprestimo (){

    }

    public void devolver (){

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
