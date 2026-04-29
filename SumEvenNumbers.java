public class SumEvenNumbers{

    public static int sumEvenNumbers(int n) {

        int sum = 0; // biến lưu tổng

        for (int i = 0; i <= n; i++) {

            // kiểm tra số chẵn
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumEvenNumbers(10)); // 30
        System.out.println(sumEvenNumbers(5));  // 6
    }
}