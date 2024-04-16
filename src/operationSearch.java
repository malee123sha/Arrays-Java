public class operationSearch {
    static int findElement (int arr[],int size,int searchValue ) {
        for (int i = 0;i <size;i++) {
            if (arr[i] == searchValue) {
                return i;
            }
        }
            return - 1;
    }
    public static void main(String[] args) {
        int arr [] = {12,34,78,93};
        int size =arr.length;
        int searchValue = 93;
        int index = findElement(arr,size,searchValue);
        if (searchValue == -1) {
            System.out.println("Search Value Not Found");
        } else {
            System.out.println("Search Value Found:-"+index);
        }
    }
}
