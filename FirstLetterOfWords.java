public class FirstLetterOfWords{

    public static String getFirstLetters(String str) {

        // Nếu chuỗi rỗng
        if (str == null || str.length() == 0) {
            return "";
        }

        String result = "";

        // Lấy chữ cái đầu tiên
        result = result + str.charAt(0);

        // Duyệt chuỗi từ ký tự thứ 2
        for (int i = 1; i < str.length(); i++) {

            // Nếu ký tự trước là dấu cách
            if (str.charAt(i - 1) == ' ') {
                result = result + " " + str.charAt(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(getFirstLetters("Xin chào các bạn")); // X C C B
        System.out.println(getFirstLetters("Hello World"));      // H W
    }
}