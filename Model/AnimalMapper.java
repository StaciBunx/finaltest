package Model;

public class AnimalMapper {

    public String map(Animal animal) {
        return String.format("%s,%s,%s,%s,%s", animal.getId(), animal.getName(), animal.getBirthday(),
                animal.getCommand(), animal.getType());
    }

    public Animal map(String line) {
        String[] lines = line.split(",");
        return new AnimalBasic(lines[0], lines[1], lines[2], lines[3], lines[4]);
    }
}
