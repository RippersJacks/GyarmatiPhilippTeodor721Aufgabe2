import model.Charakter;
import model.Produkt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Console {

    public void run(){
        int option = -1;
        Scanner sc = new Scanner(System.in);

        while (option != 0)
        {
            System.out.println("""
                    1. Produkt CRUD
                    2. Charakter CRUD
                    3. Charakter nach Herkunftsort filtern
                    4. Alle Charaktere zeigen, die Produkte aus einer gegebenen Herkunftsregion gekauft haben""");

            option = sc.nextInt();
            sc.nextLine();

            switch (option){
                case 1:{
                    System.out.println("""
                            1. Erstelle ein neues Produkt
                            2. Finde ein Produkt
                            3. Zeige alle Produkte an
                            4. Aktualisiere ein Produkt
                            5. Losche ein Produkt""");
                    int option2 = sc.nextInt();
                    sc.nextLine();

                    switch (option2){
                        case 1:{
                            controller.createProdukt();
                            break;
                        }
                        case 2:{
                            controller.getProdukt();
                            break;
                        }
                        case 3:{
                            controller.getAllProdukte();
                            break;
                        }
                        case 4:{
                            controller.updateProdukt();
                            break;
                        }
                        case 5:{
                            controller.deleteProdukt();
                            break;
                        }
                    }

                    break;
                }
                case 2:{
                    System.out.println("""
                            1. Erstelle einen neuen Charakter
                            2. Finde einen Charakter
                            3. Zeige alle Charaktere an
                            4. Aktualisiere einen Charakter
                            5. Losche einen Charakter""");

                    int option2 = sc.nextInt();
                    sc.nextLine();

                    switch (option2){
                        case 1:{
                            controller.createCharakter();
                            break;
                        }
                        case 2:{
                            controller.getCharakter();
                            break;
                        }
                        case 3:{
                            controller.getAllCharakters();
                            break;
                        }
                        case 4:{
                            controller.updateCharakter();
                            break;
                        }
                        case 5:{
                            controller.deleteCharakter();
                            break;
                        }
                    }

                    break;
                }

                case 3:{
                    controller.charakterNachHerkunftsortFiltern();
                    break;
                }
                case 4:{
                    controller.zeigeKundenNachProduktHerkunft();
                    break;
                }
            }
        }
    }

    public Console() {}

    Controller controller;
    public Console(Controller controller) {
        this.controller = controller;
    }


    public static void main(String[] args) {
        Repository<Produkt> produktRepository = new Repository<>();
        Repository<Charakter> charakterRepository = new Repository<>();

        Console console = new Console();
        console.initialiseData(produktRepository, charakterRepository);

        Controller controller = new Controller(produktRepository, charakterRepository);

        console = new Console(controller);
        console.run();
    }


    public void initialiseData(Repository<Produkt> produktRepository, Repository<Charakter> charakterRepository) {
        Produkt produkt1 = new Produkt(1,"Schwert",300,"Moria");
        Produkt produkt2 = new Produkt(2,"Schild",100,"Moria");
        Produkt produkt3 = new Produkt(3,"Orangensaft",20,"Zwergenland");
        Produkt produkt4 = new Produkt(4,"Brot",25,"Zwergenland");
        Produkt produkt5 = new Produkt(5,"Zwiebeln",35,"Hobbitfelder");
        Produkt produkt6 = new Produkt(6,"Speer",270,"Saurons Schloss");

        produktRepository.addElement(produkt1);
        produktRepository.addElement(produkt2);
        produktRepository.addElement(produkt3);
        produktRepository.addElement(produkt4);
        produktRepository.addElement(produkt5);
        produktRepository.addElement(produkt6);


        List<Produkt> produktList1 = new ArrayList<>();
        produktList1.add(produkt1); produktList1.add(produkt5);
        Charakter charakter1 = new Charakter(1,"Gandalf","Moria",produktList1);

        List<Produkt> produktList2 = new ArrayList<>();
        produktList2.add(produkt1);
        Charakter charakter2 = new Charakter(2,"Zwergie","Zwergenland",produktList2);

        List<Produkt> produktList3 = new ArrayList<>();
        produktList3.add(produkt3); produktList3.add(produkt4); produktList3.add(produkt6);
        Charakter charakter3 = new Charakter(3,"Smeagal","Moria",produktList3);

        List<Produkt> produktList4 = new ArrayList<>();
        produktList4.add(produkt4); produktList4.add(produkt5);
        Charakter charakter4 = new Charakter(4,"Messi","Hobbitfelder",produktList4);

        charakterRepository.addElement(charakter1);
        charakterRepository.addElement(charakter2);
        charakterRepository.addElement(charakter3);
        charakterRepository.addElement(charakter4);
    }
}
