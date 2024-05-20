package org.exercises;

import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Array facendo riferimento alla mia SuperClasse Prodotto
        Prodotto[] carrello = new Prodotto[10];

        //Contatore
        int count = 0;

        while (true) {
            System.out.println("Che tipo di prodotto vuoi inserire? (Smartphone, Televisori, Cuffie) o 'esci' per uscire:");
            String tipo = scanner.nextLine().toLowerCase();

            //Se l'utente scrive esci allora si ferma il ciclo
            if (tipo.equals("esci")) {
                break;
            }

            //Controllo per che tipo di prodotto vuole inserire l'utente
            if (!tipo.equals("smartphone") && !tipo.equals("televisori") && !tipo.equals("cuffie")) {
                System.out.println("Tipo di prodotto non riconosciuto. Riprova.");
                continue;
            }

            System.out.println("Inserisci il nome del prodotto:");
            String nome = scanner.nextLine();

            System.out.println("Inserisci la descrizione del prodotto:");
            String descrizione = scanner.nextLine();

            System.out.println("Inserisci il prezzo del prodotto:");
            double prezzo = scanner.nextDouble();

            System.out.println("Inserisci l'IVA del prodotto (es. 0.22 per 22%):");
            double iva = scanner.nextDouble();

            scanner.nextLine();

            //Richiamo la SuperClasse Prodotto e inizializzo la mia istanza prodotto = null
            Prodotto prodotto = null;

            //Switch in base al tipo inserito dall'utente
            switch (tipo) {
                case "smartphone": //SE SMARTPHONE
                    System.out.println("Inserisci il codice IMEI dello smarphone:");
                    String codiceIMEI = scanner.nextLine();

                    System.out.println("Inserisci la quantità di memoria dello smarphone (in GB):");
                    int memoria = scanner.nextInt();

                    scanner.nextLine();

                    //Creo l'oggetto smartphone legato all'istanza prodotto della classe Prodotto
                    prodotto = new Smartphone(nome, descrizione, prezzo, iva, codiceIMEI, memoria);
                    break;

                case "televisori": //SE TELEVISORI
                    System.out.println("Inserisci le dimensioni del televisore (in pollici):");
                    int dimensioni = scanner.nextInt();

                    System.out.println("Il televisore è smart? (true/false):");
                    boolean isSmart = scanner.nextBoolean();

                    scanner.nextLine();

                    //Creo l'oggetto Televisori legato all'istanza prodotto della classe Prodotto
                    prodotto = new Televisori(nome, descrizione, prezzo, iva, dimensioni, isSmart);
                    break;

                case "cuffie": //SE CUFFIE
                    System.out.println("Inserisci il colore delle cuffie:");
                    String colore = scanner.nextLine();

                    System.out.println("Le cuffie sono wireless? (true/false):");
                    boolean isWireless = scanner.nextBoolean();

                    scanner.nextLine();

                    //Creo l'oggetto Cuffie legato all'istanza prodotto della classe Prodotto
                    prodotto = new Cuffie(nome, descrizione, prezzo, iva, isWireless, colore);
                    break;

//                default:
//                    System.out.println("Tipo di prodotto non riconosciuto. Riprova.");
//                    continue;
            }

//             Ridimensiono l'array se necessario
            if (count >= carrello.length) {
                Prodotto[] nuovoCarrello = new Prodotto[carrello.length * 2]; //Se il numero di prodotti nel carrello ha superato la lunghezza attuale creo un nuovo array con il doppio della capacita'

                System.arraycopy(carrello, 0, nuovoCarrello, 0, carrello.length);
                //Array d'origine primo parametro = carrello, 0: è l'indice di partenza nell'array di origine da cui iniziare a copiare gli elementi
                //Array nuovoCarrello e' l'array di destinazione e 0 sta per l'indice di partenza
                //carrello.length è il numero di elementi da copiare dall'array di origine(carrello) all'array di destinazione(nuovoCarrello), quindi in questo caso è la lunghezza dell'array carrello
                carrello = nuovoCarrello;
            }

            carrello[count] = prodotto;
            count++;

            System.out.println("Prodotti nel carrello:");
            for (int i = 0; i < count; i++) {
                System.out.println(carrello[i]);
            }
        }

        scanner.close();

    }
}
