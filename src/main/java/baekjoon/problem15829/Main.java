package baekjoon.problem15829;

import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int l = Integer.parseInt(br.readLine());
        String inputString = br.readLine();
        BigInteger result = new BigInteger("0");
        for (int i = 0; i < l; i++) {
            result = result.add(BigInteger.valueOf(inputString.charAt(i) - 96).multiply(BigInteger.valueOf(31).pow(i)));
        }
        BigInteger answer = result.remainder(BigInteger.valueOf(1234567891));
        bw.write(String.valueOf(answer));
        bw.flush();

        br.close();
        bw.close();
    }
}
