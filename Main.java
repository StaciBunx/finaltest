import Model.*;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("1", "musya", "soon", "eat only");
        Animal horse = new Horse("2", "pavel", "this year", "jump");
        System.out.println(cat);
        System.out.println(horse);
    }
}
