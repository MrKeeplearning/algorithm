package baekjoon.season01.problems.problem7785;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashMap<String, String> empLog = new HashMap<>();
        ArrayList<String> empInOffice = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");
            empLog.put(str[0], str[1]);
        }

        for (String key : empLog.keySet()) {
            if (empLog.get(key).equals("enter")) {
                empInOffice.add(key);
            }
        }

        empInOffice.sort(Collections.reverseOrder());

        for (String name : empInOffice) {
            bw.write(name + "\n");
        }
        
        br.close();
        bw.close();
    }
}
