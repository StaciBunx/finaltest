package Model;

public class Hamster extends Animal{
    private String type = "home animal";

    public String getType() {
        return type;
    }

    public Hamster(String id, String name, String birthday, String command) {
        super(id, name, birthday, command);
    }

    @Override
    public String toString() {
        return String.format("%s, type: %s", super.toString(), getType());
    }

}
