package baekjoon.season01.problem10814;

import java.util.*;
import java.io.*;

/**
 * 다중 조건 정렬을 사용한다.
 */
public class Main3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Member> members = new ArrayList<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            Member member = new Member(age, name, i);
            members.add(member);
        }

        // 다중 조건 정렬 (나이 오름차순 -> 가입 순서 오름차순)
        members.sort(Comparator.comparing(Member::getAge).thenComparing(Member::getJoinWhen));
        for (Member member : members) {
            bw.write(member.getAge() + " " + member.getName());
            bw.newLine();
        }

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