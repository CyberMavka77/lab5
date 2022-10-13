package flower;

import java.util.ArrayList;

public class FlowerBucket {
    private ArrayList<FlowerPack> flowers;
    public void add(FlowerPack flower){
        this.flowers.add(flower);
    }

    public double getPrice(){
        double ret_price = 0;
        for (FlowerPack fl: this.flowers){
            ret_price += fl.getPrice();
        }
        return ret_price;
    }
}
