public class SvoemmeHold extends RegistrerMedlem {

    public String bedsteTraeningsResultat;
    public String dato;

    public SvoemmeHold(int id, String navn, int alder, String adresse, String by, String aktivitetsForm, String svoemmerStatus, String bedsteTraeningsResultat, String dato) {
        super(id, navn, alder, adresse, by, aktivitetsForm, svoemmerStatus);
        this.bedsteTraeningsResultat = bedsteTraeningsResultat;
        this.dato = dato;
    }

    public String getBedsteTraeningsResultat() {
        return bedsteTraeningsResultat;
    }

    public String getDato() {
        return dato;
    }
}
