package com.greglixandrao.screenmatch.calculos;

import com.greglixandrao.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void incluiTitulo(Titulo titulo) {
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
