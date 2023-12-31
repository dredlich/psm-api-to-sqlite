/*
 * Java domain class for entity "AwgSchadorg"
 * Created on 2020-10-04 ( Date ISO 2020-10-04 - Time 20:42:19 )
 * Generated by Telosys Tools Generator ( version 3.1.2 )
 */
package de.dredlich.psm.api.datenschubser.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Domain class for entity "AwgSchadorg"
 *
 * @author Telosys Tools Generator
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AwgSchadorg implements Serializable {

    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY
    //----------------------------------------------------------------------
	@JsonProperty("awg_id")
    private String     awgId        ;
	@JsonProperty("schadorg")
    private String     schadorg     ;

    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS
    //----------------------------------------------------------------------
	@JsonProperty("m_row$$")
    private String     mRow$$       ;

	@JsonProperty("ausgenommen")
    private String     ausgenommen  ;

	@JsonProperty("sortier_nr")
    private BigDecimal sortierNr    ;


    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------
    private Awg        awg          ;

    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public AwgSchadorg() {
		super();
    }

    //----------------------------------------------------------------------
    // GETTER & SETTER FOR "KEY FIELD(S)"
    //----------------------------------------------------------------------
    public void setAwgId( String awgId ) {
        this.awgId = awgId ;
    }
    public String getAwgId() {
        return this.awgId;
    }

    public void setSchadorg( String schadorg ) {
        this.schadorg = schadorg ;
    }
    public String getSchadorg() {
        return this.schadorg;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR "DATA FIELDS"
    //----------------------------------------------------------------------
    public void setMRow$$( String mRow$$ ) {
        this.mRow$$ = mRow$$ ;
    }
    public String getMRow$$() {
        return this.mRow$$;
    }

    public void setAusgenommen( String ausgenommen ) {
        this.ausgenommen = ausgenommen ;
    }
    public String getAusgenommen() {
        return this.ausgenommen;
    }

    public void setSortierNr( BigDecimal sortierNr ) {
        this.sortierNr = sortierNr ;
    }
    public BigDecimal getSortierNr() {
        return this.sortierNr;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR LINKS
    //----------------------------------------------------------------------
    public void setAwg( Awg awg ) {
        this.awg = awg;
    }
    public Awg getAwg() {
        return this.awg;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(awgId);
        sb.append("|");
        sb.append(schadorg);
        sb.append("|");
        sb.append(mRow$$);
        sb.append("|");
        sb.append(ausgenommen);
        sb.append("|");
        sb.append(sortierNr);
        return sb.toString();
    }

}
