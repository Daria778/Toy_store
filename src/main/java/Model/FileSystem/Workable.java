package Model.FileSystem;

import Model.Toys.Showcase;
import Model.Toys.Toy;

import java.io.IOException;
import java.util.List;

public interface Workable<E> {
    void fileWD(E h, String path) throws IOException;
    void fileWDToys(List<Toy> toys) throws IOException;
    void fileR(String path) throws IOException, ClassNotFoundException;
    List<?> fileRToys() throws IOException, ClassNotFoundException;


}
