package baekjoon.season01.problem10809;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String S = br.readLine();
        char currentCharacter = 'a';
        while (currentCharacter <= 'z') {
            int index = S.indexOf(currentCharacter);
            sb.append(index);
            currentCharacter++;
            if (currentCharacter <= 'z') {
                sb.append(" ");
            }
        }
        bw.write(sb.toString());

        br.close();
        bw.close();
    }
}
