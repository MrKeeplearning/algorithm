package baekjoon.season01.problems.problem18870;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] array = new int[N];   // N개의 좌표를 담을 원본 배열
        int[] sortedArray = new int[N]; // 정렬된 입력값을 담을 배열. Arrays.copyOf를 사용하면 더 느려짐...
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
            sortedArray[i] = array[i];
        }

        // 좌표 압축 결과를 map에 담기
        Arrays.sort(sortedArray);
        Map<Integer, Integer> map = new HashMap<>();
        int idx = 0;
        for (int i = 0; i < N; i++) {
            if (!map.containsKey(sortedArray[i])) {
                map.put(sortedArray[i], idx++);
            }
        }

        // 결과 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(map.get(array[i])).append(" ");
        }
        bw.write(sb.toString().trim());
        bw.flush();

        br.close();
        bw.close();
    }
}
