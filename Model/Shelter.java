package Model;

import java.util.ArrayList;
import java.util.List;

public class Shelter implements ShelterInterface {
    private FileOperations fileOperations;
    private AnimalMapper mapper = new AnimalMapper();

    public Shelter(FileOperations fileOperations) {
        this.fileOperations = fileOperations;
    }

    @Override
    public List<Animal> getAllAnimals() {
        List<String> lines = fileOperations.readAllLines();
        List<Animal> animals = new ArrayList<>();
        for (String line : lines) {
            animals.add(mapper.map(line));
        }
        return animals;
    }

    @Override
    public void createAnimal(Animal animal) {
        List<Animal> animals = getAllAnimals();
        animals.add(animal);
        saveAnimalForFile(animals);

    }

    private void saveAnimalForFile(List<Animal> animals) {
        List<String> lines = new ArrayList<>();
        for (Animal item : animals) {
            lines.add(mapper.map(item));
        }
        fileOperations.saveAllLines(lines);
    }

    @Override
    public Animal showAnimal(String id) throws Exception {
        List<Animal> animals = getAllAnimals();
        return findAnimalbyId(animals, id);
    }

    private Animal findAnimalbyId(List<Animal> animals, String animalId) throws Exception {
        for (Animal animal : animals) {
            if (animal.getId().equals(animalId)) {
                return animal;
            }
        }
        throw new Exception("Animal not found");
    }



    @Override
    public void deleteAnimal(String id) throws Exception {
        List<Animal> animals = getAllAnimals();
        Animal foundAnimal = findAnimalbyId(animals, id);
        animals.remove(foundAnimal);
        saveAnimalForFile(animals);
    }

    @Override
    public void updateCommands(String id, String newCommand) throws Exception {
        List<Animal> animals = getAllAnimals();
        Animal updateAnimal = findAnimalbyId(animals, id);
        updateAnimal.setCommand(newCommand);
        deleteAnimal(id);
        createAnimal(updateAnimal);

    }

}
