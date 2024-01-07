# Comparator의 compare(o1, o2) 메서드

- 기본적으로 o1과 o2 중 어떤 것이 더 큰지 또는 작은지를 가정하지 않는다.
- 구현하는 방식에 따라서 어떤 값이 더 크거나 작은지를 결정한다.
- 즉, `compare(o1, o2)`의 구현에 따라 o1과 o2 중 어떤 것이 더 큰지가 결정된다.

### Comparator<Integer>로 오름차순 정렬

```java
import java.util.Comparator;

Comparator<Integer> comparator = new Comparator<Integer>() {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2;
    }
};

// 위의 코드는 아래와 같이 람다식으로 간결하게 표현하는 것이 가능하다.
Comparator<Integer> comparator = (o1, o2) -> o1 - o2;

// 위의 코드는 아래와 같이 한 번 더 변형할 수 있다.
Comparator<Integer> comparator = Comparator.comparingInt(o -> o);
```

- 이 경우 `compare(o1, o2)`가 양수를 반환하면, o1이 o2보다 크다는 것을 의미한다.
- 따라서, o1이 o2보다 크면 더 큰 인덱스에 위치하게 된다.

### Comparator<Integer>로 내림차순 정렬

```java
import java.util.Comparator;

Comparator<Integer> comparator = new Comparator<Integer>() {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
};

// 위의 코드는 아래와 같이 람다식으로 간결하게 표현하는 것이 가능하다.
Comparator<Integer> comparator = (o1, o2) -> o2 - o1;
```

- `compare(o1, o2)`가 양수를 반환하면 o1이 o2보다 작다는 것을 의미한다.
- 따라서 o1이 o2보다 작으면 더 큰 인덱스에 위치하게 된다.

### 관련된 문제

- 프로그래머스 120880 '특이한 정렬'