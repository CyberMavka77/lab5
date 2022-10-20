package flower;

import java.util.ArrayList;

public class FlowerBucket {
    private ArrayList<FlowerPack> flowers;
    public FlowerBucket() {
        this.flowers = new ArrayList<FlowerPack>();
    }

    public void add(FlowerPack flower) {
        this.flowers.add(flower);
    }

    public double getPrice() {
        double retPrice = 0;
        for (FlowerPack fl: this.flowers) {
            retPrice += fl.getPrice();
        }
        return retPrice;
    }
}
