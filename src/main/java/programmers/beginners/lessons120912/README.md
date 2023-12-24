## 📈 [7의 개수](https://school.programmers.co.kr/learn/courses/30/lessons/120912)

### Solution

- 문자열 배열로 만들어 하나의 String으로 합친 다음, 7을 제외한 숫자는 모두 replaceAll을 사용해 제거.
- 7이 아닌 숫자들이 모두 제거된 문자열의 길이를 반환.

```text
정확성  테스트
테스트 1 〉	통과 (2.00ms, 70.4MB)
테스트 2 〉	통과 (2.77ms, 76.6MB)
테스트 3 〉	통과 (2.05ms, 76.2MB)
테스트 4 〉	통과 (3.17ms, 75.6MB)
```

### Solution2

- Stream API만을 활용

```text
정확성  테스트
테스트 1 〉	통과 (8.24ms, 76MB)
테스트 2 〉	통과 (9.13ms, 79.1MB)
테스트 3 〉	통과 (3.49ms, 72.2MB)
테스트 4 〉	통과 (3.60ms, 76.8MB)
```