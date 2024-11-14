public class XoaKhoangTrang {

    public static String removeExtraSpaces(String str) {
        return str.trim().replaceAll("\\s+", " ");
    }

    public static void main(String[] args) {
        String input = " Hello   World  ";
        String result = removeExtraSpaces(input);
        System.out.println("Original String: '" + input + "'");
        System.out.println("Modified String: '" + result + "'");
    }
}

