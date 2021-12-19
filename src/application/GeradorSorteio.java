package application;

import java.util.ArrayList;
import java.util.List;

import domain.Participante;
import domain.Score;
import domain.Sorteio;

public class GeradorSorteio {
    
    private Sorteio sorteio;
    private ParticipanteRepositorio repositorio;

    public GeradorSorteio(Score score, ParticipanteRepositorio repositorio) {
        sorteio = new Sorteio(score);
        this.repositorio = repositorio;
        init();
    }

    private void init() {
        var participantes = repositorio.bucaPorTodos();
        participantes.forEach(sorteio::adicionaParticipante);
    }

    public List<Participante> sortear(Integer numGanhadores) {
        var ganhadores = new ArrayList<Participante>(numGanhadores);
        for (var i = 0; i < numGanhadores; i++) {
            ganhadores.add(sorteio.sorteia());
        }
        return ganhadores;
    }
}
