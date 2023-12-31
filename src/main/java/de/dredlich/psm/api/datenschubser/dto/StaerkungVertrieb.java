/*
 * Java domain class for entity "StaerkungVertrieb"
 * Created on 2020-10-04 ( Date ISO 2020-10-04 - Time 20:42:19 )
 * Generated by Telosys Tools Generator ( version 3.1.2 )
 */
package de.dredlich.psm.api.datenschubser.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Domain class for entity "StaerkungVertrieb"
 *
 * @author Telosys Tools Generator
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class StaerkungVertrieb implements Serializable {

    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS
    //----------------------------------------------------------------------

	@JsonProperty("vertriebsfirma")
    private String     vertriebsfirma ;

	@JsonProperty("vertriebsfirma_nr")
    private BigDecimal vertriebsfirmaNr ;


    @JsonProperty("kennr")
	private String     kennr        ;

    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public StaerkungVertrieb() {
		super();
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR "DATA FIELDS"
    //----------------------------------------------------------------------

    public void setVertriebsfirma( String vertriebsfirma ) {
        this.vertriebsfirma = vertriebsfirma ;
    }
    public String getVertriebsfirma() {
        return this.vertriebsfirma;
    }

    public void setVertriebsfirmaNr( BigDecimal vertriebsfirmaNr ) {
        this.vertriebsfirmaNr = vertriebsfirmaNr ;
    }
    public BigDecimal getVertriebsfirmaNr() {
        return this.vertriebsfirmaNr;
    }

    public String getKennr() { return kennr; }

    public void setKennr(String kennr) { this.kennr = kennr; }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(vertriebsfirma);
        sb.append("|");
        sb.append(vertriebsfirmaNr);
        sb.append("|");
        sb.append(kennr);
        return sb.toString();
    }

}
