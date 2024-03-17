public class Main {
    static int[] numArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    static int getNumber(int index) {
        try {
            return numArray[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Invalid index!! Array size: " + numArray.length);

            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(getNumber(1));
        System.out.println(getNumber(10));
    }
}