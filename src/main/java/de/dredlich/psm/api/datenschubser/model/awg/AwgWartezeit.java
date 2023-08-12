package de.dredlich.psm.api.datenschubser.model.awg;

import de.dredlich.psm.api.datenschubser.model.ISetItem;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;

/**
 * AwgWartezeit generated by hbm2java
 */
@Entity
@Table(name = "AWG_WARTEZEIT")
public class AwgWartezeit implements ISetItem {

	private BigDecimal awgWartezeitNr;
	private String kultur;
	private String anwendungsbereich;
	private String erlaeuterung;
	private BigDecimal sortierNr;
	private BigDecimal gesetztWartezeit;
	private String gesetztWartezeitBem;

	public AwgWartezeit() {
	}

	public AwgWartezeit(BigDecimal awgWartezeitNr,
						String kultur,
						String anwendungsbereich,
						String erlaeuterung,
						BigDecimal sortierNr,
						BigDecimal gesetztWartezeit,
						String gesetztWartezeitBem) {
		this.awgWartezeitNr = awgWartezeitNr;
		this.kultur = kultur;
		this.anwendungsbereich = anwendungsbereich;
		this.erlaeuterung = erlaeuterung;
		this.sortierNr = sortierNr;
		this.gesetztWartezeit = gesetztWartezeit;
		this.gesetztWartezeitBem = gesetztWartezeitBem;
	}

	@Id

	@Column(name = "AWG_WARTEZEIT_NR", nullable = false, precision = 22, scale = 0)
	public BigDecimal getAwgWartezeitNr() {
		return this.awgWartezeitNr;
	}

	public void setAwgWartezeitNr(BigDecimal awgWartezeitNr) {
		this.awgWartezeitNr = awgWartezeitNr;
	}

	@Column(name = "KULTUR", length = 20)
	public String getKultur() {
		return this.kultur;
	}

	public void setKultur(String kultur) {
		this.kultur = kultur;
	}

	@Column(name = "ANWENDUNGSBEREICH", length = 20)
	public String getAnwendungsbereich() {
		return this.anwendungsbereich;
	}

	public void setAnwendungsbereich(String anwendungsbereich) {
		this.anwendungsbereich = anwendungsbereich;
	}

	@Column(name = "ERLAEUTERUNG", length = 20)
	public String getErlaeuterung() {
		return this.erlaeuterung;
	}

	public void setErlaeuterung(String erlaeuterung) {
		this.erlaeuterung = erlaeuterung;
	}

	@Column(name = "SORTIER_NR", precision = 22, scale = 0)
	public BigDecimal getSortierNr() {
		return this.sortierNr;
	}

	public void setSortierNr(BigDecimal sortierNr) {
		this.sortierNr = sortierNr;
	}

	@Column(name = "GESETZT_WARTEZEIT", precision = 22, scale = 0)
	public BigDecimal getGesetztWartezeit() {
		return this.gesetztWartezeit;
	}

	public void setGesetztWartezeit(BigDecimal gesetztWartezeit) {
		this.gesetztWartezeit = gesetztWartezeit;
	}

	@Column(name = "GESETZT_WARTEZEIT_BEM", length = 20)
	public String getGesetztWartezeitBem() {
		return this.gesetztWartezeitBem;
	}

	public void setGesetztWartezeitBem(String gesetztWartezeitBem) {
		this.gesetztWartezeitBem = gesetztWartezeitBem;
	}

}
