package Lab.E_ListUtilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1 , 2 , 21, 4, 0, 5, 6, 7, 8, 22);

        System.out.println(ListUtils.getMax(list));
        System.out.println(ListUtils.getMin(list));
    }
}
