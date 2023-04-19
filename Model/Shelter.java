package Model;

import java.util.ArrayList;
import java.util.List;

public class Shelter implements ShelterInterface {
    private FileOperations fileOperations;
    private AnimalMapper mapper = new AnimalMapper();

    // List<Animal> shelter = new ArrayList<>();

    // public void addAnimal(Animal animal) {
    // shelter.add(animal);
    // }

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
    public Animal showAnimal(String animalId) throws Exception {
        List<Animal> animals = getAllAnimals();
        return findAnimalbyId(animals, animalId);
    }

    private Animal findAnimalbyId(List<Animal> animals, String animalId) throws Exception {
        for (Animal animal : animals) {
            if (animal.getId().equals(animalId)) {
                return animal;
            }
        }
        throw new Exception("User not found");
    }

}
