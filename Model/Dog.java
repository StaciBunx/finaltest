package Model;

public class Dog  extends Animal{
    private String type = "home animal";

    public String getType() {
        return type;
    }

    public Dog(String id, String name, String birthday, String command) {
        super(id, name, birthday, command);
    }

    @Override
    public String toString() {
        return String.format("%s, type: %s", super.toString(), getType());
    }
}
