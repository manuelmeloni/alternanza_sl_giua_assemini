package it.gov.giua.model;
import java.util.Date;
import java.util.Calendar;

public class Prelievi {
	
	private int id_prelievo;
	private Date data_ora_prelievo;
	private Date data_ora_fine ;
	private String codice_visita ;
	private String referto;
	private int dipendenti_id_dipendente;

	
	/**
	 * 
	 */
	public Prelievi() {
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
	public Prelievi(int id_prelievo, Date data_ora_prelievo, Date data_ora_fine , String codice_visita,int dipendenti_id_dipendente,String referto) {
		super();
		this.id_prelievo=id_prelievo;	
		this.data_ora_prelievo=data_ora_prelievo;
		this.data_ora_fine=data_ora_fine;
		this.codice_visita=codice_visita;
		this.dipendenti_id_dipendente=dipendenti_id_dipendente;
		this.referto=referto;
	}


	public int getId_prelievi() {
		return id_prelievo;
	}
	public void setId_prelievo(int id_prelievo) {
		this.id_prelievo = id_prelievo;
	}
	

	public Date getData_ora_prelievo() {
		return data_ora_prelievo;
	}

	public Date getData_ora_fine() {
		return data_ora_fine;
	}

	public String getCodice_visita() {
		return codice_visita;
	}

	public String getReferto() {
		return referto;
	}

	public int getDipendenti_id_dipendente() {
		return dipendenti_id_dipendente;
	}

	public void setData_ora_prelievo(Date data_ora_prelievo) {
		this.data_ora_prelievo = data_ora_prelievo;
	}

	public void setData_ora_fine(Date data_ora_fine) {
		this.data_ora_fine = data_ora_fine;
	}

	public void setCodice_visita(String codice_visita) {
		this.codice_visita = codice_visita;
	}

	public void setReferto(String referto) {
		this.referto = referto;
	}

	public void setDipendenti_id_dipendente(int dipendenti_id_dipendente) {
		this.dipendenti_id_dipendente = dipendenti_id_dipendente;
	}

	@Override
	public String toString() {
		return "Prelievi [id_prelievo=" + id_prelievo + ", data_ora_prelievo=" + data_ora_prelievo + ", data_ora_fine="
				+ data_ora_fine + ", codice_visita=" + codice_visita + ", referto=" + referto
				+ ", dipendenti_id_dipendente=" + dipendenti_id_dipendente + "]";
	}
}
	