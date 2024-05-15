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