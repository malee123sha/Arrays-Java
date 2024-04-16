public class iterateArrayForLoop {
    public static void main(String[] args) {
        String [] cars = new String[4];
        cars[0] = "BMW";
        cars[1] = "Mazda";
        cars[2] = "Alto";
        cars[3] = "Hybrid";
        for (int i = 0;i < cars.length;i++) {
            System.out.print(cars[i]+"  ");
        }
    }
}
