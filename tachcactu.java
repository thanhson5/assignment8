public class tachcactu {

    public static String[] splitWords(String str) {
        return str.split(" ");
    }

    public static void main(String[] args) {
        String str = "Java is fun";
        String[] words = splitWords(str);
        
        System.out.print("Words in the string: ");
        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}
