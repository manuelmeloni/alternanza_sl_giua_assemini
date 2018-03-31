package it.gov.giua.model;

import java.util.Date;
import java.util.Calendar;

public class Dipendenti {
	
	private Date data_nascita;
	private String nome;
	private String cognome;
	private String codice_fiscale;
	private String email;
	private Date data_assunzione;
	private Date data_licenziamento;
	private int categoria; //0 per Amministratore, 1 Dipendente Altro, 2 Dipendente Medico
	private String username;
	private String password;
	
		public Dipendenti() {
			
			Date data_nascita = new Date();
			nome = "";
			cognome = "";
			codice_fiscale = "";
			email = "";
			Date data_assunzione = new Date(); 
			Date data_licenziamento = new Date();
			categoria = 000;
			username = "";
			password = "";
						
		}
		
		public Dipendenti(Date data_nascita, String nome, String cognome, String codice_fiscale, String email, Date data_assunzione, Date data_licenziamento, int categoria, String username, String password) {
			
			this.data_nascita = data_nascita;
			this.nome = nome;
			this.cognome = cognome;
			this.codice_fiscale = codice_fiscale;
			this.email = email;
			this.data_assunzione = data_assunzione;
			this.data_licenziamento = data_licenziamento;
			this.categoria = categoria;
			this.username = username;
			this.password = password;
			
		}
		
			//getters and setters

		public Date getData_nascita() {
			return data_nascita;
		}

		public void setData_nascita(Date data_nascita) {
			this.data_nascita = data_nascita;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getCognome() {
			return cognome;
		}

		public void setCognome(String cognome) {
			this.cognome = cognome;
		}

		public String getCodice_fiscale() {
			return codice_fiscale;
		}

		public void setCodice_fiscale(String codice_fiscale) {
			this.codice_fiscale = codice_fiscale;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Date getData_assunzione() {
			return data_assunzione;
		}

		public void setData_assunzione(Date data_assunzione) {
			this.data_assunzione = data_assunzione;
		}

		public Date getData_licenziamento() {
			return data_licenziamento;
		}

		public void setData_licenziamento(Date data_licenziamento) {
			this.data_licenziamento = data_licenziamento;
		}

		public int getCategoria() {
			return categoria;
		}

		public void setCategoria(int categoria) {
			this.categoria = categoria;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		
			//toString
		
		public String toString() {
			
			return "Dipendenti [data_nascita=" + data_nascita + ", nome=" + nome + ", cognome=" + cognome
					+ ", codice_fiscale=" + codice_fiscale + ", email=" + email + ", data_assunzione=" + data_assunzione
					+ ", data_licenziamento=" + data_licenziamento + ", categoria=" + categoria + ", username="
					+ username + ", getData_nascita()=" + getData_nascita() + ", getNome()=" + getNome()
					+ ", getCognome()=" + getCognome() + ", getCodice_fiscale()=" + getCodice_fiscale()
					+ ", getEmail()=" + getEmail() + ", getData_assunzione()=" + getData_assunzione()
					+ ", getData_licenziamento()=" + getData_licenziamento() + ", getCategoria()=" + getCategoria()
					+ ", getUsername()=" + getUsername() + "]";
			
		}

			//hashCode
		
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + categoria;
			result = prime * result + ((codice_fiscale == null) ? 0 : codice_fiscale.hashCode());
			result = prime * result + ((cognome == null) ? 0 : cognome.hashCode());
			result = prime * result + ((data_assunzione == null) ? 0 : data_assunzione.hashCode());
			result = prime * result + ((data_licenziamento == null) ? 0 : data_licenziamento.hashCode());
			result = prime * result + ((data_nascita == null) ? 0 : data_nascita.hashCode());
			result = prime * result + ((email == null) ? 0 : email.hashCode());
			result = prime * result + ((nome == null) ? 0 : nome.hashCode());
			result = prime * result + ((password == null) ? 0 : password.hashCode());
			result = prime * result + ((username == null) ? 0 : username.hashCode());
			return result;
		}
		

			//equals
		
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Dipendenti other = (Dipendenti) obj;
			if (categoria != other.categoria)
				return false;
			if (codice_fiscale == null) {
				if (other.codice_fiscale != null)
					return false;
			} else if (!codice_fiscale.equals(other.codice_fiscale))
				return false;
			if (cognome == null) {
				if (other.cognome != null)
					return false;
			} else if (!cognome.equals(other.cognome))
				return false;
			if (data_assunzione == null) {
				if (other.data_assunzione != null)
					return false;
			} else if (!data_assunzione.equals(other.data_assunzione))
				return false;
			if (data_licenziamento == null) {
				if (other.data_licenziamento != null)
					return false;
			} else if (!data_licenziamento.equals(other.data_licenziamento))
				return false;
			if (data_nascita == null) {
				if (other.data_nascita != null)
					return false;
			} else if (!data_nascita.equals(other.data_nascita))
				return false;
			if (email == null) {
				if (other.email != null)
					return false;
			} else if (!email.equals(other.email))
				return false;
			if (nome == null) {
				if (other.nome != null)
					return false;
			} else if (!nome.equals(other.nome))
				return false;
			if (password == null) {
				if (other.password != null)
					return false;
			} else if (!password.equals(other.password))
				return false;
			if (username == null) {
				if (other.username != null)
					return false;
			} else if (!username.equals(other.username))
				return false;
			return true;
			
		}
		
		
		
		
		
		
		
		
			
	

}
