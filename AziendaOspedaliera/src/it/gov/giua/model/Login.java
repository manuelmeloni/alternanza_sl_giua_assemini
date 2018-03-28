package it.gov.giua.model;

public class Login {
	private int id;
	private String nome;
	private String cognome;
	private int categoria;
	private String username;
	private String password;
	
	public Login() {
		this.id=0;
		this.nome="nome";
		this.cognome="cognome";
		this.categoria=1;
		this.username="username";
		this.password="password";
	}
	
	public Login(int id, String nome, String cognome, int categoria, String username, String password){
		setId(id);
		setNome(nome);
		setCognome(cognome);
		setCategoria(categoria);
		setUsername(username);
		setPassword(password);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
}
