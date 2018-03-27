package Examples.hf4_opdr7;

public class Werknemer {

    protected String naam;
    protected double salaris;

    public Werknemer(String naam, double salaris) {
        this.naam = naam;
        this.salaris = salaris;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public double getSalaris() {
        return salaris;
    }

    public void setSalaris(double salaris) {
        this.salaris = salaris;
    }

    public Werknemer copy() {
        return new Werknemer(this.naam, this.salaris);
    }
}
