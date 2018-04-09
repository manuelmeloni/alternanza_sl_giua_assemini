package it.gov.giua.model;
import  java.util.Date;
import java.time.LocalDate;

public class Medico extends Dipendente {
	
	//Attributi
	String specializzazione;
	String reparto;
	
	//Costruttori
	public Medico() {
		super();
		this.specializzazione = "Sconosciuto";
		this.reparto = "Sconosciuto";
	}
	public Medico(Medico m) {
		super(m);
		this.specializzazione = m.getSpecializzazione();
		this.reparto = m.getReparto();
	}
	public Medico(String specializzazione, String reparto) {
		super();
		boolean state = false;
		state = this.setSpecializzazione(specializzazione);
		this.specializzazione = (state) ? this.specializzazione : "Sconosciuta";
		state = this.setReparto(reparto);
		this.reparto = (state) ? this.reparto : "Sconosciuto";
	}
	public Medico(Date data_nascita, String nome, String cognome, String codice_fiscale, String email, Date data_assunzione, Date data_licenziamento, int categoria, String username, String password, int id_reparto, String specializzazione, String reparto) {
		super(0, data_nascita, nome, cognome, codice_fiscale, email, data_assunzione, data_licenziamento, categoria, username, password, id_reparto);
		
	}
	
	//Proprietà
	public String getSpecializzazione() {
		return this.specializzazione;
	}
	public boolean setSpecializzazione(String specializzazione) {
		if(specializzazione.length() >= 2 && specializzazione.length() <= 32) {
			for(int i=0; i<specializzazione.length(); i++) {
				if(!(specializzazione.charAt(i) >= 65 && specializzazione.charAt(i) <= 90) || !(specializzazione.charAt(i) >= 97 && specializzazione.charAt(i) <= 122))
					return false;
			}
			this.specializzazione = specializzazione;
			return true;
		}
		else
			return false;
	}
	public String getReparto() {
		return reparto;
	}
	public boolean setReparto(String reparto) {
		if(reparto.length() >= 2 && reparto.length() <= 32) {
			for(int i=0; i<reparto.length(); i++) {
				if(!(reparto.charAt(i) >= 65 && reparto.charAt(i) <= 90) || !(reparto.charAt(i) >= 97 && reparto.charAt(i) <= 122))
					return false;
			}
			this.reparto = reparto;
			return true;
		}
		else
			return false;
	}
	
	//toString
	public String toString() {
		return super.toString() + "Medico [specializzazione=" + specializzazione + ", reparto=" + reparto + "]";
	}
		
	//equals
	public boolean equals(Medico m) {
		if(super.equals(m)) {
			if(this.specializzazione.equals(m.getSpecializzazione()) && this.reparto.equals(m.getReparto()))
				return true;
			return false;
		}
		else
			return false;
	}	
}
