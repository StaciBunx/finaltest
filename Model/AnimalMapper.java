package Model;

public class AnimalMapper {

    public String map(Animal animal) {
        return String.format("%s,%s,%s,%s,%s", animal.getId(), animal.getName(), animal.getBirthday(),
                animal.getCommand(), animal.getType());
    }

    public String[] map(String line) {
        String[] lines = line.split(",");
        return lines;
    }
}
