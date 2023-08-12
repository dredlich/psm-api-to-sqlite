package de.dredlich.psm.api.datenschubser.model.mittel;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import de.dredlich.psm.api.datenschubser.model.Antrag;
import de.dredlich.psm.api.datenschubser.model.ISetItem;
import jakarta.persistence.*;

/**
 * Mittel generated by hbm2java
 */
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "MITTEL")
public class Mittel implements ISetItem {

	private String kennr;
	private LocalDate zulErstmaligAm;
	private String mittelname;
	private String formulierungArt;
	private LocalDate zulEnde;
	private LocalDate aufbrauchFrist;
	private LocalDate bescheidDatum;
	private Boolean geringesRisiko;

	public Mittel() {
	}

	public Mittel(String kennr,
				  LocalDate zulErstmaligAm,
				  String mittelname,
				  String formulierungArt,
				  LocalDate zulEnde,
				  LocalDate aufbrauchFrist,
				  LocalDate bescheidDatum,
				  Boolean geringesRisiko)
	{
		this.kennr = kennr;
		this.zulErstmaligAm = zulErstmaligAm;
		this.mittelname = mittelname;
		this.formulierungArt = formulierungArt;
		this.zulEnde = zulEnde;
		this.aufbrauchFrist = aufbrauchFrist;
		this.bescheidDatum = bescheidDatum;
		this.geringesRisiko = geringesRisiko;
	}

	@Id
	@Column(name = "KENNR", unique = true, nullable = false, length = 9)
	public String getKennr() {
		return this.kennr;
	}

	public void setKennr(String kennr) {
		this.kennr = kennr;
	}

	@Column(name = "ZUL_ERSTMALIG_AM", length = 7)
	public LocalDate getZulErstmaligAm() {
		return this.zulErstmaligAm;
	}

	public void setZulErstmaligAm(LocalDate zulErstmaligAm) {
		this.zulErstmaligAm = zulErstmaligAm;
	}

	@Column(name = "MITTELNAME", nullable = false, length = 110)
	public String getMittelname() {
		return this.mittelname;
	}

	public void setMittelname(String mittelname) {
		this.mittelname = mittelname;
	}

	@Column(name = "FORMULIERUNG_ART", length = 20)
	public String getFormulierungArt() {
		return this.formulierungArt;
	}

	public void setFormulierungArt(String formulierungArt) {
		this.formulierungArt = formulierungArt;
	}

	@Column(name = "ZUL_ENDE", length = 7)
	public LocalDate getZulEnde() {
		return this.zulEnde;
	}

	public void setZulEnde(LocalDate zulEnde) {
		this.zulEnde = zulEnde;
	}

	@Column(name = "AUFBRAUCHFRIST", length = 7)
	public LocalDate getAufbrauchFrist() {
		return this.aufbrauchFrist;
	}

	public void setAufbrauchFrist(LocalDate aufbrauchFrist) {
		this.aufbrauchFrist = aufbrauchFrist;
	}

	@Column(name = "BESCHEID_DATUM", length = 7)
	public LocalDate getBescheidDatum() {
		return this.bescheidDatum;
	}

	public void setBescheidDatum(LocalDate bescheidDatum) {
		this.bescheidDatum = bescheidDatum;
	}

	@Column(name = "MITTEL_MIT_GERINGEM_RISIKO", length = 7)
	public Boolean getGeringesRisiko() {
		return this.geringesRisiko;
	}

	public void setGeringesRisiko(Boolean geringesRisiko) {
		this.geringesRisiko = geringesRisiko;
	}
}
