package com.greglixandrao.screenmatch.principal;

import com.greglixandrao.screenmatch.modelos.Filme;
import com.greglixandrao.screenmatch.modelos.Series;
import com.greglixandrao.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalComListas {
    public static void main(String[] args) {


        Filme filmeBatman = new Filme("Batman", 2020);
        filmeBatman.avalia(8);
        Filme filmeCoringa = new Filme("Coringa", 2022);
        filmeCoringa.avalia(7);
        Filme filmeRobin = new Filme("Robin", 2019);
        filmeRobin.avalia(10);
        Series serieLost = new Series("Lost", 2000);

        List<Titulo> listaDeAssistidos = new ArrayList<>();
        listaDeAssistidos.add(filmeCoringa);
        listaDeAssistidos.add(filmeBatman);
        listaDeAssistidos.add(filmeRobin);
        listaDeAssistidos.add(serieLost);

//        listaDeAssistidos.forEach(filme -> System.out.println(filme)); lambda
//        listaDeAssistidos.forEach(System.out::println); Method Reference
        for (Titulo item : listaDeAssistidos) {
            System.out.println(item.getNome() + " " + item.getAnoDeLancamento());
            if (item instanceof Filme filme) {
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }

        Collections.sort(listaDeAssistidos);
        System.out.println(listaDeAssistidos);

        listaDeAssistidos.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano: " + listaDeAssistidos);
    }
}
