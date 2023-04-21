package Model;

public class Counter implements AutoCloseable {
    public static int sum = 0;

    public void add() {
        sum++;
    }

    @Override
    public void close() throws Exception {
        throw new Exception("Counter closed");
    }

}
