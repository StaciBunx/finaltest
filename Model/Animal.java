package Model;

/**
 * Abstract class Animal
 */
public abstract class Animal {
    protected String id = "";
    protected String name;
    protected String type;
    protected String birthday;
    protected String command;

    public String getType() {
        return type;
    }

    public Animal(String id, String name, String birthday, String command) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.command = command;
    }

    public Animal(String id, String name, String birthday, String command, String type) {
        this(id, name, birthday, command);
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }


    @Override
    public String toString() {
        return String.format("Id: %s, name: %s, birthday: %s, command: %s, type: %s", getId(), getName(),
                getBirthday(), getCommand(), getType());
    }

}