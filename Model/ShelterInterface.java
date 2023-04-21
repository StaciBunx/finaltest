package Model;

import java.util.List;

public interface ShelterInterface {
    List<Animal> getAllAnimals();

    void createAnimal(Animal animal);

    Animal showAnimal(String id) throws Exception;

    void deleteAnimal(String id) throws Exception;

    void updateCommands(String id, String commands) throws Exception;

}
