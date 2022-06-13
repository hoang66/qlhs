import java.util.Comparator;

public class Sorttang implements Comparator<Qlsv> {

    @Override
    public int compare(Qlsv o1, Qlsv o2) {
        if (o1.getTinhdiemtrungbinh()>o2.getTinhdiemtrungbinh()){
            return 1;
        }else return  -1;
    }
}
