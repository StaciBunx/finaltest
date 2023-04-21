package Views;

import java.util.List;
import java.util.Scanner;

import Controller.AnimalManager;
import Model.*;

public class ViewAnimals {

    private AnimalManager manager;

    public ViewAnimals(AnimalManager manager) {
        this.manager = manager;
    }

    public void run() {
        Commands com = Commands.NONE;

        while (true) {
            String commands = prompt(
                    "Type what do you want to do:\n[ADD] - add new animal\n[CHECK] - check out current animal's info\n[LIST] - list all animals in the shelter\n[EXIT] - if you want to quit\n");
            try {
                com = Commands.valueOf(commands);
            } catch (IllegalArgumentException e) {
                System.out.println("This command doesn't exist");
            }
            if (com == Commands.EXIT)
                return;
            try {
                switch (com) {
                    case ADD:
                        try (Counter counter = new Counter()) {
                            Animal newAnimal = setAnimal();
                            manager.saveAnimal(newAnimal);
                            System.out.println("New animal has been added!\n");
                            break;
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    case CHECK:
                        showAnimal();
                        break;

                    case LIST:
                        List<Animal> animalList = manager.readAnimalList();
                        for (Animal animal : animalList) {
                            System.out.println(animal);
                        }
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

    }

    private void showAnimal() throws Exception {
        String choice = prompt(
                "Type what do you want to do:\n1.Check out current animal in the shelter\n2.Update commands for the aminal\n");
        String searchId = "";
        try {
            switch (choice) {
                case "1":
                    searchId = prompt("Type animal's Id\n");
                    Animal searchedAnimal = manager.readAnimalRecord(searchId);
                    System.out.println("Here what we found!");
                    System.out.println(searchedAnimal);
                    System.out.println();
                    break;
                case "2":
                    searchId = prompt("Type animal's Id:\n");
                    String newCommand = prompt("Type new commands:\n");
                    manager.updateCommands(searchId, newCommand);
                    System.out.println("Commands updated!\n");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Wrong command!");
        }
    }

    private Animal setAnimal() throws Exception {
        String species = prompt("Type what is the animal:\n1.cat\n2.dog\n3.hamster\n4.horse\n5.camel\n6.donkey\n");
        String id = prompt("Id: ");
        String name = prompt("Name: ");
        String birthday = prompt("Birthday: ");
        String type = "";
        String command = prompt("Which commands your animal can do: ");
        if (species.equals("1")) {
            type = "cat, home animal";
            return new Cat(id, name, birthday, command, type);
        }
        if (species.equals("2")) {
            type = "dog, home animal";
            return new Dog(id, name, birthday, command, type);
        }
        if (species.equals("3")) {
            type = "hamster, home animal";
            return new Hamster(id, name, birthday, command, type);
        }
        if (species.equals("4")) {
            type = "horse, pack animal";
            return new Horse(id, name, birthday, command, type);
        }
        if (species.equals("5")) {
            type = "camel, pack animal";
            return new Camel(id, name, birthday, command, type);
        }
        if (species.equals("6"))

        {
            type = "donkey, pack animal";
            return new Donkey(id, name, birthday, command, type);
        }
        throw new Exception("Wrong command");

    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
