package lambda;

/**
 * Created by abhisheks on 16-05-2020.
 */
public class Apple {

    private int weight;
    private String colour;

    public Apple(int weight, String colour) {
        this.weight = weight;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                ", colour='" + colour + '\'' +
                '}';
    }

    public int getWeight() {
        return weight;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Apple)) return false;

        Apple apple = (Apple) o;

        if (getWeight() != apple.getWeight()) return false;
        return getColour().equals(apple.getColour());
    }

    @Override
    public int hashCode() {
        int result = getWeight();
        result = 31 * result + (getColour() != null ? getColour().hashCode() : 0);
        return result;
    }
}
