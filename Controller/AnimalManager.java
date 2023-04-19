package Controller;

import Model.Animal;
import Model.Cat;
import Model.Shelter;

public class AnimalManager {
    private Shelter shelter;

    public AnimalManager(Shelter shelter) {
        this.shelter = shelter;
    }

    public void saveAnimal(Animal animal) throws Exception {
        validateAnimal(animal);
        shelter.addAnimal(animal);
    }
}
