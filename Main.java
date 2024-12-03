import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Opret konkrete medlemmer
        SvoemmeHold medlem1 = new SvoemmeHold(1, "Anders", 25, "Adressevej 10", "Byen", true,"Konkurrencesvoemmer", false,"23:11", "8/11/2024");
        SvoemmeHold medlem2 = new SvoemmeHold(2, "Julie", 65, "Adressevej 20", "Byen", true,"Motionist", false,"69:19", "9/11/2024");
        SvoemmeHold medlem3 = new SvoemmeHold(3, "Niels", 15, "Adressevej 30", "Byen", false,"Motionist", true,"69:19", "11/11/2024");

        // Opret en Kontigent-klasse for et enkelt medlem
        Kontigent kontigent = new Kontigent(medlem1);
        kontigent.addMedlem(medlem1);
        kontigent.addMedlem(medlem2);
        kontigent.addMedlem(medlem3);
        System.out.println("Kontingent for Anders: " + new Kontigent(medlem1).beregnKontigent());
        System.out.println("Kontingent for Julie: " + new Kontigent(medlem2).beregnKontigent());
        System.out.println("Kontingent for Niels: " + new Kontigent(medlem3).beregnKontigent());

        // Saml medlemmer i en liste
        ArrayList<SvoemmeHold> medlemmer = new ArrayList<>();
        medlemmer.add(medlem1);
        medlemmer.add(medlem2);
        medlemmer.add(medlem3);

        // Beregn samlet forventet kontingent for alle medlemmer
        double samletKontingent = Kontigent.beregnForventetKontigent(medlemmer);
        System.out.println("Samlet forventet kontingent: " + samletKontingent);


        ArrayList<SvoemmeHold> iRestance = kontigent.IRestance();
        ArrayList<SvoemmeHold> udRestance = kontigent.UdRestance();

        System.out.println("Medlemmer i restance:");
        for (SvoemmeHold medlem : iRestance) {
            System.out.println(medlem.getNavn());
        }

        System.out.println("Medlemmer uden restance:");
        for (SvoemmeHold medlem : udRestance) {
            System.out.println(medlem.getNavn());
        }
    }
}