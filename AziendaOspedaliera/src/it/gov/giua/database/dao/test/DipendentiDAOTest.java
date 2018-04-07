package it.gov.giua.database.dao.test;

import it.gov.giua.database.dao.DipendentiDAO;
import it.gov.giua.model.Dipendente;

public class DipendentiDAOTest {

	public static void main(String[] args) {
		DipendentiDAO d = new DipendentiDAO();
		Dipendente mar = new Dipendente(d.getDipendente("mario.conto"));
		System.out.println(mar);
	}
}
