package Model.FileSystem;

import Model.Toys.Showcase;
import java.io.*;


public class FileHandler<E> implements Workable<E>, Serializable{

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
    public void fileWDToys(Showcase toy) throws IOException {
        boolean flag = false;

        File file = new File("toys.data");
        ObjectOutputStream oos = null;
        try {
            FileOutputStream fos = new FileOutputStream(file);
            if (fos!= null) {
                oos = new ObjectOutputStream(fos);
                oos.writeObject(toy);
                flag = true;
                System.out.println(toy.size());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (oos != null){
                oos.close();
            }
        }
    }

    @Override
    public Showcase fileRToys() {
        File file = new File("toys.data");
        ObjectInputStream ois = null;
        try {
            FileInputStream fis = new FileInputStream(file);
            if (fis!= null) {
                ois = new ObjectInputStream(fis);
                Showcase toy = (Showcase) ois.readObject();
                return toy;
            }
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                ois.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
            throw new RuntimeException("failed");
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
