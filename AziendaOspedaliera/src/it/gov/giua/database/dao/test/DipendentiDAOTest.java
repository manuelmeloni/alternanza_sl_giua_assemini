package it.gov.giua.database.dao.test;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import it.gov.giua.database.dao.DipendentiDAO;
import it.gov.giua.model.Dipendente;
import it.gov.giua.model.Utente;

public class DipendentiDAOTest {
	public static void main(String[] args) {
		DipendentiDAO dDAO = new DipendentiDAO();
		Dipendente dMario = new Dipendente(dDAO.getDipendente("mario.conto"));
		List<Utente> uList = new ArrayList<Utente>();
		uList = dDAO.getAllUtentiWithRepartoId(dMario.getIdReparto());
		for(int i=0; i<uList.size(); i++)
			System.out.print(uList.get(i).getNome());
	}
}
