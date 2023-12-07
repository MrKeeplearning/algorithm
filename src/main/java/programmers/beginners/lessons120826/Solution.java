package programmers.beginners.lessons120826;

class Solution {
    public String solution1(String my_string, String letter) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            char temp = my_string.charAt(i);
            String eachStr = Character.toString(temp);
            if (!eachStr.equals(letter)) {
                sb.append(eachStr);
            }
        }
        return sb.toString();
    }

    public String solution2(String my_string, String letter) {
        return my_string.replace(letter, "");
    }
}