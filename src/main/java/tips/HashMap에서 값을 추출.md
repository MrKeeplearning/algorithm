# HashMap에서 키만 추출

- keySet 메서드를 활용한다.
- HashMap의 모든 키를 담고 있는 Set을 반환한다.

### 예제

```java
Set<Integer> keys = hashMap.keySet();
Integer[] keyArray = keys.toArray(new Integer[keys.size()]);
```

<br/>

# HashMap에서 value만 추출

- values() 메서드를 사용
- HashMap의 모든 값을 담고 있는 Collection을 반환

### 예제

```java
Collection<Integer> values = hashMap.values();
Integer[] valueArray = values.toArray(new Integer[values.size()]);
```
