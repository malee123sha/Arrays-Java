public class operationInsert {
    public static void main(String[] args) {
        int arr[] = new int[10];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 60;
        arr[6] = 70;
        arr[7] = 80;
        int size = 8;
        int insertValue = 500;
        System.out.println("Before Inserting:-");
        for (int i = 0;i < size;i++){
            System.out.print(arr[i]+"  ");
        }
        arr[size] = insertValue;
        size = size + 1;
        System.out.println(" ");
        System.out.println("After Inserting:-");
        for (int i = 0;i < size;i++){
            System.out.print(arr[i]+"  ");
        }
    }
}
