package domain.entitie;

public class Score {
	private Integer value;

	public Score(Integer value) {
		setValue(value);
	}

	public Integer getScoreValue() {
		return value;
	}

	private void setValue(Integer value) {
		if (value < 0)
			throw new IllegalArgumentException("Score < 0");
		this.value = value;
	}

	
}
