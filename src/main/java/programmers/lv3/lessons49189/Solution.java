package programmers.lv3.lessons49189;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Solution {
    public int solution(int n, int[][] edge) {
        int answer = 0;
        int maxNode = 0;

        List<Integer>[] graph = new ArrayList[maxNode + 1];
        for (int i = 0; i <= maxNode; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] eachEdge : edge) {
            int node1 = eachEdge[1];
            int node2 = eachEdge[2];
        }

        return answer;
    }

    public Map<Integer, Integer> bfs(List<Integer>[] graph, Node start, Node end) {
        boolean[] visited = new boolean[graph.length];
        Queue<Node> queue = new LinkedList<>();
        queue.offer(start);
        Map<Integer, Integer> distance = new HashMap<>();

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            distance.put(node.id, node.distance);

            for (int neighbor : graph[node.id]) {
                if (!visited[neighbor]) {
                    queue.offer(new Node(neighbor, node.distance + 1));
                    visited[neighbor] = true;
                }
            }
        }
        return distance;
    }
}

class Node {
    int id;
    int distance;

    Node(int id, int distance) {
        this.id = id;
        this.distance = distance;
    }
}