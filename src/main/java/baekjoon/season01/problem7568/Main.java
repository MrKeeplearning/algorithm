package baekjoon.season01.problem7568;

import java.io.*;
import java.util.*;

class Person {
    private final int weight;
    private final int height;
    private int rank = 1;

    public Person(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public int getRank() {
        return rank;
    }

    // 숫자가 클수록 등수가 떨어지는 것이다.
    public void increaseRank() {
        this.rank++;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Person[] people = new Person[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int weight = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());

            Person person = new Person(weight, height);
            people[i] = person;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    continue;   // 자기자신은 비교하지 않음
                }
                if (people[i].getWeight() < people[j].getWeight() && people[i].getHeight() < people[j].getHeight()) {
                    people[i].increaseRank();
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Person person : people) {
            sb.append(person.getRank());
            sb.append(" ");
        }
        bw.write(sb.toString().trim());

        br.close();
        bw.close();
    }
}
