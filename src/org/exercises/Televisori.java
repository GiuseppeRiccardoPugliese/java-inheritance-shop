package org.exercises;

public class Televisori extends Prodotto{
    //Attributes
    private int dimensioni;
    private boolean isSmart;

    //Construct
    public Televisori(String nome,String descrizione, double prezzo, double iva, int dimensioni, boolean isSmart){
        super(nome, descrizione, prezzo, iva);
        this.dimensioni = dimensioni;
        this.isSmart = isSmart;
    }

    //Getter & Setter

    public boolean isSmart() {
        return isSmart;
    }

    public void setSmart(boolean smart) {
        isSmart = smart;
    }

    public int getDimensioni() {
        return dimensioni;
    }

    public void setDimensioni(int dimensioni) {
        this.dimensioni = dimensioni;
    }

    @Override
    public String toString() {
        return "Televisori{" +
                super.toString() +
                "dimensioni=" + dimensioni +
                ", isSmart=" + isSmart +
                '}';
    }
}
