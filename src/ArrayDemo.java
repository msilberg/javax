import java.util.Arrays;

/**
 * Created by mike on 31/08/16.
 */

class ArrayDemo {
    private int[] fooArray = {100, 200, 300, 400, 500, 600, 700, 800, 900};
    private int[] fooArray2 = new int[3];
    private String[][] fooArray3 = {
            {"one", "two", "three"},
            {"four", "five", "six"},
            {"seven", "eight", "nine"}
    };

    public void printResult() {
        System.arraycopy(fooArray, 0, fooArray2, 2, 1);
        System.out.println("==========================");
        System.out.println(Arrays.toString(fooArray));
        System.out.println("==========================");
        System.out.println(Arrays.toString(fooArray2));
        System.out.println("==========================");
        System.out.println(Arrays.deepToString(fooArray3));
        System.out.println("==========================");

    }
}