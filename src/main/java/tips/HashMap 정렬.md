## HashMap의 Value를 기준으로 정렬하는 방법 (with Stream API)

```java
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Three", 3);
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Four", 4);
        
        // 정렬 순서를 유지하기 위해 LinkedHashMap 사용
        Map<String, Integer> sortedByValue = map.entrySet()
            .stream()
            .sorted(Map.Entry.comparingByValue())
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        System.out.println("Original map: " + map);
        System.out.println("Sorted map by value: " + sortedByValue);
    }
}
```

- map의 entry set을 스트림으로 변환하고, 그 후 sorted() 메서드를 사용해서 각 entry를 value에 따라 정렬
- collect() 메서드를 사용해서 정렬된 스트림을 새롭게 생성된 LinkedHashMap으로 변환한다.
- LinkedHashMap은 입력 순서를 유지하는 특성을 가지고 있기 때문에, 결과 map이 value에 따라 정렬된 순서를 유지하도록 보장한다.
- 위의 코드는 오름차순으로 정렬된다. 내림차순으로 정렬하려면 sorted 메서드를 호출해서 reversed()를 사용하여 순서를 반전할 수 있다.

```java
.sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
```

- Key를 기준으로 오름차순 정렬하려면 `comparingByValue`를 `comparingByKey`로 수정하면 된다.

### 관련된 문제

- 프로그래머스 120880 '특이한 정렬'