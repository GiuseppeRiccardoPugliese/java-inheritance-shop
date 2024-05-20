package org.exercises.bonus;

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

    //Metodo per lo sconto in caso di tessera fedelta'
    public double calcolaPrezzoScontato(boolean tessera){
        double prezzoScontato = prezzo; //Lo inizializzo uguale al prezzo base del prodotto

        if (tessera) { //Se ha una tessera allora passi per la condizione (serie di controlli)

            double scontoPercentuale = 0.02; //Sconto del 2% per chi ha la tessera

            if (this instanceof Smartphone){ //Verifico se appartiene all'istanza Smartphone
                Smartphone smartphone = (Smartphone) this; //Eseguo il casting (Smartphone) ---- this si riferisce alla super classe ovvero Prodotto
                if (smartphone.getMemoria() < 32) {
                    scontoPercentuale = 0.05; // Sconto del 5% per meno di 32GB di memoria
                }
            }else if (this instanceof Televisori) {  //Verifico se appartiene all'istanza Televisori
                Televisori televisore = (Televisori) this;
                if (!televisore.isSmart()) {
                    scontoPercentuale = 0.10; // Sconto del 10% se non è smart
                }
            } else if (this instanceof Cuffie) {  //Verifico se appartiene all'istanza Cuffie
                Cuffie cuffie = (Cuffie) this;
                if (!cuffie.isWireless()) {
                    scontoPercentuale = 0.07; // Sconto del 7% se sono cablate
                }
            }
            // Calcolo del prezzo scontato
            double sconto = prezzo * scontoPercentuale;
            prezzoScontato = prezzo - sconto;
        }
        return prezzoScontato;
    }

    @Override
    public String toString() {
        return "Prodotto{" +
                "codice=" + String.format("%06d" ,codice) +
                ", nome='" + nome + '\'' +
                ", descrizione='" + descrizione + '\'' +
                ", prezzo=" + prezzo +
                ", iva=" + iva +
                '}';
    }
}
