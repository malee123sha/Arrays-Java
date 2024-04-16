public class maxValue {
    static void max (int arr1[]) {
            int max = arr1[0];
            for (int i = 1; i < arr1.length; i++) {
                if (max < arr1[i]) {
                    max = arr1[i];
                }
            }
            System.out.println(max);
        }
        public static void main(String[] args) {
            int arr1 [] = {67,85,19,92,54,86};
            max (arr1);
        }
}
