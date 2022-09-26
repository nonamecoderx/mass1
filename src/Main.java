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
        for (int i = massive1.length - 1; i >= 0; i--) {
            System.out.print(massive1[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        //вывели второй
        for (double a = massive2.length - 1; a >= 0; a--) {
            System.out.print(massive2[(int) a]);
            if (a != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        //вывели третий
        for (int b = massive3.length - 1; b >=0; b--) {
            System.out.print(massive3[b]);
            if (b != 0) {
                System.out.print(", ");
            }
        }
    }
}
