import java.util.Arrays;

class ArrayDemo {
    private int[] fooArray = {100, 200, 300, 400, 500, 600, 700, 800, 900};
    private int[] fooArray2 = new int[3];
    private String[][] fooArray3 = {
            {"one", "two", "three"},
            {"four", "five", "six"},
            {"seven", "eight", "nine"}
    };
    private char[] fooArray4 = {'a', 'b', 'c', 'd', 'e', 'f'};

    public void printResult() {
        System.arraycopy(fooArray, 0, fooArray2, 2, 1);
        char[] fooCopyTo = Arrays.copyOfRange(fooArray4, 0, 5);

        System.out.println("==========================");
        System.out.println(Arrays.toString(fooArray));
        System.out.println("==========================");
        System.out.println(Arrays.toString(fooArray2));
        System.out.println("==========================");
        System.out.println(Arrays.deepToString(fooArray3));
        System.out.println("==========================");
        System.out.println(Arrays.toString(fooArray4));
        System.out.println("==========================");
        System.out.println(Arrays.toString(fooCopyTo));
    }
}