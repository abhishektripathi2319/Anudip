package invalidMailIdException;

import java.util.regex.Pattern;

public class Info {
	private String email;

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) throws InvalidMailIdException{
		if (!Pattern.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9+_.-]+$", email))
			throw new InvalidMailIdException("Your Email is not valid.");
		this.email = email;
	}
	
}
