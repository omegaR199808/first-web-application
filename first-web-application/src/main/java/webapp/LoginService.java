package webapp;

//this is a login page
public class LoginService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("Deepa Choudhary") && password.equals("dummy");
	}

}
