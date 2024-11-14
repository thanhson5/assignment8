public class demsotu {

    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }
        
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        String str = "Java is fun";
        int wordCount = countWords(str);
        
        System.out.println("The string has " + wordCount + " words.");
    }
}

