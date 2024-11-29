public class Staevne{

    public String staevneNavn;
    public String placering;
    public String tid;


    public Staevne(String staevneNavn, String placering, String tid){
        this.staevneNavn = staevneNavn;
        this.placering = placering;
        this.tid = tid;
    }

    public String getPlacering() {

        return placering;
    }

    public String getStaevneNavn(){

        return staevneNavn;
    }

    public String getTid() {
        return tid;

    }
}