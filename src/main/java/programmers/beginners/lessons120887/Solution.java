package programmers.beginners.lessons120887;

class Solution {

    public static void main(String[] args) {
        int result = solution1(1, 13, 1);
        System.out.println(result);
    }

    public static int solution1(int i, int j, int k) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (int num = i; num <= j; num++) {
            String number = String.valueOf(num);
            sb.append(number);
        }
        String appendResult = sb.toString();
        for (int index = 0; index < appendResult.length(); index++) {
            String charAtIndex = String.valueOf(appendResult.charAt(index));
            if (charAtIndex.equals(Integer.toString(k))) {
                count++;
            }
        }
        return count;
    }
}