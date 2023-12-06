# Slicing Arrays in Java

```java
// 주어진 배열
String[] LANGUAGES = new String[] {"Python","Java","Kotlin","Scala","Ruby","Go","Rust"};
```

## 1. Stream API 사용하기

- `Arrays.stream()` 메서드를 사용하면 배열을 Stream 객체로 만들 수 있다.
- 3개의 매개변수가 들어간다.
  - array : 슬라이싱을 할 배열
  - startInclusive : 시작 인덱스는 포함된다.
  - endExclusive : 끝 인덱스는 포함되지 않는다.

```java
String[] result = Arrays.stream(LAGUAGES, 1, 4).toArray(String[]::new);
assertArrayEquals(JVM_LANGUAGES, result);
```

## 2. Arrays.copyOfRange() 메서드 사용하기

- Java8 이전 버전을 사용하고 있다면 Stream API를 사용할 수 없기 때문에 이 방법을 사용할 수 있다.
- 3개의 매개변수가 필요하다.
  - array : 슬라이싱 할 배열
  - from-index : inclusive
  - to-index : exclusive

```java
String[] result = Arrays.copyOfRange(LANGUAGES, 1, 4);
assertArrayEquals(JVM_LANGUAGES, result);
```

## Reference.

- [Baeldung - Slicing Arrays in Java](https://www.baeldung.com/java-slicing-arrays)