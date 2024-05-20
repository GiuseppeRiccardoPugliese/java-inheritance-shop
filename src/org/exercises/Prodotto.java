package org.exercises;

import java.util.Random;

public class Prodotto {
    //Attributes
    private int codice;
    private String nome;
    private String descrizione;
    private double prezzo;
    private double iva;

    //Construct
    public Prodotto(String nome, String descrizione, double prezzo, double iva) {
        this.codice = randomCode();
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    //GET codice
    public int getCodice() {
        return codice;
    }

    //Getter dei restanti attributi
    public String getNome(){
        return nome;
    }

    public String getDescrizione(){
        return descrizione;
    }

    public double getPrezzo(){
        return prezzo;
    }

    public double getIva() {
        return iva;
    }

    //Setter dei restanti attributi
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    //Metodo di servizio per il random code
    private int randomCode(){
        Random random = new Random();
        return random.nextInt(1000000);
    }

    //Metodo per il prezzo base
    public double getPrezzoBase(){
        return prezzo;
    }

    //Metodo per il prezzo compreso di iva formattato
    public double getPrezzoIva(){
        return prezzo + (prezzo * iva);
    }
}
