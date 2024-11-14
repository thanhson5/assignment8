public class TimTuDaiNhat {

    public static String findLongestWord(String str) {
        String[] words = str.split("\\s+");
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    public static void main(String[] args) {
        String input = "I love programming";
        String result = findLongestWord(input);
        System.out.println("Chuoi: '" + input + "'");
        System.out.println("Tu dai nhat: '" + result + "'");
    }
}
