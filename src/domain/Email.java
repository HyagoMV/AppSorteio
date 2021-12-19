package domain;

import java.util.regex.Pattern;

public class Email {
	private CharSequence value;

	public Email(CharSequence email) {
		setEmail(email);
	}

	public CharSequence getEmailValue() {
		return value;
	}

	private void setEmail(CharSequence email) {
		var pattern = Pattern.compile("\\w+@\\w+(\\.?\\w)*", Pattern.CASE_INSENSITIVE);
		if (!pattern.matcher(email).matches())
			throw new IllegalArgumentException("E-mail");
		this.value = email;
	}
	
	
}
