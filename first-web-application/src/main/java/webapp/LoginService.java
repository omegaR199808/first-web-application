package webapp;

public class LoginService {
	//This is a Java class which is used to validate the User
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("Gaurav Yadav") && password.equals("dummy");
	}

}
