public class minValue {
    static void min (int arr1[]) {
        int min = arr1[0];
        for (int i = 0; i < arr1.length; i++) {
            if (min > arr1[i]) {
                min = arr1[i];
            }
        }
        System.out.println(min);
    }
    public static void main(String[] args) {
        int arr1 [] = {67,10,85,19,54};
        min (arr1);
    }
}



