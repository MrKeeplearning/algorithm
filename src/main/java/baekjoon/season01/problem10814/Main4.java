package baekjoon.season01.problem10814;

import java.io.*;
import java.util.*;

/**
 * PriorityQueue를 활용한 방법
 */
public class Main4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PriorityQueue<Member> members = new PriorityQueue<>(
                Comparator.comparing(Member::getAge).thenComparing(Member::getJoinWhen)
        );

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            Member member = new Member(age, name, i);
            members.add(member);
        }

        while (!members.isEmpty()) {
            Member member = members.poll();
            bw.write(member.getAge() + " " + member.getName());
            bw.newLine();
        }
        bw.flush();

        br.close();
        bw.close();
    }

    public static class Member {
        private final int age;
        private final String name;
        private final int joinWhen;

        public Member(int age, String name, int joinWhen) {
            this.age = age;
            this.name = name;
            this.joinWhen = joinWhen;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        public int getJoinWhen() {
            return joinWhen;
        }
    }
}
