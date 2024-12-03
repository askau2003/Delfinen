import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class RegistrerMedlemPersistens {

    public static void writeMedlem(SvoemmeHold m) {
        String medlemFile = "medlemmer.txt";

        try (FileWriter writer = new FileWriter(medlemFile, true)) {
            int id = m.getId();
            String navn = m.getNavn();
            int alder = m.getAlder();
            String adresse = m.getAdresse();
            String by = m.getBy();
            Boolean aktivitetsForm = m.getAktivitetsForm();
            String svoemmerStatus = m.getSvoemmerStatus();
            Boolean restance = m.getRestance();
            String bedsteTraeningsResultat = m.getBedsteTraeningsResultat();
            String dato = m.getDato();

            writer.append(id+",");
            writer.append(navn+",");
            writer.append(alder+",");
            writer.append(adresse+",");
            writer.append(by+",");
            writer.append(aktivitetsForm+",");
            writer.append(svoemmerStatus+",");
            writer.append(restance+",");
            writer.append(bedsteTraeningsResultat+",");
            writer.append(dato+"\n");

            System.out.println("Medlem file written successfully.");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void readMedlem() {
        String komma = ",";
        String line = "";
        String medlemFile = "medlemmer.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(medlemFile))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(komma);

                System.out.println("ID: " + data[0] + ", Navn: " + data[1] + ", Alder: " + data[2] + ", Adresse: " + data[3] + ", By: " + data[4] + ", Aktivitetsform: " + data[5] + ", Svømmer status: " + data[6] + ", Restance: " + data[7] + ", BedsteTraeningsResultat: " + data[8] + ", Dato: " + data[9]);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
