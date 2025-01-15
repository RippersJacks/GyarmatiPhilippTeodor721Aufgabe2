import model.Produkt;

import java.util.Scanner;

public class Console {

    public void run(){
        int option = -1;
        Scanner sc = new Scanner(System.in);

        while (option != 0)
        {
            System.out.println("""
                    1. Produkt CRUD
                    2.
                    3.""");

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
                            1. Erstelle
                            2. Finde einen
                            3. Zeige alle an
                            4. Aktualisiere einen
                            5. Losche einen""");

                    int option2 = sc.nextInt();
                    sc.nextLine();

                    switch (option2){
                        case 1:{

                            break;
                        }
                        case 2:{

                            break;
                        }
                        case 3:{

                            break;
                        }
                        case 4:{

                            break;
                        }
                        case 5:{

                            break;
                        }
                    }

                    break;
                }

                case 3:{

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
        Repository<String> repository2 = new Repository<>();

        Console console = new Console();
        console.initialiseData(produktRepository, repository2);

        Controller controller = new Controller(produktRepository, repository2);

        console = new Console(controller);
        console.run();
    }


    public void initialiseData(Repository<Produkt> produktRepository, Repository<String> repository2) {
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
    }
}
