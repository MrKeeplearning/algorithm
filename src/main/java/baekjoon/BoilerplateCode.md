## 🧠 소수 판별 보일러 플레이트 코드

```java
public class PrimeNumber {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // 1은 소수가 아님
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false; // 나누어 떨어지는 숫자가 있으면 소수가 아님
            }
        }
        return true; // 나누어 떨어지는 숫자가 없으면 소수
    }

    public static void main(String[] args) {
        // 테스트
        System.out.println(isPrime(0)); // false
        System.out.println(isPrime(1)); // false
        System.out.println(isPrime(2)); // true
        System.out.println(isPrime(3)); // true
        System.out.println(isPrime(4)); // false
        System.out.println(isPrime(5)); // true
    }
}
```

<br/>

---

<br/>

## 🧠 팰린드롬 판별 보일러플레이트 코드

```java
public boolean isPalindrome(String s) {
    // 메서드 입력값을 모두 소문자로 변경하고 공백을 제거한 후, 문자열의 앞뒤를 비교해서 팰린드롬을 확인한다.
    String clean = s.replaceAll("\\s+","").toLowerCase(); 
    int forward = 0;
    int backward = clean.length() - 1;
    while (backward > forward) {
        char forwardChar = clean.charAt(forward++);
        char backwardChar = clean.charAt(backward--);
        if (forwardChar != backwardChar)
            return false;
    }
    return true;
}
```
