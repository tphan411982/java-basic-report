public class RemoveVowels {

    // Hàm xóa nguyên âm
    public static String removeVowels(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // kiểm tra nếu không phải nguyên âm
            if (ch != 'a' && ch != 'e' && ch != 'i' &&
                ch != 'o' && ch != 'u' &&
                ch != 'A' && ch != 'E' && ch != 'I' &&
                ch != 'O' && ch != 'U') {

                result.append(ch);
            }
        }
        return result.toString();
    }

    // Hàm main để test
    public static void main(String[] args) {
        System.out.println(removeVowels("Cybersoft")); // Cbrsft
        System.out.println(removeVowels("hello"));     // hll
    }
}