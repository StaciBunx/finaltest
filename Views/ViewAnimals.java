package Views;

import java.util.Scanner;

public class ViewAnimals {

    public void run() {
        Commands com = Commands.NONE;

        while (true) {
            String commands = prompt(
                    "Type what do you want to do:\n 1. Add animal (ADD)\n2. View animal command (COMMAND)\n3.View all animals in shelter(VIEW)\n4.EXIT");
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

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
