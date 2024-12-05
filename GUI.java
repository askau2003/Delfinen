import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.ArrayList;

public class GUI extends JFrame implements ActionListener {
    private JLabel promptId = new JLabel("Indtast ID: ");
    private JTextField id = new JTextField(2);
    private JLabel promptN = new JLabel("Indtast navn: ");
    private JTextField navn = new JTextField(6);
    private JLabel promptA = new JLabel("Indtast alder: ");
    private JTextField alder = new JTextField(2);
    private JLabel promptAdr = new JLabel("Indtast adresse: ");
    private JTextField adr = new JTextField(6);
    private JLabel promptBy = new JLabel("Indtast by: ");
    private JTextField by = new JTextField(6);
    private JLabel promptAktiv = new JLabel("Indtast aktivitetsForm: ");
    private JTextField aktiv = new JTextField(6);
    private JLabel promptSvoemmestatus = new JLabel("Indtast svoemestatus: ");
    private JTextField svoemmestatus = new JTextField(6);
    private JLabel promptRestance = new JLabel("Indtast restance: ");
    private JTextField restance = new JTextField(6);
    private JLabel promptBedsteResultat = new JLabel("Indstast bedste resultat: ");
    private JTextField bedsteResultat = new JTextField(6);
    private JLabel promptDato = new JLabel("Indtast dato: ");
    private JTextField dato = new JTextField(10);
    private JButton tilfoej = new JButton("Tilføj");
    private JButton gem = new JButton("Gem");


    private List list = new List(10, true);
    private ArrayList<SvoemmeHold> pL = new ArrayList<>();

    public GUI() {
        setTitle("GUI");
        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(promptId);
        getContentPane().add(id);
        getContentPane().add(promptN);
        getContentPane().add(navn);
        getContentPane().add(promptA);
        getContentPane().add(alder);
        getContentPane().add(promptAdr);
        getContentPane().add(adr);
        getContentPane().add(promptBy);
        getContentPane().add(by);
        getContentPane().add(promptAktiv);
        getContentPane().add(aktiv);
        getContentPane().add(promptSvoemmestatus);
        getContentPane().add(svoemmestatus);
        getContentPane().add(promptRestance);
        getContentPane().add(restance);
        getContentPane().add(promptBedsteResultat);
        getContentPane().add(bedsteResultat);
        getContentPane().add(promptDato);
        getContentPane().add(dato);
        getContentPane().add(tilfoej);
        getContentPane().add(gem);

        getContentPane().add(list);

        list.setFont(new Font("Courier", Font.PLAIN, 11));
        list.setBackground(Color.yellow);
        JScrollPane scrollPane = new JScrollPane(list);
        scrollPane.setPreferredSize(new Dimension(900, 120));
        add(scrollPane, BorderLayout.CENTER);

        tilfoej.addActionListener(this);
        gem.addActionListener(this);
    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == tilfoej) {
            try {
                int medlemId = Integer.parseInt(id.getText().trim());
                String medlemNavn = navn.getText().trim();
                int medlemAlder = Integer.parseInt(alder.getText().trim());
                String medlemAdr = adr.getText().trim();
                String medlemBy = by.getText().trim();

                String aktivInput = aktiv.getText().trim().toLowerCase();
                boolean erAktiv;
                if (aktivInput.equals("true") || aktivInput.equals("aktiv")) {
                    erAktiv = true;
                } else if (aktivInput.equals("false") || aktivInput.equals("ikke aktiv")) {
                    erAktiv = false;
                } else {
                    throw new IllegalArgumentException("Aktiv skal være 'true', 'false', 'Aktiv', eller 'Ikke aktiv'.");
                }

                String svoemmerStatus = svoemmestatus.getText().trim();
                String restanceInput = restance.getText().trim().toLowerCase();
                boolean harRestance;
                if (restanceInput.equals("true") || restanceInput.equals("ja")) {
                    harRestance = true;
                } else if (restanceInput.equals("false") || restanceInput.equals("nej")) {
                    harRestance = false;
                } else {
                    throw new IllegalArgumentException("Restance skal være 'true', 'false', 'ja', eller 'nej'.");
                }

                String resultat = bedsteResultat.getText().trim();
                String dat = dato.getText().trim();

                SvoemmeHold medlem = new SvoemmeHold(
                        medlemId,
                        medlemNavn,
                        medlemAlder,
                        medlemAdr,
                        medlemBy,
                        erAktiv,
                        svoemmerStatus,
                        harRestance,
                        resultat,
                        dat
                );

                pL.add(medlem);
                list.add("ID: " + medlem.getId() + ", Navn: " + medlem.getNavn() + ", Alder: " + medlem.getAlder() +
                        ", Adresse: " + medlem.getAdresse() + ", By: " + medlem.getBy() + ", Aktiv: " + medlem.getAktivitetsForm() +
                        ", Status: " + medlem.getSvoemmerStatus() + ", Restance: " + medlem.getRestance() +
                        ", Bedste Resultat: " + medlem.getBedsteTraeningsResultat() + ", Dato: " + medlem.getDato());

                // Clear input fields
                id.setText("");
                navn.setText("");
                alder.setText("");
                adr.setText("");
                by.setText("");
                aktiv.setText("");
                svoemmestatus.setText("");
                restance.setText("");
                bedsteResultat.setText("");
                dato.setText("");

                navn.requestFocus();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Fejl: ID og alder skal være tal!", "Input Fejl", JOptionPane.ERROR_MESSAGE);
            } catch (IllegalArgumentException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Input Fejl", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == gem) {
            try {
                for (SvoemmeHold medlem : pL) {
                    RegistrerMedlemPersistens.writeMedlem(medlem); // Kalder gem-funktionen
                }
                JOptionPane.showMessageDialog(this, "Data gemt til medlemmer.txt.", "Succes", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Fejl ved gemning: " + ex.getMessage(), "Fejl", JOptionPane.ERROR_MESSAGE);
            }
        }
    }


    public static void main(String args[]) {
        GUI f = new GUI();
        f.setSize(1800, 300);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}