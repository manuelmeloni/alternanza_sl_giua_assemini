package it.gov.giua.model;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.xml.crypto.Data;

public class Ricovero {
	
	private Date data_ora_ricovero,data_ora_dimissione;
	private String diagnosi,terapia,codice_ricovero;
	private int ID;
	
	
	public Ricovero() {
		super();
	}
	

	public Ricovero(Date data_ora_ricovero,Date data_ora_dimissione,String diagnosi, String terapia,String codice_ricovero) {
		super();
		setData_ora_dimissione(data_ora_dimissione);
		setCodice_ricovero(codice_ricovero);
		setData_ora_ricovero(data_ora_ricovero);
		setDiagnosi(diagnosi);
		setTerapia(terapia);
		
	}

	
	
	
	
	public Date getData_ora_dimissione() {
		return data_ora_dimissione;
	}


	public void setData_ora_dimissione(Date data_ora_dimissione) {
		this.data_ora_dimissione = data_ora_dimissione;
	}


	public Date getData_ora_ricovero() {
		return data_ora_ricovero;
	}


	public void setData_ora_ricovero(Date data_ora_ricovero) {
		this.data_ora_ricovero = data_ora_ricovero;
	}


	public String getTerapia() {
		return terapia;
	}


	public void setTerapia(String terapia) {
		this.terapia = terapia;
	}


	public String getCodice_ricovero() {
		return codice_ricovero;
	}


	public void setCodice_ricovero(String codice_ricovero) {
		this.codice_ricovero = codice_ricovero;
	}


	public String getDiagnosi() {
		return diagnosi;
	}


	public void setDiagnosi(String diagnosi) {
		this.diagnosi = diagnosi;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	
	public int getID() {return ID;}


	@Override
	public String toString() {
		return "Ricovero [data_ora_ricovero=" + data_ora_ricovero + ", data_ora_dimissione=" + data_ora_dimissione
				+ ", diagnosi=" + diagnosi + ", terapia=" + terapia + ", codice_ricovero=" + codice_ricovero + ", ID="
				+ ID + "]";
	}
	



	
}

