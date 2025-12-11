package baekjoon.season01.problem10814;

import java.io.*;
import java.util.*;

/**
 * 1차시도 실패
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // TreeMap을 사용하면 손쉽게 나이를 기준으로 오름차순 정렬 가능
        TreeMap<Integer, ArrayList<String>> treeMap = new TreeMap<>();

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            addElement(treeMap, age, name);
        }

        for (Map.Entry<Integer, ArrayList<String>> entry : treeMap.entrySet()) {
            ArrayList<String> names = entry.getValue();
            for (String name : names) {
                bw.write(entry.getKey() + " " + name);
                bw.newLine();
            }
        }
    }

    public static void addElement(Map<Integer, ArrayList<String>> map, Integer age, String name) {
        // 나이에 해당되는 이름을 담는 ArrayList가 있는지 먼저 확인한다.
        // 만약 없으면, 새로 ArrayList를 만들고 신규 데이터를 map에 추가한다.
        ArrayList<String> names = map.get(age);
        if (names == null) {
            names = new ArrayList<>();
            map.put(age, names);
        }
        names.add(name);
    }
}
