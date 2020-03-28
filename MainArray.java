package Arrays;

import java.util.ArrayList;
import java.util.Iterator;

public class MainArray {
    public static void main(String[] args) {
        ArrayList passport = new ArrayList();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            int n = (int) (Math.random() * 1_000_000);
            passport.add(n);
        }
        long finish = System.currentTimeMillis() - start;

        System.out.println("Размер массива " + passport.size());
        System.out.println("Время создания массива " + finish + " ms");

        Iterator iterator = passport.iterator();
        long startDel = System.currentTimeMillis();
        while (iterator.hasNext()) {
            passport.clear();
        }

        long finishDel = System.currentTimeMillis() - startDel;
        System.out.println("Размер массива " + passport.size());
        System.out.println("Время удаления массива " + finishDel + " ms");

    }

}