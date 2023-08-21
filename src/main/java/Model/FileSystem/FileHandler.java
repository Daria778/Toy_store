package Model.FileSystem;

import Model.Human.Human;

import java.io.*;

public class FileHandler<E> implements Workable<E>{
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
    public void fileR(String path) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
