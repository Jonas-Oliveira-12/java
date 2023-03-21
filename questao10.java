public class questao10 {
    public static void main(String[] args) {
        int[] valores = { 127, 67, 35, 69 };

        for (int valor : valores) {
            System.out.println(reverse(valor));
        }
    }

    public static int reverse(int num) {
        int reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return reversed;
    }
}