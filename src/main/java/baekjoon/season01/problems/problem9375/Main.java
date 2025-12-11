package baekjoon.season01.problems.problem9375;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tc = Integer.parseInt(br.readLine());

        for (int i = 0; i < tc; i++) {
            Map<String, String> name = new HashMap<>(); // key: 의상의 이름, value: 의상의 종류
            int numberOfClothes = Integer.parseInt(br.readLine());
            for (int j = 0; j < numberOfClothes; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                name.put(st.nextToken(), st.nextToken());
            }
            int result = clothCombination(name);
            bw.write(result + "\n");
        }
        bw.flush();

        br.close();
        bw.close();
    }

    // Map의 키로 옷의 종류를, value로 해당 종류의 옷의 개수를 저장.
    // e.g., 키가 headgear인 경우 value는 2이다.
    // 각 옷의 종류의 value에 +1을 하고 모두 곱한 뒤 -1을 한다.
    // +1을 하는 이유: 해당 종류의 옷을 입지 않는 경우
    // -1을 하는 경우: 모든 종류의 옷을 입지 않는 경우(알몸)
    public static int clothCombination(Map<String, String> name) {
        Map<String, Integer> map = new HashMap<>();
        for (String key : name.values()) {
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }

        int result = 1;
        for (Integer value : map.values()) {
            result *= (value + 1);
        }

        return result - 1;  // 알몸인 경우를 제외한다.
    }
}
