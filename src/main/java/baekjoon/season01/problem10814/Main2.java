package baekjoon.season01.problem10814;

import java.io.*;
import java.util.*;

public class Main2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        List<Member> members = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            Member member = new Member(age, name, i);
            members.add(member);
        }

        // 나이가 같으면 가입순서를 기준으로 오름차순 정렬
        // 나이가 다르면 나이를 기준으로 오름차순 정렬
        members.sort((o1, o2) -> {
            if (o1.age == o2.age) {
                return o1.joinWhen - o2.joinWhen;
            } else {
                return o1.age - o2.age;
            }
        });

        for (Member member : members) {
            bw.write(member.age + " " + member.name);
            bw.newLine();
        }
        bw.flush();

        br.close();
        bw.close();
    }
}

class Member {
    int age;
    String name;
    int joinWhen;

    public Member(int age, String name, int joinWhen) {
        this.age = age;
        this.name = name;
        this.joinWhen = joinWhen;
    }
}