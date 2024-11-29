public abstract class RegistrerMedlem {

    protected int id;
    protected String navn;
    protected int alder;
    protected String adresse;
    protected String by;
    protected String aktivitetsForm; // Passiv, Aktiv.
    protected String svoemmerStatus; // Junior, Senior, Motionist, Konkurrencesvoemmer.

    public RegistrerMedlem(int id, String navn, int alder, String adresse, String by, String aktivitetsForm, String svoemmerStatus) {
        this.id = id;
        this.navn = navn;
        this.alder = alder;
        this.adresse = adresse;
        this.by = by;
        this.aktivitetsForm = aktivitetsForm;
        this.svoemmerStatus = svoemmerStatus;
    }

    public int getId() {
        return id;
    }

    public String getNavn() {
        return navn;
    }

    public int getAlder() {
        return alder;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getBy() {
        return by;
    }

    public String getAktivitetsForm() {
        return aktivitetsForm;
    }

    public String getSvoemmerStatus() {
        return svoemmerStatus;
    }
}
