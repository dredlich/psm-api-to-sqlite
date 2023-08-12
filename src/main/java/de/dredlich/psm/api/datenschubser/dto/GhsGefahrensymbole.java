/*
 * Java domain class for entity "GhsGefahrensymbole"
 * Created on 2020-10-04 ( Date ISO 2020-10-04 - Time 20:42:19 )
 * Generated by Telosys Tools Generator ( version 3.1.2 )
 */
package de.dredlich.psm.api.datenschubser.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;


/**
 * Domain class for entity "GhsGefahrensymbole"
 *
 * @author Telosys Tools Generator
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GhsGefahrensymbole implements Serializable {

    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY
    //----------------------------------------------------------------------

    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS
    //----------------------------------------------------------------------
	@JsonProperty("m_row$$")
    private String     mRow$$       ;

	@JsonProperty("kennr")
    private String     kennr        ;

	@JsonProperty("gefahrensymbol")
    private String     gefahrensymbol ;


    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------

    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public GhsGefahrensymbole() {
		super();
    }

    //----------------------------------------------------------------------
    // GETTER & SETTER FOR "KEY FIELD(S)"
    //----------------------------------------------------------------------

    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR "DATA FIELDS"
    //----------------------------------------------------------------------
    public void setMRow$$( String mRow$$ ) {
        this.mRow$$ = mRow$$ ;
    }
    public String getMRow$$() {
        return this.mRow$$;
    }

    public void setKennr( String kennr ) {
        this.kennr = kennr ;
    }
    public String getKennr() {
        return this.kennr;
    }

    public void setGefahrensymbol( String gefahrensymbol ) {
        this.gefahrensymbol = gefahrensymbol ;
    }
    public String getGefahrensymbol() {
        return this.gefahrensymbol;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR LINKS
    //----------------------------------------------------------------------

    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(mRow$$);
        sb.append("|");
        sb.append(kennr);
        sb.append("|");
        sb.append(gefahrensymbol);
        return sb.toString();
    }

}
