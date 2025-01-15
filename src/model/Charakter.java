package model;

import java.util.List;

public class Charakter {
        int id;
        String name;
        String herkunftsOrt;
        List<Produkt> erworbeneProduktListe;

    public Charakter(int id, String name, String herkunftsOrd, List<Produkt> erworbeneProduktListe) {
        this.id = id;
        this.name = name;
        this.herkunftsOrt = herkunftsOrd;
        this.erworbeneProduktListe = erworbeneProduktListe;
    }

    public Charakter(int id, String name, String herkunftsOrd) {
        this.id = id;
        this.name = name;
        this.herkunftsOrt = herkunftsOrd;
    }

    public Charakter() {}


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHerkunftsOrt() {
        return herkunftsOrt;
    }

    public void setHerkunftsOrt(String herkunftsOrt) {
        this.herkunftsOrt = herkunftsOrt;
    }

    public List<Produkt> getErworbeneProduktListe() {
        return erworbeneProduktListe;
    }

    public void setErworbeneProduktListe(List<Produkt> erworbeneProduktListe) {
        this.erworbeneProduktListe = erworbeneProduktListe;
    }


    @Override
    public String toString() {
        return "Charakter{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", herkunftsOrd='" + herkunftsOrt + '\'' +
                ", erworbeneProduktListe=" + erworbeneProduktListe +
                '}';
    }
}
