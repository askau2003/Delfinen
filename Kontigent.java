public class Kontigent
{

    // Metode til kontigent
    public double beregnKontigent() {
        if (getSvoemmerStatus) {
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

public static double beregnForventetKontigent(int ungdom, int senior, int seniorRabat, int passivMedlem)
{
    double beregn = 0.0;

    // Beregn samlet Forventing af kontigent.
    beregn += ungdom * 1000.0; // Ungdomssvømmer
    beregn += senior * 1600.0; // Seniorsvømmer
    beregn += seniorRabat * (1600.0 * 0.75); // Seniorsvømmer med rabat
    beregn += passivMedlem * 500; // Passiv medlemmer

    return beregn;
}
}