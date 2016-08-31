/**
 * Created by mike on 31/08/16.
 */

class ArrayDemo {
    private int[] fooArray = new int[3];
    private int[] fooArray2 = {400, 500, 600};
    private String[][] fooArray3 = {
            {"one", "two", "three"},
            {"four", "five", "six"},
            {"seven", "eight", "nine"}
    };

    public void printResult() {
        fooArray[0] = 100;
        fooArray[1] = 200;
        fooArray[2] = 300;

        System.out.println(fooArray[0]);
        System.out.println(fooArray[1]);
        System.out.println(fooArray[2]);
        System.out.println("==========================");
        System.out.println(fooArray2[0]);
        System.out.println(fooArray2[1]);
        System.out.println(fooArray2[2]);
        System.out.println("==========================");
        System.out.println(fooArray3[0][0]);
        System.out.println(fooArray3[0][1]);
        System.out.println(fooArray3[0][2]);
        System.out.println(fooArray3[1][0]);
        System.out.println(fooArray3[1][1]);
        System.out.println(fooArray3[1][2]);
        System.out.println(fooArray3[2][0]);
        System.out.println(fooArray3[2][1]);
        System.out.println(fooArray3[2][2]);
    }
}