### ✅ 숫자 문자를 정수형 숫자로 바로 변환하기

> 아래의 두 방법은 모두 문자가 유효한 숫자('0'-'9')일 때만 정확한 결과를 보장한다.

- `Character.getNumericValue()`함수를 사용하기

```java
char digitChar = '7'; 
int digit = Character.getNumericValue(digitChar);
System.out.println(digit); // 출력: 7
```

- 아스키 코드의 값을 활용하기
- 숫자 문자에서 48('0'의 아스키 값)을 빼면 해당 숫자를 얻을 수 있다.

```java
char digitChar = '7';
int digit = digitChar - '0';
System.out.println(digit); // 출력: 7
```

<br/>

---

<br/>

### ✅ StringTokenizer로 토큰의 수 구하기

- `countTokens()`라는 메서드를 사용한다.

```java
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        String str = "Hello World, we are learning Java.";
        StringTokenizer st = new StringTokenizer(str);

        System.out.println("Number of words: " + st.countTokens());
    }
}
```

<br/>

---

<br/>

### ✅ retainAll() 메서드: 교집합 구하기

- 자바의 Collection 인터페이스의 일부로, 모든 컬렉션 클래스에서 사용할 수 있다.
- 하지만, 사용하는 자료구조와 입력 데이터의 특성에 따라서 크게 달라진다.

```java
HashSet<Integer> set1 = new HashSet<>();
set1.add(1);
set1.add(2);
set1.add(3);

HashSet<Integer> set2 = new HashSet<>();
set2.add(2);
set2.add(3);
set2.add(4);

set1.retainAll(set2);  // set1이 이제 {2, 3}만을 포함하게 됩니다.
```

- 일반적으로 `retainAll()`은 한 컬렉션의 모든 요소를 돌면서 그 요소가 다른 컬렉션에 있는지 확인하는 방식으로 동작한다.
- 따라서, 두번째 컬렉션의 유형에 따라서 O(n)에서 O(n^2)까지 다양하게 나타난다.
- 예를 들어 두번째 컬렉션이 `HashSet`이나 `HashMap`이라면 retainAll()의 시간복잡도는 O(n)이 된다. 왜냐하면 이 자료구조들은 특정 항목의 존재여부를 O(1)의 시간복잡도로 확인할 수 있기 때문.
- 반면, 두번째 컬렉션이 `ArrayList`나 `LinkedList` 같은 리스트 형태의 구조라면, O(n^2)의 시간 복잡도를 가지게 된다. 왜냐하면 특정 항목의 존재여부를 확인하는데 O(n)의 시간복잡도가 소요되기 때문.