package Controller;

import java.util.List;

import Model.Animal;
import Model.Shelter;

public class AnimalManager {
    private Shelter shelter;

    public AnimalManager(Shelter shelter) {
        this.shelter = shelter;
    }

    public void saveAnimal(Animal animal) throws Exception {
        validateAnimal(animal);
        shelter.createAnimal(animal);
    }

    public List<Animal> readAnimalList() {
        return shelter.getAllAnimals();
    }

    public Animal readAnimalRecord (String id) throws Exception {
        return shelter.showAnimal(id);
    }

    public void updateCommands (String id, String newCommand) throws Exception {
        shelter.updateCommands(id, newCommand);
    }

    public void deleteAnimal(String id) throws Exception {
        shelter.deleteAnimal(id);
    }

    private void validateAnimal(Animal animal) throws Exception {
        if (animal.getId().isEmpty()) {
            throw new Exception("Id can't be empty!");
        }
        if (animal.getName().isEmpty()) {
            throw new Exception("Name can't be empty!");
        }
        if (animal.getBirthday().isEmpty()) {
            throw new Exception("Birthday can't be empty!");
        }
        if (animal.getCommand().isEmpty()) {
            throw new Exception("Commands can't be empty!");
        }
    }
}
