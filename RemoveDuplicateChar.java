public class RemoveDuplicateChar {

    public static String removeDuplicate(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            // Nếu chưa có ký tự này trong result thì thêm vào
            if (result.indexOf(String.valueOf(c)) == -1) {
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicate("programming")); // progamin
        System.out.println(removeDuplicate("abca"));         // abc
    }
}