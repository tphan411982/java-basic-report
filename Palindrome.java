
public class Palindrome {

    public static boolean isPalindrome(String str) {

        int left = 0;                  // vị trí đầu
        int right = str.length() - 1;  // vị trí cuối

        while (left < right) {

            if (str.charAt(left) != str.charAt(right)) {
                return false; // không đối xứng
            }

            left++;
            right--;
        }

        return true; // đối xứng
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome("madam")); // true
        System.out.println(isPalindrome("hello")); // false
    }
}
