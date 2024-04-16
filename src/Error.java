public class Error {
    public static void main(String[] args) {
        int [] numbers = new int[5];
        numbers[0] = 100;
        numbers[1] = 200;
        numbers[2] = 300;
        numbers[3] = 400;
        numbers[4] = 500;
        System.out.println("Try to access elements outside the size of Array");
        System.out.println(numbers[6]);
    }
}
//JVM throws "ArrayIndexOutOfBoundsException" to indicate that the Array has been accessed with an illegal Index.
