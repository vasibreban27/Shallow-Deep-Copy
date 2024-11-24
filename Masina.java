public class Masina implements Cloneable{
    private String nume;
    private String culoare;

    public Masina(String nume, String culoare) {
        this.nume = nume;
        this.culoare = culoare;
    }
    public String getNume() {
        return this.nume;
    }
    public String getCuloare() {
        return this.culoare;
    }
    public void schimbaCuloare(String newCuloare) {
        this.culoare = newCuloare;
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public String toString(){
        return "Masina: " + this.nume + " de culoare " + this.culoare;
    }
}
