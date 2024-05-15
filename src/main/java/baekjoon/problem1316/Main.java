package baekjoon.problem1316;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        int groupWord = 0;

        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            if (isGroupWord(word)) {
                groupWord++;
            }
        }
        bw.write(String.valueOf(groupWord));
        bw.flush();
        
        br.close();
        bw.close();
    }

    public static boolean isGroupWord(String word) {
        boolean[] check = new boolean[26];
        char lastChar = ' ';

        for (char c : word.toCharArray()) {
            // 이전 문자와 다른 새로운 문자가 등장한 경우, 해당 문자가 이전에 등장한 문자인지 확인한다.
            if (lastChar != c) {
                // 만약 이전에 등장했다면(true인 경우) 그룹 단어가 아님.
                if (check[c - 'a']) {
                    return false;
                }
                // 처음 등장이라면 check 배열에서 해당 알파벳에 true로 세팅
                // 그리고 이전 문자를 현재 문자로 최신화.
                check[c - 'a'] = true;
                lastChar = c;
            }
        }
        return true;
    }
}
