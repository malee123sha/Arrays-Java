public class operationUpdate {
    public static void main(String[] args) {
        int arr[] = {12,34,56,78,43,92};
        System.out.println("Before Updating:-");
        for (int i = 0;i< arr.length;i++) {
            System.out.print(arr[i]+"  ");
        }
        arr[2] = 100;
        System.out.println("");
        System.out.println("After Updating:-");
        for (int i = 0;i< arr.length;i++) {
            System.out.print(arr[i]+"  ");
        }
    }
}
