package Arrays;

import java.util.ArrayList;
import java.util.Collection;

public class Filt{
    Collection<FilClass> filter(Collection<FilClass> Col) {
        Collection<FilClass> list = new ArrayList<>();
        for (FilClass FilClass : Col) {
            if (FilClass.getNumber() > 1) {
                list.add(FilClass);
            }
        }
        return list;
    }
}