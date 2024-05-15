package baekjoon.problem2941;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = 0;

        // "dz="의 요소는 다른 크로아티아 알파벳의 구성요소가 될 수 있기 때문에 가장 먼저 삭제를 해야 다른 알파벳을 검사할 때 영향이 없다.
        // 따라서 작은 알파벳을 포함하는 큰 알파벳은 작은 알파벳들보다 먼저 검사하고 제거해야 한다.
        String[] croatianAlphabets = {"dz=", "c=", "c-", "d-", "lj", "nj", "s=", "z="};

        // 크로아티아 알파벳 세기
        String croatianWord = br.readLine();
        for (String alphabet : croatianAlphabets) {
            while (croatianWord.contains(alphabet)) {
                count++;
                // 지우고 난 뒤에 공백이 아닌 공백없음으로 대체해버리면
                // 새로운 크로아티아 알파벳이 생성되는 문제가 생기기 때문에 반드시 공백으로 대체해야 한다.
                // 그리고 이후에 공백을 제거해서 나머지 알파벳 수를 구한다.
                croatianWord = croatianWord.replace(alphabet, " ");
            }
        }

        // 크로아티아 알파벳에 속하지 않는 나머지 알파벳 세기
        int length = croatianWord.replaceAll(" ", "").toCharArray().length;

        // 결과 출력
        int result = count + length;
        bw.write(String.valueOf(result));
        bw.flush();

        br.close();
        bw.close();
    }
}
