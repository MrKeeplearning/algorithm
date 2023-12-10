package programmers.beginners.lessons120834;

import static java.lang.String.valueOf;

class Solution {
    public String solution(int age) {
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        String ageValue = valueOf(age);
        StringBuilder sb = new StringBuilder();
        for (char ch : ageValue.toCharArray()) {
            sb.append(alphabet[Character.getNumericValue(ch)]);
        }
        return sb.toString();
    }
}