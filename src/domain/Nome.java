package domain;

import java.util.regex.Pattern;

public class Nome {
	private CharSequence value;

	public Nome(CharSequence value) {
		setValue(value);
	}

	public CharSequence getNameValue() {
		return value;
	}

	private void setValue(CharSequence value) {
		var length = value.length(); // Cache
		if (length < 20)
			throw new IllegalArgumentException("Nome < 20");
		
		if (length > 80)
			throw new IllegalArgumentException("Nome > 80");
		
		var pattern = Pattern.compile("[a-z\s]+", Pattern.CASE_INSENSITIVE);
		if (!pattern.matcher(value).matches())
			throw new IllegalArgumentException("Nome pattern");
		
		this.value = value;
	}

}
