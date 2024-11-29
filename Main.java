import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Opret konkrete medlemmer
        SvoemmeHold medlem1 = new SvoemmeHold(1, "Anders", 25, "Adressevej 10", "Byen", true, "Senior", "Konkurrencesvoemmer", 1600, "23:11", "Dag 4");
        SvoemmeHold medlem2 = new SvoemmeHold(2, "Julie", 65, "Adressevej 20", "Byen", true, "Senior", "Motionist", 1200, "69:19", "Dag 5");
        SvoemmeHold medlem3 = new SvoemmeHold(3, "Niels", 15, "Adressevej 30", "Byen", false, "Junior", "Motionist", 500, "69:19", "Dag 5");

        // Opret en Kontigent-klasse for et enkelt medlem
        Kontigent kontigent1 = new Kontigent(medlem1);
        Kontigent kontigent2 = new Kontigent(medlem2);
        Kontigent kontigent3 = new Kontigent(medlem3);
        System.out.println("Kontingent for Anders: " + kontigent1.beregnKontigent());
        System.out.println("Kontingent for Julie: " + kontigent2.beregnKontigent());
        System.out.println("Kontingent for Niels: " + kontigent3.beregnKontigent());

        // Saml medlemmer i en liste
        ArrayList<RegistrerMedlem> medlemmer = new ArrayList<>();
        medlemmer.add(medlem1);
        medlemmer.add(medlem2);
        medlemmer.add(medlem3);

        // Beregn samlet forventet kontingent for alle medlemmer
        double samletKontingent = Kontigent.beregnForventetKontigent(medlemmer);
        System.out.println("Samlet forventet kontingent: " + samletKontingent);
    }
}
