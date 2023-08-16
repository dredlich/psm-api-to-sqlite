package de.dredlich.psm.api.datenschubser;

import de.dredlich.psm.api.datenschubser.dto.*;
import de.dredlich.psm.api.datenschubser.model.pk.*;

public interface PsmApiEnum {
    enum Endpoint {
        ADRESSE("adresse", Adresse.class, de.dredlich.psm.api.datenschubser.model.Adresse.class, null),
        ANTRAG("antrag", Antrag.class, de.dredlich.psm.api.datenschubser.model.Antrag.class, AntragId.class),
        AUFLAGE_REDU("auflage_redu", AuflageRedu.class, de.dredlich.psm.api.datenschubser.model.AuflageRedu.class, AuflageReduId.class),
        AUFLAGEN("auflagen", Auflagen.class, de.dredlich.psm.api.datenschubser.model.Auflagen.class, null),
        AWG("awg", Awg.class, de.dredlich.psm.api.datenschubser.model.awg.Awg.class, null),
        AWG_AUFWAND("awg_aufwand", AwgAufwand.class, de.dredlich.psm.api.datenschubser.model.awg.AwgAufwand.class, AwgAufwandId.class),
        AWG_BEM("awg_bem", AwgBem.class, de.dredlich.psm.api.datenschubser.model.awg.AwgBem.class, AwgBemId.class),
        AWG_KULTUR("awg_kultur", AwgKultur.class, de.dredlich.psm.api.datenschubser.model.awg.AwgKultur.class, AwgKulturId.class),
        AWG_PARTNER("awg_partner", AwgPartner.class, de.dredlich.psm.api.datenschubser.model.awg.AwgPartner.class, AwgPartnerId.class),
        AWG_PARTNER_AUFWAND("awg_partner_aufwand", AwgPartnerAufwand.class, de.dredlich.psm.api.datenschubser.model.awg.AwgPartnerAufwand.class, AwgPartnerAufwandId.class),
        AWG_SCHADORG("awg_schadorg", AwgSchadorg.class, de.dredlich.psm.api.datenschubser.model.awg.AwgSchadorg.class, AwgSchadorgId.class),
        AWG_VERWENDUNGSZWECK("awg_verwendungszweck", AwgVerwendungszweck.class, de.dredlich.psm.api.datenschubser.model.awg.AwgVerwendungszweck.class, AwgVerwendungszweckId.class),
        AWG_WARTEZEIT("awg_wartezeit", AwgWartezeit.class, de.dredlich.psm.api.datenschubser.model.awg.AwgWartezeit.class, null),
        AWG_WARTEZEIT_AUSG_KULTUR("awg_wartezeit_ausg_kultur", AwgWartezeitAusgKultur.class, de.dredlich.psm.api.datenschubser.model.awg.AwgWartezeitAusgKultur.class, AwgWartezeitAusgKulturId.class),
        AWG_ZEITPUNKT("awg_zeitpunkt", AwgZeitpunkt.class, de.dredlich.psm.api.datenschubser.model.awg.AwgZeitpunkt.class, AwgZeitpunktId.class),
        AWG_ZULASSUNG("awg_zulassung", AwgZulassung.class, de.dredlich.psm.api.datenschubser.model.awg.AwgZulassung.class, null),
        GHS_GEFAHRENHINWEISE("ghs_gefahrenhinweise", GhsGefahrenhinweise.class, de.dredlich.psm.api.datenschubser.model.ghs.GhsGefahrenhinweise.class, GhsGefahrenhinweiseId.class),
        GHS_GEFAHRENSYMBOLE("ghs_gefahrensymbole", GhsGefahrensymbole.class, de.dredlich.psm.api.datenschubser.model.ghs.GhsGefahrensymbole.class, GhsGefahrensymboleId.class),
        GHS_SICHERHEITSHINWEISE("ghs_sicherheitshinweise", GhsSicherheitshinweise.class, de.dredlich.psm.api.datenschubser.model.ghs.GhsSicherheitshinweise.class, GhsSicherheitshinweiseId.class),
        GHS_SIGNALWOERTER("ghs_signalwoerter", GhsSignalwoerter.class, de.dredlich.psm.api.datenschubser.model.ghs.GhsSignalwoerter.class, GhsSignalwoerterId.class),
        HINWEIS("hinweis", Hinweis.class, de.dredlich.psm.api.datenschubser.model.Hinweis.class, HinweisId.class),
        KODE("kode", Kode.class, de.dredlich.psm.api.datenschubser.model.Kode.class, KodeId.class),
        KODELISTE("kodeliste", Kodeliste.class, de.dredlich.psm.api.datenschubser.model.Kodeliste.class, null),
        KODELISTE_FELDNAME("kodeliste_feldname", KodelisteFeldname.class, de.dredlich.psm.api.datenschubser.model.KodelisteFeldname.class, KodelisteFeldnameId.class),
        KULTUR_GRUPPE("kultur_gruppe", KulturGruppe.class, de.dredlich.psm.api.datenschubser.model.KulturGruppe.class, KulturGruppeId.class),
        MITTEL("mittel", Mittel.class, de.dredlich.psm.api.datenschubser.model.mittel.Mittel.class, null),
        MITTEL_ABGELAUFEN("mittel_abgelaufen", MittelAbgelaufen.class, de.dredlich.psm.api.datenschubser.model.mittel.MittelAbgelaufen.class, MittelAbgelaufenId.class),
        MITTEL_ABPACKUNG("mittel_abpackung", MittelAbpackung.class, de.dredlich.psm.api.datenschubser.model.mittel.MittelAbpackung.class, MittelAbpackungId.class),
        MITTEL_GEFAHREN_SYMBOL("mittel_gefahren_symbol", MittelGefahrenSymbol.class, de.dredlich.psm.api.datenschubser.model.mittel.MittelGefahrenSymbol.class, MittelGefahrenSymbolId.class),
        MITTEL_VERTRIEB("mittel_vertrieb", MittelVertrieb.class, de.dredlich.psm.api.datenschubser.model.mittel.MittelVertrieb.class, MittelVertriebId.class),
        MITTEL_WIRKBEREICH("mittel_wirkbereich", MittelWirkbereich.class, de.dredlich.psm.api.datenschubser.model.mittel.MittelWirkbereich.class, MittelWirkbereichId.class),
        PARALLELIMPORT_ABGELAUFEN("parallelimport_abgelaufen", ParallelimportAbgelaufen.class, de.dredlich.psm.api.datenschubser.model.ParallelimportAbgelaufen.class, ParallelimportAbgelaufenId.class),
        PARALLELIMPORT_GUELTIG("parallelimport_gueltig", ParallelimportGueltig.class, de.dredlich.psm.api.datenschubser.model.ParallelimportGueltig.class, ParallelimportGueltigId.class),
        SCHADORG_GRUPPE("schadorg_gruppe", SchadorgGruppe.class, de.dredlich.psm.api.datenschubser.model.SchadorgGruppe.class, SchadorgGruppeId.class),
        STAERKUNG("staerkung", Staerkung.class, de.dredlich.psm.api.datenschubser.model.Staerkung.class,null),
        STAERKUNG_VERTRIEB("staerkung_vertrieb", StaerkungVertrieb.class, de.dredlich.psm.api.datenschubser.model.StaerkungVertrieb.class, StaerkungVertriebId.class),
        STAND("stand", Stand.class, de.dredlich.psm.api.datenschubser.model.Stand.class, null),
        WIRKSTOFF("wirkstoff", Wirkstoff.class, de.dredlich.psm.api.datenschubser.model.Wirkstoff.class, null),
        WIRKSTOFF_GEHALT("wirkstoff_gehalt", WirkstoffGehalt.class, de.dredlich.psm.api.datenschubser.model.WirkstoffGehalt.class, WirkstoffGehaltId.class),
        ZUSATZSTOFF("zusatzstoff", Zusatzstoff.class, de.dredlich.psm.api.datenschubser.model.Zusatzstoff.class, null),
        ZUSATZSTOFF_VERTRIEB("zusatzstoff_vertrieb", ZusatzstoffVertrieb.class, de.dredlich.psm.api.datenschubser.model.ZusatzstoffVertrieb.class, ZusatzstoffVertriebId.class)
        ;

        String path;
        Class inputType;
        Class outputType;
        Class idType;
        <T> Endpoint(String path, Class<? extends T> inputType, Class<? extends T> outputType, Class<? extends T> idType) {
            this.path = path;
            this.inputType = inputType;
            this.outputType = outputType;
            this.idType = idType;
        }
    }
}
