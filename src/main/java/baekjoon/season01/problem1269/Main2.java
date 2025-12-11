package baekjoon.season01.problem1269;

import java.io.*;
import java.util.*;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 두 집합 A와 B의 원소 개수 가져오기
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int sizeOfA = Integer.parseInt(st1.nextToken());
        int sizeOfB = Integer.parseInt(st1.nextToken());

        // 집합 A를 저장할 Set
        Set<Integer> setA = new HashSet<>();
        // 집합 B를 저장할 Set
        Set<Integer> setB = new HashSet<>();

        // 집합 A의 원소들 입력 받기
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < sizeOfA; i++) {
            setA.add(Integer.parseInt(st2.nextToken()));
        }

        // 집합 B의 원소들 입력 받기
        StringTokenizer st3 = new StringTokenizer(br.readLine());
        for (int i = 0; i < sizeOfB; i++) {
            setB.add(Integer.parseInt(st3.nextToken()));
        }

        // A-B의 차집합 크기를 계산
        int count = 0;
        for (int num : setA) {
            if (!setB.contains(num)) {
                count++;
            }
        }

        // B-A의 차집합 크기를 계산
        for (int num : setB) {
            if (!setA.contains(num)) {
                count++;
            }
        }

        // 결과 출력
        bw.write(String.valueOf(count));
        bw.flush();

        br.close();
        bw.close();
    }
}
