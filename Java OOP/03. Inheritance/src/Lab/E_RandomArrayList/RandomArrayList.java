package Lab.E_RandomArrayList;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList extends ArrayList {
    private Random random;

    public RandomArrayList() {
        this.random = new Random();
    }

    public Object getRandomElement() {
        Integer index = random.nextInt(super.size());
        Object element = super.get(index);
        super.set(index, super.size() - 1);
        super.remove(super.size() - 1);

        return element;
    }
}
