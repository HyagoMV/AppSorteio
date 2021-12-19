package domain.entitie;

import java.util.ArrayList;
import java.util.List;

public class Sorteio {
	private List<Participante> participantes;
	private Score score;

	public Sorteio(Score score, List<Participante> participantes) {
		setScore(score);
		this.participantes = participantes;
	}

	public boolean adicionaParticipante(Participante participante) {
		if (participante.getScore() < score.getScoreValue())
			return false;
		return participantes.add(participante);
	}

	public Participante sorteia() {
		var indexSotiado = (int) Math.floor(Math.random() * participantes.size());
		var ganhador = participantes.get(indexSotiado);
		participantes.remove(indexSotiado);
		return ganhador;
	}

	public Score getPontuacao() {
		return score;
	}

	private void setScore(Score score) {
		this.score = score;
	}
}
