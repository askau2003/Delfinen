import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class RegistrerMedlemPersistens {

    public static void writeMedlem(RegistrerMedlem m) {
        String medlemFile = "medlemmer.txt";

        try (FileWriter writer = new FileWriter(medlemFile, true)) {
            String navn = m.getNavn();
            int alder = m.getAlder();
            String adresse = m.getAdresse();
            String by = m.getBy();
            Boolean aktivitetsForm = m.getAktivitetsForm();
            String svoemmerStatus = m.getSvoemmerStatus();
            Boolean restance = m.getRestance();

            writer.append(navn+",");
            writer.append(alder+",");
            writer.append(adresse+",");
            writer.append(by+",");
            writer.append(aktivitetsForm+",");
            writer.append(svoemmerStatus+",\n");
            writer.append(restance+",\n");

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

                System.out.println("Navn: " + data[0] + ", Alder: " + data[1] + ", Adresse: " + data[2] + ", By: " + data[3] + ", Aktivitetsform: " + data[4] + ", Svømmer status: " + data[5] + ", Restance: " + data[6]);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
