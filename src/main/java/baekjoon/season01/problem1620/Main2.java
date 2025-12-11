package baekjoon.season01.problem1620;

import java.io.*;
import java.util.*;

/**
 * isNumeric으로 숫자 판별 로직이 들어간 경우: 800ms
 */

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());    // 도감에 수록된 포켓몬의 개수 N
        int M = Integer.parseInt(st.nextToken());    // 내가 맞춰야 하는 문제의 개수 M

        String[] PokedexFindById = new String[N + 1];
        HashMap<String, Integer> PokedexFindByName = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            PokedexFindById[i] = name;
            PokedexFindByName.put(name, i);
        }

        // 문제가 알파벳으로만 들어오면 포켓몬 번호를 말해야 하고,
        // 숫자로만 들어오면, 포켓몬 번호에 해당하는 문자를 출력해야 한다.
        for (int i = 0; i < M; i++) {
            String problem = br.readLine();
            if (isNumeric(problem)) {
                int number = Integer.parseInt(problem);
                String name = PokedexFindById[number];
                bw.write(name);
                bw.newLine();
            } else {
                Integer number = PokedexFindByName.get(problem);
                bw.write(String.valueOf(number));
                bw.newLine();
            }
        }
        bw.flush();

        br.close();
        bw.close();
    }

    public static boolean isNumeric(String string) {
        try {
            Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
