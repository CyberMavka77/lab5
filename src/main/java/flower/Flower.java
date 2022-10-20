package flower;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Flower {
    private double sepalLength;
    private String color;
    private double price;

    public Flower(double sepalLength, FlowerColor red, double price) {
        setColor(red);
        this.sepalLength = sepalLength;
        this.price = price;

    }
    public Flower() {

    };

    public void setColor(FlowerColor coloR) {
        this.color = coloR.toString();

    }

}
