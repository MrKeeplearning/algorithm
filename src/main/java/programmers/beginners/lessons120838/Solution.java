package programmers.beginners.lessons120838;

import java.util.HashMap;
import java.util.Map;

class Solution {
    private static final Map<String, Character> MORSE_CODE = new HashMap<>();

    static {
        MORSE_CODE.put(".-", 'a');
        MORSE_CODE.put("-...", 'b');
        MORSE_CODE.put("-.-.", 'c');
        MORSE_CODE.put("-..", 'd');
        MORSE_CODE.put(".", 'e');
        MORSE_CODE.put("..-.", 'f');
        MORSE_CODE.put("--.", 'g');
        MORSE_CODE.put("....", 'h');
        MORSE_CODE.put("..", 'i');
        MORSE_CODE.put(".---", 'j');
        MORSE_CODE.put("-.-", 'k');
        MORSE_CODE.put(".-..", 'l');
        MORSE_CODE.put("--", 'm');
        MORSE_CODE.put("-.", 'n');
        MORSE_CODE.put("---", 'o');
        MORSE_CODE.put(".--.", 'p');
        MORSE_CODE.put("--.-", 'q');
        MORSE_CODE.put(".-.", 'r');
        MORSE_CODE.put("...", 's');
        MORSE_CODE.put("-", 't');
        MORSE_CODE.put("..-", 'u');
        MORSE_CODE.put("...-", 'v');
        MORSE_CODE.put(".--", 'w');
        MORSE_CODE.put("-..-", 'x');
        MORSE_CODE.put("-.--", 'y');
        MORSE_CODE.put("--..", 'z');
    }

    public static String solution(String letter) {
        StringBuilder decoded = new StringBuilder();

        for (String letterMorse : letter.split(" ")) {
            decoded.append(MORSE_CODE.get(letterMorse));
        }

        return decoded.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution(".... . .-.. .-.. ---"));    // hello
        System.out.println(solution(".--. -.-- - .... --- -.")); // python
    }
}
