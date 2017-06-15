package com.varsha.revature;

public class UserLoginTest {
	public static void main(String[] args) throws Exception {
		UserDAO userDAO = new UserDAO();
		String email = "paulamerlin1977022@gmail.com";
		String password = "merlin97";
		User user = userDAO.login(email, password);
		System.out.println(user);
	}

}
