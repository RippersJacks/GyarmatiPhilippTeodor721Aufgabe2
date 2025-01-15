import model.Produkt;

import java.util.Scanner;

public class Controller {

    Repository<Produkt> produktRepository;
    Repository<String> repository2;

    public Controller(Repository<Produkt> repository1, Repository<String> repository2) {
        this.produktRepository = repository1;
        this.repository2 = repository2;
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

    void create2(){

    }

    void get2(){

    }

    void getAll2(){

    }

    void update2(){

    }

    void delete2(){

    }

    //-------------


}
