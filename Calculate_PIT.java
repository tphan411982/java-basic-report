
public class PersonalIncomeTax {

    public static void main(String[] args) {

        // Thu nhập hàng năm (triệu đồng)
        double income = 20; // bạn có thể đổi số này

        double taxRate = 0;
        double tax;

        if (income <= 5) {
            taxRate = 0.05;
        } else if (income <= 10) {
            taxRate = 0.10;
        } else if (income <= 18) {
            taxRate = 0.15;
        } else if (income <= 32) {
            taxRate = 0.20;
        } else if (income <= 52) {
            taxRate = 0.25;
        } else if (income <= 80) {
            taxRate = 0.30;
        } else {
            taxRate = 0.35;
        }

        tax = income * taxRate;

        System.out.println("Thu nhập: " + income + " triệu đồng");
        System.out.println("Thuế suất: " + (taxRate * 100) + "%");
        System.out.println("Số thuế phải trả: " + tax + " triệu đồng");
    }
}
