package Model;

import java.util.ArrayList;
import java.util.List;

public class Shelter implements ShelterInterface{
List<Animal> shelter = new ArrayList<>();

public void addAnimal(Animal animal) {
    shelter.add(animal);
}

@Override
public List<Animal> getAllAnimals() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getAllAnimals'");
}

@Override
public String createAnimal(Animal animal) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'createAnimal'");
}

@Override
public Animal showAnimal(String id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'showAnimal'");
}

}
