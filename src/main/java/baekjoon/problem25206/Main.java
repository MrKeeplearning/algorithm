package baekjoon.problem25206;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashMap<String, Double> subjectRating = new HashMap<>();
        subjectRating.put("A+", 4.5);
        subjectRating.put("A0", 4.0);
        subjectRating.put("B+", 3.5);
        subjectRating.put("B0", 3.0);
        subjectRating.put("C+", 2.5);
        subjectRating.put("C0", 2.0);
        subjectRating.put("D+", 1.5);
        subjectRating.put("D0", 1.0);
        subjectRating.put("F", 0.0);

        double majorGpa;    // 전공평점
        double majorSum = 0.0;    // 전공과목별 (학점 x 과목평점)의 합
        double gradeSum = 0.0;    // 학점의 총합

        String line;
        while ((line = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line);
            st.nextToken();
            double grade = Double.parseDouble(st.nextToken());
            String rating = st.nextToken();
            if (!rating.equals("P")) {
                majorSum += grade * subjectRating.get(rating);
                gradeSum += grade;
            }
        }

        majorGpa = majorSum / gradeSum;
        bw.write(String.valueOf(majorGpa));
        bw.flush();

        br.close();
        bw.close();
    }
}
