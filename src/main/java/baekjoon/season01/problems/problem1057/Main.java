package baekjoon.season01.problems.problem1057;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력과 출력을 위한 BufferedReader와 BufferedWriter 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력을 한 줄 읽고 StringTokenizer를 사용해 공백으로 구분된 숫자들을 토큰화
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 첫 번째 토큰은 N, 두 번째는 김지민의 번호, 세 번째는 임한수의 번호
        int N = Integer.parseInt(st.nextToken());
        int kim = Integer.parseInt(st.nextToken());
        int lim = Integer.parseInt(st.nextToken());

        // 현재 라운드 번호를 0으로 초기화
        int round = 0;

        // 최대 라운드 수는 N의 로그2값 올림 처리
        int maxRounds = (int) Math.ceil(Math.log(N) / Math.log(2));

        // 김지민과 임한수가 같은 라운드에서 만날 때까지 반복
        while (kim != lim && round < maxRounds) {
            // 라운드 번호 증가
            round++;
            // 김지민과 임한수의 번호를 다음 라운드의 번호로 갱신
            kim = (kim + 1) / 2;
            lim = (lim + 1) / 2;
        }

        // 결과를 출력
        if (kim == lim) {
            bw.write(String.valueOf(round));
        } else {
            bw.write(String.valueOf(-1));
        }
        bw.newLine();

        // BufferedReader와 BufferedWriter 닫기
        br.close();
        bw.close();
    }
}