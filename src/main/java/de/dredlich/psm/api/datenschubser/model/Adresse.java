package de.dredlich.psm.api.datenschubser.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Adresse generated by hbm2java
 */
@Entity
@Table(name = "ADRESSE")
public class Adresse implements ISetItem
{
	@Id
	@Column(name = "ADRESSE_NR", nullable = false, precision = 22)
	private Long adresseNr;

	@Column(name = "FIRMA", length = 40)
	private String firma;

	@Column(name = "FIRMENNAME", length = 40)
	private String firmenname;

	@Column(name = "ANSPRECHPARTNER", length = 102)
	private String ansprechpartner;

	@Column(name = "ANSCHRIFT_1", length = 40)
	private String anschrift1;

	@Column(name = "ANSCHRIFT_2", length = 40)
	private String anschrift2;

	@Column(name = "ANSCHRIFT_3", length = 40)
	private String anschrift3;

	@Column(name = "ANSCHRIFT_4", length = 10)
	private String anschrift4;

	@Column(name = "ANSCHRIFT_5", length = 112)
	private String anschrift5;

	@Column(name = "ANSCHRIFT_6", length = 51)
	private String anschrift6;

	@Column(name = "E_MAIL", length = 120)
	private String EMail;

	@Column(name = "FAX", length = 31)
	private String fax;

	@Column(name = "TELEFON", length = 35)
	private String telefon;

	@Column(name = "LAND", length = 2)
	private String land;

	public Adresse() {
	}

	public Adresse(Long adresseNr) {
		this.adresseNr = adresseNr;
	}

	public Adresse(Long adresseNr, String firma, String firmenname, String ansprechpartner, String anschrift1,
			String anschrift2, String anschrift3, String anschrift4, String anschrift5, String anschrift6, String EMail,
			String fax, String telefon, String land) {
		this.adresseNr = adresseNr;
		this.firma = firma;
		this.firmenname = firmenname;
		this.ansprechpartner = ansprechpartner;
		this.anschrift1 = anschrift1;
		this.anschrift2 = anschrift2;
		this.anschrift3 = anschrift3;
		this.anschrift4 = anschrift4;
		this.anschrift5 = anschrift5;
		this.anschrift6 = anschrift6;
		this.EMail = EMail;
		this.fax = fax;
		this.telefon = telefon;
		this.land = land;
	}


	public Long getAdresseNr() {
		return this.adresseNr;
	}

	public void setAdresseNr(Long adresseNr) {
		this.adresseNr = adresseNr;
	}

	public String getFirma() {
		return this.firma;
	}

	public void setFirma(String firma) {
		this.firma = firma;
	}


	public String getFirmenname() {
		return this.firmenname;
	}

	public void setFirmenname(String firmenname) {
		this.firmenname = firmenname;
	}

	public String getAnsprechpartner() {
		return this.ansprechpartner;
	}

	public void setAnsprechpartner(String ansprechpartner) {
		this.ansprechpartner = ansprechpartner;
	}


	public String getAnschrift1() {
		return this.anschrift1;
	}

	public void setAnschrift1(String anschrift1) {
		this.anschrift1 = anschrift1;
	}


	public String getAnschrift2() {
		return this.anschrift2;
	}

	public void setAnschrift2(String anschrift2) {
		this.anschrift2 = anschrift2;
	}


	public String getAnschrift3() {
		return this.anschrift3;
	}

	public void setAnschrift3(String anschrift3) {
		this.anschrift3 = anschrift3;
	}


	public String getAnschrift4() {
		return this.anschrift4;
	}

	public void setAnschrift4(String anschrift4) {
		this.anschrift4 = anschrift4;
	}


	public String getAnschrift5() {
		return this.anschrift5;
	}

	public void setAnschrift5(String anschrift5) {
		this.anschrift5 = anschrift5;
	}


	public String getAnschrift6() {
		return this.anschrift6;
	}

	public void setAnschrift6(String anschrift6) {
		this.anschrift6 = anschrift6;
	}


	public String getEMail() {
		return this.EMail;
	}

	public void setEMail(String EMail) {
		this.EMail = EMail;
	}


	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}


	public String getTelefon() {
		return this.telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}


	public String getLand() {
		return this.land;
	}

	public void setLand(String land) {
		this.land = land;
	}

}