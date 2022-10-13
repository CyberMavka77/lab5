package flower;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FlowerPack {
    private Flower flower;
    private int amount;
    public double getPrice(){
        return flower.getPrice() * amount;
    }
}
