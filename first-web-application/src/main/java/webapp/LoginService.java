package webapp;

public class LoginService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("Deepa Choudhary") && password.equals("dummy");
	}

}