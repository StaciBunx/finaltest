package Controller;

import Model.Animal;
import Model.Cat;
import Model.Shelter;

public interface AnimalManager {
    public Animal createAnimal(String id, String name, String birthday, String command);


}
