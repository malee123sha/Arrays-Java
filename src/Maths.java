public class Maths {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0;i < numbers.length;i++) {
            System.out.print(i+" ");
        }
        int sum = 0;
        double average;
        for (int i : numbers) {
            sum = sum + i;
        }
       int len = numbers.length;
        average = (double) sum / (double) len;
        System.out.println();
        System.out.println("Sum:-"+sum);
        System.out.println("Average:-"+average);
    }
}
