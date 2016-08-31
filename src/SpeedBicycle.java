/**
 * Created by mike on 7/27/16.
 */

interface Bicycle {

    void setSpeed(int newSpeed);

    void setPrice(int newPrice);

    void printResult();

}

class SpeedBicycle implements Bicycle {

    private int speed;
    private int price;
    private long idNumber = 123_456_789_012L;
    private float pi = 3.14_15F;
    private float foo = 5.25456F;
    private int foo2 = 55;

    @Override
    public void setSpeed(int newSpeed) {
        speed = newSpeed;
    }

    @Override
    public void setPrice(int newPrice) {
        price = newPrice;
    }

    @Override
    public void printResult() {
        System.out.println("bicycle has " + speed + " speeds, it costs " + price + " NIS");
        System.out.println(idNumber);
        System.out.println(pi);
        System.out.println(foo);
        System.out.println(foo2);
    }
}
