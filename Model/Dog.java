package Model;

public class Dog extends Animal{
    // private String type = "home animal";

    // public String getType() {
    //     return type;
    // }

    public Dog(String id, String name, String birthday, String command, String type) {
        super(id, name, birthday, command, type);
    }

    // @Override
    // public String toString() {
    //     return String.format("%s, type: %s", super.toString(), getType());
    // }

    // @Override
    // public Animal createAnimal(String id, String name, String birthday, String command) {
    //     return new Dog(type, name, birthday, command);
    // }
}
