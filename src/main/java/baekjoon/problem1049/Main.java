package baekjoon.problem1049;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // 끊어진 기타줄의 개수
        int M = Integer.parseInt(st.nextToken());   // 브랜드의 개수

        int[] packagePrices = new int[M];
        int[] piecePrices = new int[M];

        int minPackagePrice = Integer.MAX_VALUE;
        int minPiecePrice = Integer.MAX_VALUE;

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            packagePrices[i] = Integer.parseInt(st.nextToken());
            piecePrices[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < M; i++) {
            if (packagePrices[i] < minPackagePrice) {
                minPackagePrice = packagePrices[i];
            }
            if (piecePrices[i] < minPiecePrice) {
                minPiecePrice = piecePrices[i];
            }
        }

        // 1. 패키지만으로 필요한 줄의 개수를 채우는 경우
        int packageOnlyCost = (N / 6) * minPackagePrice;
        if (N % 6 != 0) {
            packageOnlyCost += minPackagePrice;
        }

        // 2. 낱개로만 필요한 줄의 개수를 채우는 경우
        int pieceOnlyCost = N * minPiecePrice;

        // 3. 패키지와 낱개를 혼합하여 필요한 줄의 개수를 채우는 경우
        int mixedCost = (N / 6) * minPackagePrice + (N % 6) * minPiecePrice;

        // 최소 비용 계산
        int minimumCost = Math.min(packageOnlyCost, Math.min(mixedCost, pieceOnlyCost));
        bw.write(String.valueOf(minimumCost));
        bw.newLine();

        br.close();
        bw.close();
    }
}
