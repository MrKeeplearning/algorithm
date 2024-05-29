package baekjoon.problem2231;

import java.io.*;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int n = Integer.parseInt(input);
        int start = n - (9 * (input.length()));
        int result = 0;

        // 만약 n이 3자리 숫자이면 n은 생성자 k와 생성자의 각 자릿수를 합한 값이 된다.
        // n = k + (k1 + k2 + k3)
        // 현재 구하려고 하는 것은 가장 작은 생성자 k이다.
        // 위의 식은 이항하면 k = n - (k1 + k2 + k3)가 된다.
        // k1, k2, k3는 각 자릿수에 해당되기 때문에 무조건 0이상 10미만의 범위에 해당된다.
        // 그리고 n은 정해진 상태에서 k를 가장 작게 만들기 위해서는 k1, k2, k3가 모두 9일 때에 해당된다.
        // 물론 k1, k2, k3가 모두 9가 되면 k는 999가 되어야 하기 때문에 말이 되지 않지만,
        // 확실한 것은 생성자 k는 n - (9 + 9 + 9)보다 작을 수 없다. 왜냐하면 가장 작은 n을 구하는 방법이기 때문!
        // 결과적으로 n - (9 * (n의 길이)) 이상부터 N 미만까지의 범위 안에서 탐색하면 된다.

        for (int i = start; i < n; i++) {
            int number = i;
            int sum = 0;

            // 각 자리수 더하기
            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }

            // 생성자를 찾은 경우
            if (sum + i == n) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
