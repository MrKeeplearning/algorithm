package baekjoon.season01.problem7785;

import java.io.*;
import java.util.*;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        TreeSet<String> empInOffice = new TreeSet<>(Collections.reverseOrder());
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");
            if (str[1].equals("enter")) {
                empInOffice.add(str[0]);
            } else {
                empInOffice.remove(str[0]);
            }
        }

        for (String name : empInOffice) {
            bw.write(name + "\n");
        }

        br.close();
        bw.close();
    }
}
