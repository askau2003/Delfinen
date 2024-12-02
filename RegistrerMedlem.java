public abstract class RegistrerMedlem {

    protected int id;
    protected String navn;
    protected int alder;
    protected String adresse;
    protected String by;
    protected Boolean aktivitetsForm; // Passiv, Aktiv.
    protected String svoemmerStatus; // Motionist, Konkurrencesvoemmer.
    protected boolean restance;
    

    public RegistrerMedlem(int id, String navn, int alder, String adresse, String by, Boolean aktivitetsForm, String svoemmerStatus, boolean Restance) {
        this.id = id;
        this.navn = navn;
        this.alder = alder;
        this.adresse = adresse;
        this.by = by;
        this.aktivitetsForm = aktivitetsForm;
        this.svoemmerStatus = svoemmerStatus;
        this.restance = Restance;
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

    public boolean getRestance() {
        return restance;
    }

    // @ Override
    public String toString() {
        return "ID: " + id + "\n" + "Navn: " + navn + "\n" + "Alder: " + alder + "\n" + "Adresse: " + adresse + "\n" + "By: " + by + "\n" + "Aktivitetsform: " + aktivitetsForm + "\n" + "\n" + "Svømmerstatus: " + svoemmerStatus + "\n" + "Restance: " + restance;
    }
}