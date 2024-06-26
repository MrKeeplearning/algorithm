## 📈 [다음에 올 숫자](https://school.programmers.co.kr/learn/courses/30/lessons/120924)

### Solution(실패)

- 실패한 풀이
- 이 풀이는 등비수열 전에 등차수열 여부를 확인한다. 그런데 만약 등차수열이면서 등비수열인 경우에 해당되면(e.g., [1, 1, 1, 1]) 나의 코드는 등차수열로 인식하고 잘못된 결과를 출력할 수도 있다.

```text
테스트 1 〉	통과 (0.03ms, 68.4MB)
테스트 2 〉	실패 (런타임 에러)
테스트 3 〉	실패 (0.02ms, 78.7MB)
테스트 4 〉	통과 (0.03ms, 82.6MB)
테스트 5 〉	실패 (0.03ms, 70.9MB)
테스트 6 〉	실패 (런타임 에러)
테스트 7 〉	통과 (0.03ms, 86.6MB)
테스트 8 〉	실패 (0.04ms, 72.7MB)
테스트 9 〉	실패 (0.03ms, 76.7MB)
```

### Solution2(실패)

```text
테스트 1 〉	통과 (0.02ms, 81.4MB)
테스트 2 〉	실패 (런타임 에러)
테스트 3 〉	실패 (런타임 에러)
테스트 4 〉	통과 (0.01ms, 83.3MB)
테스트 5 〉	통과 (0.03ms, 85MB)
테스트 6 〉	실패 (런타임 에러)
테스트 7 〉	통과 (0.03ms, 76.2MB)
테스트 8 〉	통과 (0.02ms, 77.9MB)
테스트 9 〉	통과 (0.03ms, 81.4MB)
```

### Solution3(성공)

- Solution2에서 문제가 되었던 부분은 두 숫자의 나눗셈에 대한 에러이다.
- 만약 수열이 0으로 시작하면 공비를 구하는 코드가 0으로 나누게 되어 에러가 발생한다.
- 만약 0이 들어가는 수열은 등차수열이 될 수 있지만 등비수열은 될 수 없다. 따라서 우선 등차수열인지 확인하고, 등차수열이 아닌 경우에만 등비수열을 확인할 수 있게 만들어 0으로 나누는 것을 피할 수 있다.

```text
정확성  테스트
테스트 1 〉	통과 (0.02ms, 70.7MB)
테스트 2 〉	통과 (0.05ms, 77.9MB)
테스트 3 〉	통과 (0.02ms, 73.4MB)
테스트 4 〉	통과 (0.01ms, 72.8MB)
테스트 5 〉	통과 (0.02ms, 78.5MB)
테스트 6 〉	통과 (0.01ms, 77.3MB)
테스트 7 〉	통과 (0.03ms, 78.1MB)
테스트 8 〉	통과 (0.03ms, 75.8MB)
테스트 9 〉	통과 (0.02ms, 67.3MB)
```