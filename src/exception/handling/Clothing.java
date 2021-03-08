package exception.handling;

public class Clothing {

    private static final String SIZE_L = "L";

    private int price;
    private String size;

    public Clothing(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public boolean isL() {
      return SIZE_L.equals(size);
    }

}
