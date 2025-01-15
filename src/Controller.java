import model.Charakter;
import model.Produkt;

import java.util.Scanner;

public class Controller {

    Repository<Produkt> produktRepository;
    Repository<Charakter> charakterRepository;

    public Controller(Repository<Produkt> repository1, Repository<Charakter> repository2) {
        this.produktRepository = repository1;
        this.charakterRepository = repository2;
    }


    void createProdukt(){
        Scanner sc = new Scanner(System.in);

        int id = -1;
        for (Produkt produkt: produktRepository.getAllElements())
            if (produkt.getId() > id)
                id = produkt.getId();
        id++;

        System.out.println("Name des Produktes: ");
        String name = sc.nextLine();
        System.out.println("Preis des Produktes: ");
        int preis = sc.nextInt();
        sc.nextLine();
        System.out.println("Herkunftsregion des Produktes: ");
        String herkunftsregion = sc.nextLine();

        produktRepository.addElement(new Produkt(id, name, preis, herkunftsregion));
    }

    void getProdukt(){
        System.out.println("ID des Produktes: ");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        sc.nextLine();

        for (Produkt produkt: produktRepository.getAllElements())
            if (produkt.getId() == id)
            {
                System.out.println(produkt);
                break;
            }
    }

    void getAllProdukte(){
        for (Produkt produkt: produktRepository.getAllElements())
            System.out.println(produkt);
    }

    void updateProdukt(){
        System.out.println("ID des Produktes: ");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Neuer Name des Produktes: ");
        String name = sc.nextLine();
        System.out.println("Neuer Preis des Produktes: ");
        int preis = sc.nextInt();
        sc.nextLine();
        System.out.println("Neuer Herkunftsregion des Produktes: ");
        String herkunftsregion = sc.nextLine();

        for (Produkt produkt: produktRepository.getAllElements())
            if (produkt.getId() == id)
            {
                int index = produktRepository.getAllElements().indexOf(produkt);

                produkt.setName(name);
                produkt.setPreis(preis);
                produkt.setHerkunftsRegion(herkunftsregion);

                produktRepository.updateElement(index,produkt);
            }

    }

    void deleteProdukt(){
        System.out.println("ID des zu loschenden Produktes: ");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        sc.nextLine();

        Produkt produktAux = new Produkt();
        for (Produkt produkt: produktRepository.getAllElements())
            if (produkt.getId() == id)
                produktAux = produkt;

        produktRepository.remove(produktAux);
    }

    //------------

    void createCharakter(){
        int id = -1;
        for (Charakter charakter: charakterRepository.getAllElements())
            if (charakter.getId() > id)
                id = charakter.getId();
        id++;

        Scanner sc = new Scanner(System.in);
        System.out.println("Name des Charakters: ");
        String name = sc.nextLine();
        System.out.println("Herkunftsort des Charakters: ");
        String herkunftsort = sc.nextLine();

        charakterRepository.addElement(new Charakter(id, name, herkunftsort));
    }

    void getCharakter(){
        System.out.println("ID des Charakters: ");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        sc.nextLine();

        for (Charakter charakter: charakterRepository.getAllElements())
            if (charakter.getId() == id)
            {
                System.out.println(charakter);
                break;
            }
    }

    void getAllCharakters(){
        for (Charakter charakter: charakterRepository.getAllElements())
            System.out.println(charakter);
    }

    void updateCharakter(){
        System.out.println("ID des Charakters: ");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Neuer Name des Charakters: ");
        String name = sc.nextLine();
        System.out.println("Neue Herkunft des Charakters: ");
        String herkunftsort = sc.nextLine();


        int index = -1;
        for (Charakter charakter: charakterRepository.getAllElements())
            if (charakter.getId() == id)
            {

                index = charakterRepository.getAllElements().indexOf(charakter);
                charakter.setName(name);
                charakter.setHerkunftsOrt(herkunftsort);

                charakterRepository.updateElement(index,charakter);
                break;
            }


    }

    void deleteCharakter(){
        System.out.println("ID des zu loschenden Charakters: ");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        sc.nextLine();

        Charakter charakterAux = new Charakter();

        for (Charakter charakter: charakterRepository.getAllElements())
            if (charakter.getId() == id)
            {
                charakterAux = charakter;
                break;
            }

        charakterRepository.remove(charakterAux);
    }

    //-------------


}
