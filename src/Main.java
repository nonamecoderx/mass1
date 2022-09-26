public class Main {
    public static void main(String[] args) {
        //массив 1
        int[] massive1 = new int[3];
        massive1[0] = 1;
        massive1[1] = 2;
        massive1[2] = 3;
        //массив 2
        double[] massive2 = {1.57, 7.654, 9.986};
        //массив 3
        int[] massive3 = {5, 10, 15, 20};
        //вывели первый
        for (int i = 0; i < massive1.length; i++) {
            System.out.print(massive1[i]);
            if (i != massive1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        //вывели второй
        for (double a = 0; a < massive2.length; a++) {
            System.out.print(massive2[(int) a]);
            if (a != massive1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        //вывели третий
        for (int b = 0; b < massive3.length; b++) {
            System.out.print(massive3[b]);
            if (b != massive3.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
