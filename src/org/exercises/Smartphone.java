package org.exercises;

public class Smartphone extends Prodotto{
    //Attributes
    private String codiceIMEI;
    private int memoria;

    //Construct
    public Smartphone(String nome, String descrizione, double prezzo, double iva, String codiceIMEI, int memoria){
        super(nome, descrizione, prezzo, iva);
        this.codiceIMEI = codiceIMEI;
        this.memoria = memoria;
    }

    //Getter & Setter

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public String getCodiceIMEI() {
        return codiceIMEI;
    }

    public void setCodiceIMEI(String codiceIMEI) {
        this.codiceIMEI = codiceIMEI;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                super.toString() +
                "codiceIMEI=" + codiceIMEI +
                ", memoria=" + memoria +
                '}';
    }
}
