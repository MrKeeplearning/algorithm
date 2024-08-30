package baekjoon.problem11651;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        ArrayList<Coordinate> coordinates = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            Coordinate coordinate = new Coordinate(x, y);
            coordinates.add(coordinate);
        }

        coordinates.sort(Comparator.comparingInt(Coordinate::getY).thenComparingInt(Coordinate::getX));
        for (Coordinate coordinate : coordinates) {
            bw.write(coordinate.getX() + " " + coordinate.getY() + "\n");
        }

        br.close();
        bw.close();
    }
}

class Coordinate {
    private final int x;
    private final int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
