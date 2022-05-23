from collections import deque


def is_palindrome(self, s: str) -> bool:
    # 자료형을 데크로 선언
    strs = deque()
    for char in s:
        if char.isalnum():
            strs.append(char.lower())

    while len(strs) > 1:
        if strs.popleft() != strs.pop():
            return False
    return True
