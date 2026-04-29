public class SecondLargest {

    public static int findSecondLargest(int[] arr) {

        // Nếu mảng có ít hơn 2 phần tử
        if (arr.length < 2) {
            return Integer.MIN_VALUE;
        }

        int max1 = Integer.MIN_VALUE; // lớn nhất
        int max2 = Integer.MIN_VALUE; // lớn thứ hai

        // Duyệt từng phần tử
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            }
            else if (arr[i] < max1 && arr[i] > max2) {
                max2 = arr[i];
            }
        }

        return max2;
    }

    public static void main(String[] args) {
        System.out.println(findSecondLargest(new int[]{1, 3, 4, 5, 0, 2})); // 4
        System.out.println(findSecondLargest(new int[]{10, 5, 10}));      // 5
        System.out.println(findSecondLargest(new int[]{3}));              // MIN_VALUE
    }
}