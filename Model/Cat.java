package Model;

public class Cat extends Animal{
    // private String type = "home animal";

    // public String getType() {
    //     return type;
    // }

    public Cat(String id, String name, String birthday, String command, String type) {
        super(id, name, birthday, command, type);

    }

    // @Override
    // public String toString() {
    //     return String.format("%s, type: %s", super.toString(), getType());
    // }

    // @Override
    // public Animal createAnimal(String id, String name, String birthday, String command) {
    //     return new Cat(type, name, birthday, command);
    // }


}
