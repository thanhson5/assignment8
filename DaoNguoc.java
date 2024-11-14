public class DaoNguoc {
    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {
        String original = "hello";
        String reversed = reverseString(original);
        System.out.println("Chuoi ban dau: " + original);
        System.out.println("Chuoi sau khi dao nguoc: " + reversed);
    }
}

