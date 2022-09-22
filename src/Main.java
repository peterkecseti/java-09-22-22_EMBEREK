public class Main {
    public static void main(String[] args) {
        Ember e1 = new Ember("Dani a cigámy", "2003. 04. 25.", "Budapest");
        Ember e2 = new Ember("Peti a cigány", "2007. 04. 27.", "Fegyvernek");
        Ember e3 = new Ember("Lőric a zsidó", "2001. 09. 22.", "Jeruzsálem");
        System.out.println("" + "\n" + e1 + "\n" + e2 + "\n" + e3);
        System.out.printf("%d, %d, %d", e1.szulEv(), e2.szulEv(), e3.szulEv());
        System.out.println("\ne1 életkora: " + e1.hanyEves(e1.szulEv()));
        System.out.println("e2 életkora: " + e2.hanyEves(e2.szulEv()));
        System.out.println("e3 életkora: " + e3.hanyEves(e3.szulEv()));
    }
}