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
    }
}
