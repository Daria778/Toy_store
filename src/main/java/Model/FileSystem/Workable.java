package Model.FileSystem;

import Model.Human.Human;

import java.io.IOException;

public interface Workable {
    void fileWD(Human h, String path) throws IOException;
    void fileR(String path) throws IOException, ClassNotFoundException;
}
