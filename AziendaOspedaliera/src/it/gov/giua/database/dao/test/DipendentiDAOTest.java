package it.gov.giua.database.dao.test;

import it.gov.giua.database.dao.DipendentiDAO;

public class DipendentiDAOTest {

	public static void main(String[] args) {
		DipendentiDAO d = new DipendentiDAO();
		int id = d.getIdDipendente("mario.conto");
    	System.out.println("Ciao " + id);
	}
}
