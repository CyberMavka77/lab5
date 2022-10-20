package flower;

public enum FlowerColor {
    RED("#FF0000"), GREEN("00FF00"), BLUE("0000FF");
    private final String stringrepresentation;


    FlowerColor(String stringrepresentation) {
        this.stringrepresentation = stringrepresentation;

    }

    @Override
    public String toString() {
        return stringrepresentation;
    }
}
