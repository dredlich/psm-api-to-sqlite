package de.dredlich.psm.api.datenschubser.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Zusatzstoff generated by hbm2java
 */
@Entity
@Table(name = "ZUSATZSTOFF")
public class Zusatzstoff implements ISetItem {

	private String kennr;
	private Date genehmigungAm;
	private String mittelname;
	private String antragsteller;
	private BigDecimal antragstellerNr;
	private Date genehmigungsende;

	public Zusatzstoff() {
	}

	public Zusatzstoff(String kennr, Date genehmigungAm, String mittelname, String antragsteller, BigDecimal antragstellerNr, Date genehmigungsende) {
		this.kennr = kennr;
		this.genehmigungAm = genehmigungAm;
		this.mittelname = mittelname;
		this.antragsteller = antragsteller;
		this.antragstellerNr = antragstellerNr;
		this.genehmigungsende = genehmigungsende;
	}

	@Id

	@Column(name = "KENNR", unique = true, nullable = false, length = 9)
	public String getKennr() {
		return this.kennr;
	}

	public void setKennr(String kennr) {
		this.kennr = kennr;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "GENEHMIGUNG_AM", length = 7)
	public Date getGenehmigungAm() {
		return this.genehmigungAm;
	}

	public void setGenehmigungAm(Date genehmigungAm) {
		this.genehmigungAm = genehmigungAm;
	}

	@Column(name = "MITTELNAME", nullable = false, length = 110)
	public String getMittelname() {
		return this.mittelname;
	}

	public void setMittelname(String mittelname) {
		this.mittelname = mittelname;
	}

	@Column(name = "ANTRAGSTELLER", length = 20)
	public String getAntragsteller() {
		return this.antragsteller;
	}

	public void setAntragsteller(String antragsteller) {
		this.antragsteller = antragsteller;
	}

	@Column(name = "ANTRAGSTELLER_NR", nullable = false, precision = 22, scale = 0)
	public BigDecimal getAntragstellerNr() {
		return this.antragstellerNr;
	}

	public void setAntragstellerNr(BigDecimal antragstellerNr) {
		this.antragstellerNr = antragstellerNr;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "GENEHMIGUNGSENDE", length = 7)
	public Date getGenehmigungsende() {
		return this.genehmigungsende;
	}

	public void setGenehmigungsende(Date genehmigungsende) {
		this.genehmigungsende = genehmigungsende;
	}

}
