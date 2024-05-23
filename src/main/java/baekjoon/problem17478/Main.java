package baekjoon.problem17478;

import java.io.*;

public class Main {

    public static final String INTRO = "어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.";
    public static final String QUESTION = "\"재귀함수가 뭔가요?\"";
    public static final String STORY1 = "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.";
    public static final String STORY2 = "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.";
    public static final String STORY3 = "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"";
    public static final String ANSWER = "\"재귀함수는 자기 자신을 호출하는 함수라네\"";
    public static final String REPLY_SUFFIX = "라고 답변하였지.";
    public static final String UNDERSCORE = "____";

    public static BufferedWriter bw;

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int n = Integer.parseInt(br.readLine());
            bw.write(INTRO + "\n");
            recursion(0, n);
            br.close();
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void recursion(int level, int target) throws IOException {
        String prefix = UNDERSCORE.repeat(level);

        if (level == target) {
            bw.write(prefix + QUESTION + "\n");
            bw.write(prefix + ANSWER + "\n");
        } else {
            bw.write(prefix + QUESTION + "\n");
            bw.write(prefix + STORY1 + "\n");
            bw.write(prefix + STORY2 + "\n");
            bw.write(prefix + STORY3 + "\n");
            recursion(level + 1, target);
        }
        bw.write(prefix + REPLY_SUFFIX + "\n");
    }
}
