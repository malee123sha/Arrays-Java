public class changeElementsMultiDimensionalArray {
    public static void main(String[] args) {
        int [] [] numbers =  {{1,2,3,4},{5,6,7,8}};
        numbers[0][3] = 10;
        System.out.println(numbers[0][3]);
        numbers[1][2] = 100;
        System.out.println(numbers[1][2]);
    }
}
