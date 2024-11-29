import java.util.ArrayList;

public class Kontigent {
    private RegistrerMedlem medlem;

    // Constructor der tager et RegistrerMedlem
    public Kontigent(RegistrerMedlem medlem) {
        this.medlem = medlem;
    }

    // Metode til kontigent
    public double beregnKontigent() {
        if (medlem.getAktivitetsForm()) {
            int alder = medlem.getAlder();
            if (alder < 18) {
                return 1000.0; // ungdomssvømmere (under 18 år) 1000 kr. årligt
            } else if (alder >= 18 && alder < 60) {
                return 1600.0; // årligt, for seniorsvømmere (18 år og over) 1600 kr
            } else {
                return 1600.0 * 0.75; // 25 % rabat af seniortaksten
            }
        } else {
            return 500.0; // Passivt medlem
        }

    }

// static metode

    public static double beregnForventetKontigent(ArrayList<RegistrerMedlem> medlemmer) {
        double samletKontigent = 0.0;
        for (RegistrerMedlem medlem : medlemmer) {
            if (medlem.getAktivitetsForm()) {
                int alder = medlem.getAlder();
                if (alder < 18) {
                    samletKontigent += 1000.0;
                } else if (alder >= 18 && alder < 60) {
                    samletKontigent += 1600.0;

                } else samletKontigent += 1600.0 * 0.75;

                }else{
                    samletKontigent += 500.0;
                }
            }

            return samletKontigent;
        }
    }
