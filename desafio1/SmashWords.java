package desafio1;

public class SmashWords{
    public static String smash(String[] words) {

        String result = "";
        for (int i = 0; i < words.length; i++) {
            result += words[i];
            if (i < words.length - 1) {
                result += " ";
            }
        }
        return result;
    }
}
