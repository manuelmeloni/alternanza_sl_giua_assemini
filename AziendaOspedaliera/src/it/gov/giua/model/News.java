package it.gov.giua.model;

public class News {
	
	private int id;
	private String titolo;
	private String sottotitolo;
	private String testo;
	private boolean abilitato;
	private String tipo;

	
	/**
	 * 
	 */
	public News() {
		super();
	}
	
	/**
	 * 
	 * @param titolo Titolo della news da creare
	 * @param sottotitolo Sottotitolo della news da creare
	 * @param testo Testo della news da creare
	 * @param abilitato Flag che indica se la news è abilitata o meno
	 * @param tipo Tipo della news: esempio C (corso), G (generica), S (specialistica)
	 */
	public News(String titolo, String sottotitolo, String testo, boolean abilitato, String tipo) {
		super();
		this.titolo = titolo;
		this.sottotitolo = sottotitolo;
		this.testo = testo;
		this.abilitato = abilitato;
		this.tipo = tipo;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getSottotitolo() {
		return sottotitolo;
	}
	public void setSottotitolo(String sottotitolo) {
		this.sottotitolo = sottotitolo;
	}
	public String getTesto() {
		return testo;
	}
	public void setTesto(String testo) {
		this.testo = testo;
	}
	public boolean isAbilitato() {
		return abilitato;
	}
	public void setAbilitato(boolean abilitato) {
		this.abilitato = abilitato;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "News [id=" + id + ", titolo=" + titolo + ", sottotitolo=" + sottotitolo + ", testo=" + testo
				+ ", abilitato=" + abilitato + ", tipo=" + tipo + "]";
	}
	
	
	
	
}
