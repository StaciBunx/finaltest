package Model;

public class Donkey extends Animal{
    private String type = "pack animal";

    public String getType() {
        return type;
    }

    public Donkey(String id, String name, String birthday, String command) {
        super(id, name, birthday, command);
    }

    @Override
    public String toString() {
        return String.format("%s, type: %s", super.toString(), getType());
    }
}
