package br.com.playground.aula5prat1;

import java.util.*;

public class GuardaRoupa {

    public static int counter = 0;

    public static void main(String[] args) {
        List<Vestuario> x = new ArrayList<>();
        List<Vestuario> p = new ArrayList<>();
        List<Vestuario> espec = new ArrayList<>();
        Map<Integer, List<Vestuario>> dic = new HashMap<Integer, List<Vestuario>>();


        Vestuario t = new Vestuario("Nike", "Jordan");
        Vestuario y = new Vestuario("Adidas", "Ultraboost");
        Vestuario w = new Vestuario("Lacoste", "Polo");

        x.add(t);
        x.add(y);
        p.add(w);

        guardarVestuarios(x, dic);
        guardarVestuarios(x, dic);
        guardarVestuarios(p, dic);
        mostrarVestuarios(dic);

        System.out.println("------ Devolvendo item específico --------");

        espec = devolverVestuarios(2,dic);
        System.out.println(espec);
    }

    public static Integer guardarVestuarios(List<Vestuario> list, Map<Integer, List<Vestuario>> dic){
        dic.put(counter, list);
        return counter++;
    }

    public static void mostrarVestuarios(Map<Integer, List<Vestuario>> x){
        for (Map.Entry entry : x.entrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
    }

    public static List<Vestuario> devolverVestuarios(Integer Id, Map<Integer, List<Vestuario>> x) {
        List<Vestuario> y = x.get(Id);
        return y;
    }

}
