package Arrays;

import java.util.Iterator;
import java.util.LinkedList;

public class MainArray2 {
    public static void main(String[] args) {
        LinkedList passport2 = new LinkedList();
        long start2 = System.currentTimeMillis();
        for (int j = 0; j < 1_000_000; j++) {
            int m = (int) (Math.random() * 1_000_000);
            passport2.add(m);
        }
        long finish2 = System.currentTimeMillis() - start2;

        System.out.println("Размер массива " + passport2.size());
        System.out.println("Время создания массива " + finish2 + " ms");

        Iterator iterator2 = passport2.iterator();
        long startDel2 = System.currentTimeMillis();
        while (iterator2.hasNext()) {
            passport2.remove();
        }
        long finishDel2 = System.currentTimeMillis() - startDel2;
            System.out.println("Размер массива " + passport2.size());
        System.out.println("Время удаления массива " + finishDel2 + " ms");
    }
}