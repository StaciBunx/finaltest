package Model;

public class Horse extends Animal{

    // private String type = "pack animal";

    // public String getType() {
    //     return type;
    // }

    public Horse(String id, String name, String birthday, String command, String type) {
        super(id, name, birthday, command, type);
    }

    // @Override
    // public String toString() {
    //     return String.format("%s, type: %s", super.toString(), getType());
    // }

    // @Override
    // public Animal createAnimal(String id, String name, String birthday, String command) {
    //     return new Horse(type, name, birthday, command);
    // }
}
