package Controller;

import java.util.List;

import Model.Animal;
import Model.AnimalBasic;
import Model.Shelter;

public class AnimalManager {
    private Shelter shelter;

    public AnimalManager(Shelter shelter) {
        this.shelter = shelter;
    }

    public void saveAnimal(Animal animal) throws Exception {
        // validateAnimal(animal);
        shelter.createAnimal(animal);
    }

    public List<Animal> readAnimalList() {
        return shelter.getAllAnimals();
    }

    public Animal readAnimalRecord (String id) throws Exception {
        return shelter.showAnimal(id);
    }

}
