# 슬라이싱 활용
import re


def is_palindrome(self, s: str) -> bool:
    s = s.lower()
    # 정규식으로 문자 필터링
    s = re.sub('[^a-z0-9]', '', s)
    # 슬라이싱
    return s == s[::-1]
