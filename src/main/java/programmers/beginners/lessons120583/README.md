## 📈 [중복된 숫자 개수](https://school.programmers.co.kr/learn/courses/30/lessons/120583)

### Solution

- 처음에는 ArrayIndexOutOfBoundsException 때문에 실패했음
- index가 주어진 array의 범위를 넘어서지 못하도록 while문에 `index < array.length &&` 조건을 넣어주고 난 뒤에 통과할 수 있었음.

```text
정확성  테스트
테스트 1 〉	통과 (1.04ms, 83MB)
테스트 2 〉	통과 (0.36ms, 73.2MB)
테스트 3 〉	통과 (1.10ms, 76.4MB)
테스트 4 〉	통과 (0.38ms, 74.2MB)
테스트 5 〉	통과 (0.34ms, 84.9MB)
테스트 6 〉	통과 (0.45ms, 83.6MB)
```

### Solution2

- stream을 활용

```text
정확성  테스트
테스트 1 〉	통과 (1.93ms, 76MB)
테스트 2 〉	통과 (2.67ms, 89.4MB)
테스트 3 〉	통과 (1.25ms, 75.6MB)
테스트 4 〉	통과 (1.11ms, 79.8MB)
테스트 5 〉	통과 (2.00ms, 80.7MB)
테스트 6 〉	통과 (2.43ms, 77.8MB)
```

### Solution3

- 기본적인 방법이 가장 빠르다.

```text
정확성  테스트
테스트 1 〉	통과 (0.01ms, 75MB)
테스트 2 〉	통과 (0.01ms, 74.3MB)
테스트 3 〉	통과 (0.02ms, 73.8MB)
테스트 4 〉	통과 (0.01ms, 77.6MB)
테스트 5 〉	통과 (0.02ms, 80.1MB)
테스트 6 〉	통과 (0.02ms, 73.9MB)
```
