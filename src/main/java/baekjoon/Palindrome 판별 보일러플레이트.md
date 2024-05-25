## 📌 팰린드롬 판별 보일러플레이트 코드

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