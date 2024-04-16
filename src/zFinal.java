import java.util.Scanner;
class zFinal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int totalCases;
        int caseValues;
        System.out.println("Enter No of Arrays :-");
        totalCases = s.nextInt();
        System.out.println(totalCases);
        int[][] arr = new int[totalCases][];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter No of Elements :-");
            caseValues = s.nextInt();
            System.out.println(caseValues);
            arr[i] = new int[caseValues];
            for (int j = 0; j < arr.length; j++) { arr[i][j] = s.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int even = 0, odd = 0;
            System.out.println("Cases " + i + " with " + arr[i].length + " Values");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
                if(arr[i][j] % 2 == 0) {
                    even++; // even +1;(+1 = ++)
                } else {
                    odd++;
                }
            }
            System.out.println("Total Even Numbers :- " + even + " "+"&"+" Total Odd Numbers :- " + odd);
        }
    }
}