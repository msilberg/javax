/**
 * Created by mike on 31/08/16.
 */

class ArrayDemo {
//    private String foo = "here we go Foo";
    private int[] fooArray = new int[3];

    public void printResult() {
        fooArray[0] = 100;
        fooArray[1] = 200;
        fooArray[2] = 300;
        System.out.println(fooArray[0]);
        System.out.println(fooArray[1]);
        System.out.println(fooArray[2]);
    }
}