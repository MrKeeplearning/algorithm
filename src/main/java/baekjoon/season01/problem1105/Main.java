package baekjoon.season01.problem1105;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String left = st.nextToken();
        String right = st.nextToken();
        int count = 0;

        // 찾으려는 것은 '8'이 가장 적게 들어간 수에 포함된 8의 개수임. 즉, 하나도 없으면 0을 출력.
        // 결과적으로 8이 최대한 없는 수를 찾으려는 생각으로 접근해야 함.

        // 자릿수가 완전히 다르면 무조건 8이 안들어가는 수가 존재함. 반대로 같으면 존재할 수도 있음.
        if (left.length() == right.length()) {
            for (int i = 0; i < left.length(); i++) {
                // 처음으로 차이가 나는 자리수를 발견하면 해당 자리수 이하에서는 '8' 없이 표현할 수 있는 숫자가 항상 존재한다.
                // 따라서 특정 자리수의 값이 다르다면 바로 루프를 종료해도 좋다.
                if (left.charAt(i) != right.charAt(i)) {
                    break;
                } else {
                    if (left.charAt(i) == '8') {
                        count++;
                    }
                }
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();

        br.close();
        bw.close();
    }
}
