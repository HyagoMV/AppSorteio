package domain.entitie;

public class Participante {
	private Nome nome;
	private Email email;
	private Score score;

	public Participante(Nome nome, Email email, Score score) {
		setNome(nome);
		setEmail(email);
		setScore(score);
	}

	public CharSequence getNome() {
		return nome.getNameValue();
	}

	public CharSequence getEmail() {
		return email.getEmailValue();
	}

	public Integer getScore() {
		return score.getScoreValue();
	}

	private void setNome(Nome nome) {
		this.nome = nome;
	}

	private void setEmail(Email email) {
		this.email = email;
	}

	private void setScore(Score score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Participante [nome=" + getNome() + ", email=" + getEmail() + ", score=" + getScore() + "]";
	}

}
