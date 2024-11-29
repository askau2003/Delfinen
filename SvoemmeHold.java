import java.util.ArrayList;

public class SvoemmeHold extends RegistrerMedlem {

    public String bedsteTraeningsResultat;
    public String dato;
    private ArrayList<RegistrerMedlem> medlemmer;

    public SvoemmeHold(int id, String navn, int alder, String adresse, String by, Boolean erAktiv, String svoemmerHold, String svoemmerStatus, String bedsteTraeningsResultat, String dato) {
        super(id, navn, alder, adresse, by, erAktiv,svoemmerHold, svoemmerStatus);
        this.bedsteTraeningsResultat = bedsteTraeningsResultat;
        this.dato = dato;
    }

    public String getBedsteTraeningsResultat() {
        return bedsteTraeningsResultat;
    }

    public String getDato() {
        return dato;
    }

        public void addMedlem(RegistrerMedlem medlem) {
            medlemmer.add(medlem);
        }

        public ArrayList<RegistrerMedlem> getSeniorHold() {
            ArrayList<RegistrerMedlem> seniorHold = new ArrayList<>();
            for (RegistrerMedlem medlem : medlemmer) {
                if (medlem.getAlder() <= 18) {
                    seniorHold.add(medlem);
                }
            }
            return seniorHold;
        }

        public ArrayList<RegistrerMedlem> getUngdomsHold() {
            ArrayList<RegistrerMedlem> UngdomsHold = new ArrayList<>();
            for (RegistrerMedlem medlem : medlemmer) {
                if (medlem.getAlder() > 18) {
                    UngdomsHold.add(medlem);
                }
            }
            return UngdomsHold;
        }
}