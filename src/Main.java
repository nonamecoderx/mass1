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
        for (int i = 0; i < 2; i++) {
            System.out.print(massive1[i] + ", ");
        }
        System.out.println(massive1[2]);
        //вывели второй
        for (double a = 0; a < 2; a++) {
            System.out.print(massive2[(int) a] + ", ");
        }
        System.out.println(massive2[2]);
        //вывели третий
        for (int b = 0; b < 3; b++) {
            System.out.print(massive1[b] + ", ");
        }
        System.out.println(massive3[3]);
    }
}