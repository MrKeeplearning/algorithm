## 팰린드롬 여부 판별 파트

```python
while len(strs) > 1:
    if strs.pop(0) != strs.pop():
        return False

return True
```

* `pop()`은 리스트의 마지막 요소를 return해준 뒤 해당 요소는 삭제한다.

* 따라서, `strs.pop(0) != strs.pop()`은 문자열의 첫 번째 문자와 가장 마지막 문자를 비교하는 것이다.

* 비교는 두 개의 문자를 비교하는 것이다. 따라서 반드시 `strs`의 문자열은 최소한 2개 이상의 문자로 구성되어 있어야 하기 때문에 `len(strs) > 1`과 같은 조건을 달아준다.

```python
def isPalindrome(self, s:str) -> bool:
```

* `->` 뒤에 나오는 것은 해당 함수가 return해주는 값의 형식을 뜻한다.

* `s:str`에서 콜론 다음에 나오는 것은 매개변수 s에 할당되는 값의 형태를 의미한다.