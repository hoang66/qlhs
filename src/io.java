import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class io {
    public void write(List<Qlsv> sv){
        File file=new File("Qlsv.txt");

        try {
            FileOutputStream fileOutputStream=new FileOutputStream(file);
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(sv);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("1");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public ArrayList<Qlsv> reader(){
        try {
            FileInputStream fileInputStream=new FileInputStream("Qlsv.txt");
            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
            return(ArrayList<Qlsv>) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("2");
        } catch (IOException e) {
        } catch (ClassNotFoundException e) {
        }
        return new ArrayList<>();
    }
}