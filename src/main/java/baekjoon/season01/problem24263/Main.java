package baekjoon.season01.problem24263;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int number = Integer.parseInt(br.readLine());
        // 1부터 n까지 for 문을 한 번 순회한다. 즉 주석이 달린 부분은 총 n번 실행됨.
        // O(1)의 시간복잡도를 가진다.
        // 수행 횟수를 다항식으로 나타내면 '선형' 복잡도를 가지기 때문에 1차식으로 나타낼 수 있다.
        bw.write(number + "\n");
        bw.write("1");
        bw.flush();
        br.close();
        bw.close();
    }
}
