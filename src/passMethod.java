public class passMethod {
    public static void main(String[] args) {
        int numbers [] = {10,20,30,40,50};
        //pass array to the method
        sum(numbers);
    }
    public static void sum(int [] numbers) {
        //get the sum of array values
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            System.out.println("Sum:-" + sum);
        }
    }
}
