package it.gov.giua.model;
import java.util.Date;
import java.time.LocalDate;

public class Dipendente {
	
	//Attributi
	private static int id = 0;
	private int id_dipendente;
	private Date data_nascita;
	private String nome;
	private String cognome;
	private String codice_fiscale;
	private String email;
	private Date data_assunzione;
	private Date data_licenziamento;
	private int categoria; //0 per Amministratore, 1 Dipendente Medico, 2 Dipendente Altro
	private String username;
	private String password;
	
	//Costruttori
	public Dipendente() {
		this.setIdDipendente();
		this.data_nascita = new Date();
		nome = "Sconosciuto";
		cognome = "Sconosciuto";
		codice_fiscale = "Sconosciuto";
		email = "Sconosciuto";
		this.data_assunzione = new Date();
		this.data_licenziamento = new Date();
		categoria = 000;
		username = "Sconosciuto";
		password = "Sconosciuto";			
	}
	public Dipendente(Dipendente d) {
		this.setIdDipendente();
		this.data_nascita = d.getDataNascita();
		this.nome = d.getNome();
		this.cognome = d.getCognome();
		this.codice_fiscale = d.getCodiceFiscale();
		this.email = d.getEmail();
		this.data_assunzione = d.getDataAssunzione();
		this.data_licenziamento = d.getDataLicenziamento();
		this.categoria = d.getCategoria();
		this.username = d.getUsername();
		this.password = d.getPassword();
	}
	public Dipendente(Date data_nascita, String nome, String cognome, String codice_fiscale, String email, Date data_assunzione, Date data_licenziamento, int categoria, String username, String password) {
		this.setIdDipendente();
		boolean state = false;
		state = this.setDataNascita(data_nascita);
		this.data_nascita = (state) ? this.data_nascita : new Date(LocalDate.now().getYear(), LocalDate.now().getMonthValue(), LocalDate.now().getDayOfMonth());
		state = this.setNome(nome);
		this.nome = (state) ? this.nome : "Sconosciuto";
		state = this.setCognome(cognome);
		this.cognome = (state) ? this.cognome : "Sconosciuto";
		state = this.setCodiceFiscale(codice_fiscale);
		this.codice_fiscale = (state) ? this.codice_fiscale : "0000000000000000";
		state = this.setEmail(email);
		this.email = (state) ? this.email : "Sconosciuto";
		state = this.setDataAssunzione(data_assunzione);
		this.data_assunzione = (state) ? this.data_assunzione : new Date(0, 0, 0);
		state = this.setDataLicenziamento(data_licenziamento);
		this.data_licenziamento = (state) ? this.data_licenziamento : new Date(0, 0, 0);
		state = this.setCategoria(categoria);
		this.categoria = (state) ? this.categoria : 2;
		state = this.setUsername(username);
		this.username = (state) ? this.username : "Sconosciuto";
		state = this.setPassword(password);
		this.password = (state) ? this.password : "000000000000";
	}
	
	//Proprietà
	private void setIdDipendente() {
		this.id_dipendente = ++this.id;
	}
	public int getIdDipendente() {
		return this.id_dipendente;
	}
	public Date getDataNascita() { //restituisce la data_nascita come oggetto LocalDate
		return this.data_nascita;
	}
	public String getDataNascitaString() { //restituisce la data_nascita come oggetto String, nel formato di SQL (AAAA-MM-GG)
		return this.data_nascita.getYear() + "-" + this.data_nascita.getMonth() + "-" + this.data_nascita.getDay();
	}
	public boolean setDataNascita(Date data_nascita) {
		if(data_nascita.getYear() >= LocalDate.now().getYear() - 70 && data_nascita.getYear() <= LocalDate.now().getYear()) {
			this.data_nascita = data_nascita;
			return true;
		}
		else
			return false;
	}
	public String getNome() {
		return this.nome;
	}
	public boolean setNome(String nome) {
		if(nome.length() >= 2 && nome.length() <= 32) {
			for(int i=0; i<nome.length(); i++) {
				if(!(nome.charAt(i) >= 65 && nome.charAt(i) <= 90) || !(nome.charAt(i) >= 97 && nome.charAt(i) <= 122))
					return false;
			}
			this.nome = nome;
			return true;
		}
		else {
			return false;
		}
	}
	public String getCognome() {
		return this.cognome;
	}
	public boolean setCognome(String cognome) {
		if(cognome.length() >= 2 && cognome.length() <= 32) {
			for(int i=0; i<nome.length(); i++) {
				if(!(cognome.charAt(i) >= 65 && cognome.charAt(i) <= 90) || !(cognome.charAt(i) >= 97 && cognome.charAt(i) <= 122))
					return false;
			}
			this.cognome = cognome;
			return true;
		}
		else
			return false;
	}
	public String getCodiceFiscale() {
		return this.codice_fiscale;
	}
	public boolean setCodiceFiscale(String codice_fiscale) {
		if(codice_fiscale.length() == 16) {
			for(int i=0; i<codice_fiscale.length(); i++) {
				if(!(codice_fiscale.charAt(i) >= 65 && codice_fiscale.charAt(i) <= 90) || !(codice_fiscale.charAt(i) >= 48 && codice_fiscale.charAt(i) <= 57))
					return false;
			}
			this.codice_fiscale = codice_fiscale;
			return true;
		}
		else
			return false;
	}
	public String getEmail() {
		return this.email;
	}
	public boolean setEmail(String email) {
		boolean state = false;
		if(email.length() >= 8  && email.length() <= 64) {
			for(int i=0; i<email.length(); i++) {
				if(email.charAt(i) == '@' && !state)
					state = true;
				if(email.charAt(i) == '.' && state)
					return true;
			}
			return false;
		}
		else
			return false;
	}
	public Date getDataAssunzione() {
		return this.data_assunzione;
	}
	public String getDataAssunzioneString() { //restituisce la data come oggetto String nel formato AAAA-MM-GG
		return this.data_assunzione.getYear() + "-" + this.data_assunzione.getMonth() + "-" + this.data_assunzione.getDay();
	}
	public boolean setDataAssunzione(Date data_assunzione) {
		if(data_assunzione.getYear() >= LocalDate.now().getYear() - 70 && data_assunzione.getYear() <= LocalDate.now().getYear()) {
			this.data_assunzione = data_assunzione;
			return true;
		}
		else
			return false;
	}
	public Date getDataLicenziamento() {
		return data_licenziamento;
	}
	public String getDataLicenziamentoString() { //restituisce la data come oggetto String nel formato AAAA-MM-GG
		return this.data_licenziamento.getYear() + "-" + this.data_licenziamento.getMonth() + "-" + this.data_licenziamento.getDay();
	}
	public boolean setDataLicenziamento(Date data_licenziamento) {
		if(data_licenziamento.getYear() >= this.data_assunzione.getYear() && data_licenziamento.getYear() <= LocalDate.now().getYear()) {
			this.data_licenziamento = data_licenziamento;
			return true;
		}
		else
			return false;
	}
	public int getCategoria() {
		return categoria;
	}
	public boolean setCategoria(int categoria) {
		if(categoria >= 0 && categoria <= 2) {
			this.categoria = categoria;
			return true;
		}
		else
			return false;
	}
	public String getUsername() {
		return username;
	}
	public boolean setUsername(String username) {
		if(username.length() >= 2 && username.length() <= 16) {
			if(!(username.charAt(0) >= 65 && username.charAt(0) <= 90) && !(username.charAt(0) >= 97 && username.charAt(0) <= 122))
				return false;
			else {
				for(int i=0; i<username.length(); i++) {
					if(!(username.charAt(i) >= 65 && username.charAt(i) <= 90) || !(username.charAt(i) >= 48 && username.charAt(i) <= 57) || !(username.charAt(i) == '_'))
						return false;
				}
				this.username = username;
				return true;
			}
		}
		else
			return false;
	}
	public String getPassword() {
		return password;
	}
	public boolean setPassword(String password) {
		if(password.length() >= 8 && password.length() <= 16) {
			for(int i=0; i<password.length(); i++) {
				if(!(password.charAt(i) >= 65 && password.charAt(i) <= 90) || !(password.charAt(i) >= 48 && password.charAt(i) <= 57) || !(password.charAt(i) >= 97 && password.charAt(i) <= 122))
					return false;
			}
			this.password = password;
			return true;
		}
		else
			return false;
	}
	
	//toString
	public String toString() { //ritorna un oggetto String contenente tuttii campi dell'istanza, separati dalla virgola (,)
		return this.id_dipendente + "," + this.getDataNascitaString() + "," + this.nome + "," + this.cognome + "," + this.codice_fiscale + "," + this.email + "," + this.getDataAssunzioneString() + "," + this.getDataLicenziamentoString() + "," + this.categoria + "," + this.username + "," + this.password;
	}
	
	//equals
	public boolean equals(Dipendente d) {
		if(this.data_nascita.equals(d.getDataNascita()) && this.nome.equals(d.getNome()) && this.cognome.equals(d.getCognome()) && this.codice_fiscale.equals(d.getCodiceFiscale()) && this.data_assunzione.equals(d.getDataAssunzione()) && this.data_licenziamento.equals(d.getDataLicenziamento()) && this.categoria == d.getCategoria() && this.username.contentEquals(d.getUsername()) && this.password.contentEquals(d.getPassword()))
			return true;
		return false;
	}
}
