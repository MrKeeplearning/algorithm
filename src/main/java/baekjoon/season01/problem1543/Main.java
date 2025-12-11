package baekjoon.season01.problem1543;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String document = br.readLine();
        String word = br.readLine();
        int wordLength = word.length();
        int result = 0;

        // 문자열의 인덱스 범위를 초과하지 않기 위해서 document.length()에서 wordLength를 뺀다.
        for (int i = 0; i < document.length() - wordLength + 1; i++) {
            String checkWord = document.substring(i, i + wordLength);
            if (checkWord.equals(word)) {
                result++;
                i += wordLength - 1;    // 다시 for문으로 돌아갔을 때 i++ 되기 때문에 1을 빼야 한다.
            }
        }

        bw.write(String.valueOf(result));
        bw.flush();

        br.close();
        bw.close();
    }
}
