package flower;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Flower {
    private double sepalLength;
    private String color;
    private double price;
    public void setColor(FlowerColor color){
        this.color = color.toString();
    }

}
