package com.greglixandrao.screenmatch.principal;

import com.greglixandrao.screenmatch.calculos.CalculadoraDeTempo;
import com.greglixandrao.screenmatch.calculos.FiltroRecomendacao;
import com.greglixandrao.screenmatch.modelos.Episodio;
import com.greglixandrao.screenmatch.modelos.Filme;
import com.greglixandrao.screenmatch.modelos.Series;
import com.greglixandrao.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
//        Declarando filme Batman
        Filme filmeBatman = new Filme("Batman", 2020);
        filmeBatman.setDuracaoEmMinutos(180);
        filmeBatman.setIncluidoNoPlano(true);

//        Declarando filme Coringa
        Filme filmeCoringa = new Filme("Coringa", 2022);
        filmeCoringa.setDuracaoEmMinutos(120);
        filmeCoringa.setIncluidoNoPlano(true);

//        Declarando filme Robin
        Filme filmeRobin = new Filme("Robin", 2019);
        filmeRobin.setDuracaoEmMinutos(130);
        filmeRobin.setIncluidoNoPlano(false);

        List<Titulo> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeCoringa);
        listaDeFilmes.add(filmeBatman);
        listaDeFilmes.add(filmeRobin);

        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme da lista: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes + "\n");


//        Exibindo ficha técnica do filme Batman
        filmeBatman.exibeFichaTecnica();
////        Avaliando filme Batman, exibindo o total de avaliações e a média das avaliações
        filmeBatman.avalia(8);
        filmeBatman.avalia(9);
        filmeBatman.avalia(4);
        System.out.println("Total de Avaliações: " + filmeBatman.getTotalAvaliacoes());
        System.out.println(filmeBatman.retornaMediaAvaliacoes());
//        Declarando série Lost
        Series serieLost = new Series("Lost", 2000);
        serieLost.setTemporadas(10);
        serieLost.setEpisodiosPorTemporadas(10);
        serieLost.setMinutosPorEpisodio(50);
////        Exibindo ficha técnica e total de minutos de toda à série
        serieLost.exibeFichaTecnica();
        System.out.println("Duração da temporada para maratonar: " + serieLost.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
//        Incluindo os filmes Batman e Coringa e a séria Lost para calcular o tempo total para assistir tudo.
        calculadora.incluiTitulo(filmeBatman);
        calculadora.incluiTitulo(filmeCoringa);
        calculadora.incluiTitulo(serieLost);

//        Exibindo o tempo total da lista de Títulos
        System.out.println(calculadora.getTempoTotal());

//        Utilizando o Filtro de Recomendação
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtraClassificacao(filmeBatman);

//        Instanciando um novo episódio da série Lost
        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSeries(serieLost);
        episodio.setTotalVisualizacoes(150);
        filtro.filtraClassificacao(episodio);
    }
}
