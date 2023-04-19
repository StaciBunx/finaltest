import java.io.File;

import Controller.AnimalManager;
import Model.*;
import Views.*;

public class Main {
    public static void main(String[] args) {
        FileOperations fileOperations = new FileOperations("shelter.txt");
        Shelter shelter = new Shelter(fileOperations);
        AnimalManager manager = new AnimalManager(shelter);
        ViewAnimals view = new ViewAnimals(manager);
        view.run();
    }
}
