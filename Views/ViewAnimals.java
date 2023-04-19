package Views;

import java.util.Scanner;

import Controller.AnimalManager;
import Model.Animal;
import Model.Cat;
import Model.Shelter;

public class ViewAnimals {

    private Shelter shelter = new Shelter();

    public void run() {
        Commands com = Commands.NONE;

        while (true) {
            String commands = prompt(
                    "Hello! Type what do you want to do:\n1. [ADD] - Add animal\n2. View animal command (COMMAND)\n3.View all animals in shelter(VIEW)\n4.EXIT");
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
                        Animal animal = setAnimal();
                        shelter.addAnimal(animal);
                        break;

                    case COMMAND:

                        break;

                    case VIEW:

                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

    }

    private Animal setAnimal() throws Exception{
        String species = prompt("Type what is the animal:\n1.cat\n2.dog\n3.hamster\n4.horse\n5.camel\n6.donkey");
        String id = prompt("Id: ");
        String name = prompt("Name: ");
        String birthday = prompt("Birthday: ");
        String command = prompt("Which commands your animal can do: ");
        if (species.contains("1"))
            return new Cat(id, name, birthday, command);
        throw new Exception("Wrong command");




    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
