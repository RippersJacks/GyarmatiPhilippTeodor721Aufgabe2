package model;

public class Produkt {
    int id;
    String name;
    int preis;
    String herkunftsRegion;

    public Produkt(int id, String name, int preis, String herkunftsRegion) {
        this.id = id;
        this.name = name;
        this.preis = preis;
        this.herkunftsRegion = herkunftsRegion;
    }

    public Produkt() {}

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

    public int getPreis() {
        return preis;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }

    public String getHerkunftsRegion() {
        return herkunftsRegion;
    }

    public void setHerkunftsRegion(String herkunftsRegion) {
        this.herkunftsRegion = herkunftsRegion;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", preis=" + preis +
                ", herkunftsRegion='" + herkunftsRegion + '\'' +
                '}';
    }
}
