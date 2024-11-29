import java.util.*;

public class Hold {

    private ArrayList<RegistrerMedlem> medlemmer;


    public void addMedlem(RegistrerMedlem medlem){
        medlemmer.add(medlem);
    }

    public ArrayList<RegistrerMedlem> getSeniorHold(){
        ArrayList<RegistrerMedlem> seniorHold = new ArrayList<>();
        for(RegistrerMedlem medlem : medlemmer){
            if(medlem.getAlder() <= 18){
                seniorHold.add(medlem);
            }

        }
        return seniorHold;
    }

    public ArrayList<RegistrerMedlem> getUngdomsHold(){
        ArrayList<RegistrerMedlem> UngdomsHold = new ArrayList<>();
        for(RegistrerMedlem medlem : medlemmer){
            if(medlem.getAlder() > 18){
                UngdomsHold.add(medlem);
            }

        }
        return UngdomsHold;
    }


}
