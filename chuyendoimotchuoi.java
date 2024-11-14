public class chuyendoimotchuoi {
    public static String convertCase(String str) {
        StringBuilder converted = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if (Character.isUpperCase(ch)) {
                converted.append(Character.toLowerCase(ch));
            }
            else if (Character.isLowerCase(ch)) {
                converted.append(Character.toUpperCase(ch));
            }
            else {
                converted.append(ch);
            }
        }

        return converted.toString();
    }

    public static void main(String[] args) {
        String str = "Hello World";
        String result = convertCase(str);
        System.out.println("Converted string: " + result);
    }
}
