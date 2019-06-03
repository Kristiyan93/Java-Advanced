package Lab.D_FragileBaseClass;

import java.util.Collections;

public class Predator extends Animal {

    private Integer health;

    public void feed(Food food) {
        super.eat(food);
        this.health++;
    }

    public void feedAll(Food[] foods) {
        Collections.addAll(super.foodEaten, foods);
        this.health = foods.length;
    }
}
