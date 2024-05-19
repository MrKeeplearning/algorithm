package baekjoon.problem5525;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        String S = br.readLine();

        int count = 0;
        int pattern = 0;
        for(int i=2; i<M; i++) {
            if(S.charAt(i-2) == 'I' && S.charAt(i-1) == 'O' && S.charAt(i) == 'I') {
                count++;
                if(count == N) {
                    count--; // 원하는 패턴을 찾았다면, count값을 1감소시켜 바로 이어지는 다음 패턴을 찾을 수 있도록 한다.
                    pattern++;
                }
                // i를 1증가시키고, 해당 루프가 끝나고 다음 루프를 시작할 때는 i가 한 번 더 증가한다.
                // 따라서, 패턴 바로 다음 요소에서 다음 체크를 시작할 수 있다.
                i++;
            }
            else {
                count = 0; // reset count if pattern breaks
            }
        }

        bw.write(String.valueOf(pattern));
        bw.flush();

        br.close();
        bw.close();
    }
}