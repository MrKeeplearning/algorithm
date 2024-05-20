## ✅ Comparator 인터페이스의 compare(T o1, T o2) 메서드 구현

### 관련 예시 문제(백준 10814)

```java
package baekjoon.problem10814;

import java.io.*;
import java.util.*;

public class Main {

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
```

- 회원 객체를 정렬할 때, 람다식 (o1, o2) -> {...} 는 두 개의 Member 객체를 매개변수로 받는다.
- 이 람다식은 Comparator 인터페이스의 compare(T o1, T o2) 메서드를 구현하는 것과 같다.
- compare 메서드는 첫 번째 매개변수(`o1`)가 두 번째 매개변수(`o2`)보다 작을 때 음수를, 같을 때 0을, 클 때 양수를 반환해야 한다.
- 이런 반환값은 오름차순으로 정렬하기 위한 규칙이다.

<br/>

- 반대로 내림차순으로 정렬하려면 o2와 o1의 위치를 바꿔서 반환 값을 결정하면 된다.
- 즉, `o2.age - o1.age`나 `o2.joinWhen - o1.joinWhen` 이런 식으로 계산한다.

<br/>

---

<br/>

## ✅ 다중 조건 정렬(`Comparator.compare().thenComparing()`)

### 백준 10814문제는 아래와 같이 풀이도 가능!

```java
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
```