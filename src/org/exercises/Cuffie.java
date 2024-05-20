package org.exercises;

public class Cuffie extends Prodotto {
    //Attributes
    private String colore;
    private boolean isWireless;

    //Construct
    public Cuffie(String nome,String descrizione, double prezzo, double iva,boolean isWireless, String colore) {
        super(nome, descrizione, prezzo, iva);
        this.isWireless = isWireless;
        this.colore = colore;
    }

    //Getter & Setter
    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public boolean isWireless() {
        return isWireless;
    }

    public void setWireless(boolean wireless) {
        isWireless = wireless;
    }

    @Override
    public String toString() {
        return "Cuffie{" +
                super.toString() +
                "colore='" + colore + '\'' +
                ", isWireless=" + isWireless +
                '}';
    }
}
