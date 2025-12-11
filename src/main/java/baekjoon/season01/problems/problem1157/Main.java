package baekjoon.season01.problems.problem1157;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine().toLowerCase();
        // 알파벳 별로 등장 횟수를 저장하는 배열 생성
        int[] words = new int[26];
        for (char c : word.toCharArray()) {
            int idx = c - 'a';
            words[idx]++;
        }

        List<Character> indexesOfLargest = findIndexesOfLargest(words);
        String result = (indexesOfLargest.size() > 1) ? "?" : indexesOfLargest.get(0).toString().toUpperCase();

        bw.write(result);
        bw.flush();

        br.close();
        bw.close();
    }

    public static List<Character> findIndexesOfLargest(int[] array) {
        List<Character> result = new ArrayList<>();
        // array 자체가 비어 있으면 빈 result 리스트를 반환한다.
        if (array == null || array.length == 0) {
            return result;
        }

        int largest = -1;
        for (int i = 0; i < array.length; i++) {
            // 만약 현재의 최대 빈도보다 더 큰 값을 찾게 되면 기존 최대 빈도 알파벳을 저장해두었던 result를 비운다.
            if (array[i] > largest) {
                largest = array[i];
                result.clear();
            }
            // 최대 빈도를 가지는 알파벳을 result에 저장
            if (array[i] == largest) {
                result.add((char)(i + 'a'));
            }
        }
        return result;
    }
}
