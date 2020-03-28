package Arrays;

import java.util.ArrayList;
import java.util.Collection;


public class MainGen {
    public static void main(String[] args) {
        FilClass fc1 = new FilClass(1, "one");
        FilClass fc2 = new FilClass(2, "two");
        FilClass fc3 = new FilClass(3, "three");
        Collection<FilClass> Col = new ArrayList<>();
        Col.add(fc1);
        Col.add(fc2);
        Col.add(fc3);
        Col = new Filt().filter(Col);
        for (FilClass FilClass : Col) {

            System.out.println(FilClass.getNumber());

        }
    }
}


