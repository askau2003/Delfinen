public abstract class RegistrerMedlem {

    protected int id;
    protected String navn;
    protected int alder;
    protected String adresse;
    protected String by;
    protected Boolean aktivitetsForm; // Passiv, Aktiv.
    protected String svoemmerStatus; // Junior, Senior, Motionist, Konkurrencesvoemmer.
    protected int medlemsPris;

    public RegistrerMedlem(int id, String navn, int alder, String adresse, String by, Boolean aktivitetsForm, String svoemmerStatus, int medlemsPris) {
        this.id = id;
        this.navn = navn;
        this.alder = alder;
        this.adresse = adresse;
        this.by = by;
        this.aktivitetsForm = aktivitetsForm;
        this.svoemmerStatus = svoemmerStatus;
        this.medlemsPris = medlemsPris;
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

    public Boolean getAktivitetsForm() {
        return aktivitetsForm;
    }

    public String getSvoemmerStatus() {
        return svoemmerStatus;
    }

    public int getMedlemsPris() {
        return medlemsPris;
    }
}
