import static com.sun.tools.javac.util.Constants.format;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ember {

    private String nev;
    private String szulDatum;
    private String szulHely;

    public Ember(String nev, String szulDatum, String szulHely) {
        this.nev = nev;
        this.szulDatum = szulDatum;
        this.szulHely = szulHely;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getSzulDatum() {
        return szulDatum;
    }

    public void setSzulDatum(String szulDatum) {
        this.szulDatum = szulDatum;
    }

    public String getSzulHely() {
        return szulHely;
    }

    public void setSzulHely(String szulHely) {
        this.szulHely = szulHely;
    }

    @Override
    public String toString() {
        return String.format("Név: %s\nSzületési dátum: %s\nSzületési hely: %s", nev, szulDatum, szulHely);
    }

    public int szulEv(){
        int szulEv;
        szulEv = Integer.parseInt(szulDatum.substring(0, 4));
        return szulEv;
    }
    public int szulHonap(){
        int szulHonap;
        szulHonap = Integer.parseInt(szulDatum.substring(6, 8));
        return szulHonap;
    }
    public int szulNap(){
        int szulNap;
        szulNap = Integer.parseInt(szulDatum.substring(10, 12));
        return szulNap;
    }
    public int hanyEves(int emberSzulEv){

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy");
        LocalDateTime now = LocalDateTime.now();
        int ev = Integer.parseInt(String.valueOf(dtf.format(now)));
        return ev - emberSzulEv;
    }
}
