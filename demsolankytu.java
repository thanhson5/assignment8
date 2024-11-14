public class demsolankytu {
     public static int countOccurrences(String str, char ch) {
        int count = 0;
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        String str = "hello world";
        char ch = 'o';
        
        int occurrences = countOccurrences(str, ch);
        System.out.println("The character '" + ch + "' appears " + occurrences + " times in the string.");
    }
}
