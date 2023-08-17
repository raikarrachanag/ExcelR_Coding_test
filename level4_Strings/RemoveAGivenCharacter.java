package level4_Strings;

public class RemoveAGivenCharacter {
	public static void main(String[] args) {
        String input = "Hello, World!";
        String charactersToRemove = "aeiou";
        String stringWithoutCharacters = removeCharacters(input, charactersToRemove);

        System.out.println("String without specified characters: " + stringWithoutCharacters);
    }

    public static String removeCharacters(String str, String charactersToRemove) {
        return str.replaceAll("[" + charactersToRemove + "]", "");
    }
}
