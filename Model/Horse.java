package Model;

public class Horse extends Animal{

    private String type = "pack animal";

    public String getType() {
        return type;
    }

    public Horse(String id, String name, String birthday, String command) {
        super(id, name, birthday, command);
    }

    @Override
    public String toString() {
        return String.format("%s, type: %s", super.toString(), getType());
    }
}
