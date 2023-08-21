package Model.FileSystem;

import Model.Human.Human;

import java.io.IOException;

public interface Workable<E> {
    void fileWD(E h, String path) throws IOException;
    void fileR(String path) throws IOException, ClassNotFoundException;
}
