package programmers.lv2.lessons87946;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    /**
     * 최소 필요 필로도: 던전 탐험 시작을 위해 필요
     * 소모 피로도: 던전 탐험을 마쳤을 때 소모되는 피로도
     * 유저의 현재 피로도: k
     * dungeons[[최소 필요 피로도, 소모 피로도], ...]
     * 유저가 탐험할 수 있는 최대 던전 수를 return
     */
    static boolean[] visited;
    static Integer maxValue;
    static List<List<Integer>> result;

    public int solution(int k, int[][] dungeons) {
        int answer = -1;

        List<List<Integer>> permutationList = new ArrayList<>();
        List<Integer> dungeonIndexList = new ArrayList<>();
        for (int i = 0; i < dungeons.length; i++) {
            dungeonIndexList.add(i);
        }


        return answer;


    }

    public static void main(String[] args) {
        int[][] dungeons = {{80,20},{50,40},{30,10}};
        int k = 80;

        visited = new boolean[dungeons.length];


        List<List<Integer>> permutationList = new ArrayList<>();
        List<Integer> dungeonIndexList = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        for (int i = 0; i < dungeons.length; i++) {
            dungeonIndexList.add(i);
        }

        permutation(permutationList, dungeonIndexList, dungeons, visited, temp);
        System.out.println(permutationList);

        ArrayList<Integer> exploredDungeons = new ArrayList<>();

        for (List<Integer> integers : permutationList) {
            int fatigue = k;
            for (Integer indexOfDungeon : integers) {
                int count = 0;
                while (fatigue < 0) {
                    if (dungeons[indexOfDungeon][0] > fatigue) {
                        fatigue -= dungeons[indexOfDungeon][1];
                        count++;
                    } else {
                        break;
                    }
                }
                exploredDungeons.add(count);
            }
        }

        System.out.println(exploredDungeons);

    }

    /**
     * dungeons의 인덱스 값에 대한 순열
     */
    public static void permutation(List<List<Integer>> permutationList,
                                   List<Integer> dungeonIndexList,
                                   int[][] dungeons,
                                   boolean[] visited, List<Integer> temp) {

        if (temp.size() == dungeons.length) {
            permutationList.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < dungeonIndexList.size(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                temp.add(dungeonIndexList.get(i));
                permutation(permutationList, dungeonIndexList,
                        dungeons, visited, temp);
                temp.remove(temp.size() - 1);
                visited[i] = false;
            }
            temp.add(dungeonIndexList.get(i));
            temp.remove(temp.size() - 1);
        }

    }
}
