package baekjoon.season01.problems.problem1735;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int numerator1 = Integer.parseInt(st1.nextToken());
        int denominator1 = Integer.parseInt(st1.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int numerator2 = Integer.parseInt(st2.nextToken());
        int denominator2 = Integer.parseInt(st2.nextToken());

        int denominator = lcm(denominator1, denominator2);
        int numerator = (denominator / denominator1) * numerator1 + (denominator / denominator2) * numerator2;

        simplifyFraction(numerator, denominator, bw);

        br.close();
        bw.close();
    }

    public static int euclidGCD(int e1, int e2) {
        int a = Math.max(e1, e2);
        int b = Math.min(e1, e2);

        if (b == 0) return a;
        return euclidGCD(b, a % b);
    }

    public static int lcm(int l1, int l2) {
        int gcd = euclidGCD(l1, l2);
        return Math.abs(l1 * l2) / gcd;
    }

    // 분수 약분
    public static void simplifyFraction(int numerator, int denominator, BufferedWriter bw) throws IOException {
        // 분모가 0이면 유효하지 않다.
        if (denominator == 0) {
            return;
        }

        // 최대공약수
        int gcdValue = euclidGCD(numerator, denominator);

        // 분자와 분모를 최대공약수르 나누어 약분
        numerator /= gcdValue;
        denominator /= gcdValue;

        // 만약 더 이상 약분이 불가능한 기약분수라면 출력
        if (gcdValue == 1) {
            bw.write(numerator + " " + denominator);
        } else {
            simplifyFraction(numerator, denominator, bw);
        }
    }
}
