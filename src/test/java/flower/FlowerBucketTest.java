package flower;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FlowerBucketTest {
    public static final int PRICE = 10;
    public static final int AM = 10;
    public static final int TESTPRICE = 100;

    private FlowerBucket flowerBucket;

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
        Assertions.assertEquals(TESTPRICE, flowerBucket.getPrice());
    }

}
