# 슬라이싱 활용
import re


def is_palindrome(self, s: str) -> bool:
    s = s.lower()
    # 정규식으로 문자 필터링
    # 소문자 알파벳과 0부터 9까지의 정수가 아닐 경우 ''로 치환한다.
    s = re.sub('[^a-z0-9]', '', s)
    # 슬라이싱
    return s == s[::-1]
