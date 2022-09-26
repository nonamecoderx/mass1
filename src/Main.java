import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //массив 1
        int[] massive1 = new int[3];
        massive1[0] = 1;
        massive1[1] = 2;
        massive1[2] = 3;
        for (int i = 0; i < massive1.length; i++) {
            if (massive1[i] % 2 != 0) {
                massive1[i] += 1;
            }
            System.out.print(massive1[i]);
            if (i != massive1.length - 1) {
                System.out.print(", ");
            }
        }
    }
}

