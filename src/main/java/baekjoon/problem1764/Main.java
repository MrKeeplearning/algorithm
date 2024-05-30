package baekjoon.problem1764;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int unheard = Integer.parseInt(st.nextToken());
        int unseen = Integer.parseInt(st.nextToken());
        // TreeSet을 사용했기 때문에 출력시 사전순으로 출력될 수 있다.
        Set<String> unheardPeople = new TreeSet<>();
        Set<String> unseenPeople = new TreeSet<>();

        for (int i = 0; i < unheard; i++) {
            unheardPeople.add(br.readLine());
        }

        for (int i = 0; i < unseen; i++) {
            unseenPeople.add(br.readLine());
        }

        // unheardPeople에는 unheardPeople과 unseenPeople의 교집합에 해당되는 값만 남게 된다.
        unheardPeople.retainAll(unseenPeople);
        bw.write(unheardPeople.size() + "\n");
        for (String person : unheardPeople) {
            bw.write(person + "\n");
        }
        bw.flush();

        br.close();
        bw.close();
    }
}
