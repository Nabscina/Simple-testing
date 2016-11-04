
import java.util.HashMap;

public class Morse {

    private HashMap<String, String> translations;

    public Morse() {

        translations = new HashMap<String, String>() {
            {
                put("A", ".-");
                put("B", "-...");
                put("C", "-.-.");
                put("D", "-..");
                put("E", ".");
                put("F", "..-.");
                put("G", "--.");
                put("H", "....");
                put("I", "..");
                put("J", ".---");
                put("K", "-.-");
                put("L", ".-..");
                put("M", "--");
                put("N", "-.");
                put("O", "---");
                put("P", ".--.");
                put("Q", "--.-");
                put("R", ".-.");
                put("S", "...");
                put("T", "-");
                put("U", "..-");
                put("V", "...-");
                put("W", ".--");
                put("X", "-..-");
                put("Y", "-.--");
                put("Z", "--..");
                put("Å", ".--.-");
                put("Ä", ".-.-");
                put("Ö", "---.");
                put("!", "-.-.--");
                put("?", "..--..");
                put("/", "-..-.");
                put("=", "-...-");
                put(":", "---...");
                put(";", "-.-.-.");
                put("+", ".-.-.");
                put("-", "-....-");
                put("_", "..--.-");
                put("\"", ".-..-.");
                put("'", ".----.");
                put("&", ".-...");
                put(",", "--..--");
                put(".", ".-.-.-");
                put("-", "-....-");
                put("(", "-.--.");
                put(")", "-.--.-");
                put("0", "-----");
                put("1", ".----");
                put("2", "..---");
                put("3", "...--");
                put("4", "....-");
                put("5", ".....");
                put("6", "-....");
                put("7", "--...");
                put("8", "---..");
                put("9", "----.");
                put(" ", "/");
            }
        };
    }

    public String translate(String s) {

        String ret = "";
        String current = "";
        String trimmedS = s.trim();

        for (int i = 0; i < trimmedS.length(); i++) {
            current = "";
            current += trimmedS.charAt(i);
            ret += getValue(current);

            if (i != trimmedS.length() - 1) {
                ret += " ";
            }
        }

        return ret;
    }

    public String getValue(String s) {

        for (String key : translations.keySet()) {
            if (s.toUpperCase().equals(key)) {
                return translations.get(key);
            }
        }

        return "?";
    }
}
