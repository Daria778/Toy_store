package Model.FileSystem;

import Model.Toys.Showcase;
import Model.Toys.Toy;

import java.io.*;
import java.util.List;

public class FileHandler<E> implements Workable<E>, Serializable{
    private FileOutputStream fileOutputStream;
    private ObjectOutputStream objectOutputStream;
    private FileInputStream fileInputStream;
    private ObjectInputStream objectInputStream;
    private List<Toy> toys;

    public FileHandler() throws IOException {
        this.fileOutputStream = new FileOutputStream("Toys.txt");
        this.objectOutputStream = new ObjectOutputStream(fileOutputStream);
        this.fileInputStream = new FileInputStream("Toys.txt");
        this.objectInputStream = new ObjectInputStream(fileInputStream);
    }

    @Override
    public void fileWD(E h, String path) {
        File file = new File(path);
        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write(h.toString() + "\n");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void fileWDToys(List<Toy> toys) throws IOException {
        objectOutputStream.writeObject(toys);
        objectOutputStream.close();
    }

    @Override
    public List<?> fileRToys() throws IOException, ClassNotFoundException {
        List<?> toyList =  (List<?>)objectInputStream.readObject();
        objectInputStream.close();
        return toyList;
    }

    @Override
    public void fileR(String path) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            System.out.println("There are no toys");;
        }
    }
}
