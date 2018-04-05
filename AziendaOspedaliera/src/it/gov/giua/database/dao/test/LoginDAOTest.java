package it.gov.giua.database.dao.test;

import it.gov.giua.database.dao.LoginDAO;
public class LoginDAOTest {

	public static void main(String[] args) {
		LoginDAO.checkUser("admin.rossi", "1234");
		LoginDAO.getCategoria("admin.rossi");
	}

}
