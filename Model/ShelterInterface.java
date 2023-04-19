package Model;

import java.util.List;

public interface ShelterInterface {
    List<Animal> getAllAnimals();
    String createAnimal(Animal animal);
    Animal showAnimal (String id);
}
