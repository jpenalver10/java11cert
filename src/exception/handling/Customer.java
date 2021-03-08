package exception.handling;

public class Customer {

    private Clothing[] clothings = new Clothing[5];

    public void printAveragePrice() {

        int total = 0;
        int elements = 0;
        int average = 0;

        for (Clothing clothing: clothings) {

            if (clothing.isL()) {
                total += clothing.getPrice();
                elements++;
            }

        }

        if (elements > 0) {
            average = total / elements;
        }

        /*try {
            average = total / elements;
        } catch (ArithmeticException aex) {
            aex.printStackTrace();
        }*/

        System.out.println("Average = " + average);
    }


    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.clothings[0] = new Clothing(1);
        customer.clothings[1] = new Clothing(2);
        customer.clothings[2] = new Clothing(3);
        customer.clothings[3] = new Clothing(4);
        customer.clothings[4] = new Clothing(5);

        customer.printAveragePrice();


    }

}
