package programmers.lv2.lessons178870;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

class Solution {

    public static void main(String[] args) {
        int[] sequence = {1, 1, 1, 2, 3, 4, 5};
        int k = 5;

        // HashMap에서 key는 시작 인덱스의 값
        // value는 시작인덱스로부터 나온 수열
        Map<Integer, List<Integer>> numberMap = new LinkedHashMap<>();


        for (int i = 0; i < sequence.length; i++) {
            int sum = 0;
            List<Integer> list = new ArrayList<>();

            if (sequence[i] == k) {
                list.add(sequence[i]);
                numberMap.put(i, list);
                break;
            }

            sum += sequence[i];
            list.add(sequence[i]);
            for (int j = i + 1; j < sequence.length; j++) {
                sum += sequence[j];
                list.add(sequence[j]);
                if (sum == k) {
                    numberMap.put(i, list);
                    break;
                }
            }
        }

        System.out.println(numberMap);

        ArrayList<Integer> list = new ArrayList<>();

        for (List<Integer> value : numberMap.values()) {
            list.add(value.size());
        }
    }

//    public int[] solution(int[] sequence, int k) {
//
//    }
}