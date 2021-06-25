package br.com.playground.aula2Ex2;

public class Fracao {

    int x;
    int y;
    int w;

    public int adicao (int x, int y){
    int z = 0;
    z = x + y;
        return z;
    }

    public int adicao (int x, int w, int y){
        int z = 0;
        z = (x/w) + y;
        return z;
    }

    public int subtracao (int x, int y){
        int z = 0;
        z = x - y;
        return z;
    }

    public int subtracao (int x, int w, int y){
        int z = 0;
        z = (x/w) - y;
        return z;
    }

    public int divisao (int x, int y){
        int z = 0;
        z = x / y;
        return z;
    }

    public int divisao (int x,int w, int y){
        int z = 0;
        z = (x/w) / y;
        return z;
    }

    public int multiplicacao (int x, int y){
        int z = 0;
        z = x * y;
        return z;
    }

    public int multiplicacao (int x, int w, int y){
        int z = 0;
        z = (x/w) * y;
        return z;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
