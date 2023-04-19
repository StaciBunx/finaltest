package Model;

import java.util.List;

public interface FileOperationsInterface {
    List<String> readAllLines();
    void saveAllLines(List<String> lines);

}
