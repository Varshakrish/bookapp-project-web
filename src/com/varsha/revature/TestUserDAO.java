package com.varsha.revature;

public class TestUserDAO {
	
		 
	    public static void main(String[] args) throws Exception {
	 
	        User user = new User();
	        user.setId(2);
	        user.setName("varsa");
	        user.setEmail("asj@gmail.com");
	        user.setPassword("154");
	 
	        UserDAO userDAO = new UserDAO();
	        userDAO.register(user);
	 
	    }
	 
	}
