package level4_Strings;

public class SubStringCount {
	public static void main(String[] args) {
        String sentence = "This is a sample sentence.";
        int count = countSubstrings(sentence);
        System.out.println("Number of substrings: " + count);
    }

    public static int countSubstrings(String str) {
        int n = str.length();
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                count++;
            }
        }

        return count;
    }
}

