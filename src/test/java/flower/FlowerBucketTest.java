package flower;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlowerBucketTest {
    private FlowerBucket flowerBucket;
    public static final int PRICE = 10;
    public static final int AM = 10;
    public static final int TESTPRICE = 100;


    @BeforeEach
    public void init() {

        Flower flower = new Rose();
        flower.setPrice(PRICE);
        FlowerPack flowerPack = new FlowerPack(flower, AM);
        flowerBucket = new FlowerBucket();
        flowerBucket.add(flowerPack);
    }

    @Test
    public void testPrice() {
        assertEquals(TESTPRICE, flowerBucket.getPrice());
    }

}
