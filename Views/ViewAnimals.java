package Views;

import java.util.Scanner;

import Controller.AnimalManager;
import Model.Animal;
import Model.Camel;
import Model.Cat;
import Model.Dog;
import Model.Donkey;
import Model.Hamster;
import Model.Horse;
import Model.Shelter;

public class ViewAnimals {

    // private Shelter shelter = new Shelter();
    private AnimalManager manager;

    public ViewAnimals(AnimalManager manager) {
        this.manager = manager;
    }

    public void run() {
        Commands com = Commands.NONE;

        while (true) {
            String commands = prompt(
                    "Hello! Type what do you want to do:\n[ADD] - add new animal\n[COMM] - check out animal command\n[VIEW] - view all animals in the shelter\n[EXIT] - if you want to quit\n");
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
                        Animal newAnimal = setAnimal();
                        manager.saveAnimal(newAnimal);
                        System.out.println("New animal has been added!\n\n");
                        break;

                    case COMM:

                        break;

                    case VIEW:

                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

    }

    private Animal setAnimal() throws Exception {
        String species = prompt("Type what is the animal:\n1.cat\n2.dog\n3.hamster\n4.horse\n5.camel\n6.donkey");
        String id = prompt("Id: ");
        String name = prompt("Name: ");
        String birthday = prompt("Birthday: ");
        String command = prompt("Which commands your animal can do: ");
        if (species.contains("1"))
            return new Cat(id, name, birthday, command);
        if (species.contains("2"))
            return new Dog(id, name, birthday, command);
        if (species.contains("3"))
            return new Hamster(id, name, birthday, command);
        if (species.contains("4"))
            return new Horse(id, name, birthday, command);
        if (species.contains("5"))
            return new Camel(id, name, birthday, command);
        if (species.contains("6"))
            return new Donkey(id, name, birthday, command);
        throw new Exception("Wrong command");

    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
