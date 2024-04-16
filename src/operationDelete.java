public class operationDelete {
    public static void main(String[] args) {
        int numbers [] = {5,10,15,20,25,30};
        System.out.println("Before Deleting:-");
        for (int i = 0; i <numbers.length; i++) {
            System.out.print(numbers[i]+"  ");
        }
        int index = 3;
        int size = 6;
        for (int i = index;i < size-1;i++) {
            numbers[i] = numbers[i+1];
        }
        System.out.println("");
        System.out.println("After Deleting:-");
        for (int i = 0;i < size-1;i++) {
            System.out.print(numbers[i]+"  ");
        }
    }
}
