from collections import deque

#카드 장 수 입력받기
n = int(input())
cards = deque(range(1, n + 1))  # 카드를 deque에 저장 후, 양쪽 끝에서 추가와 삭제를 진행 

#카드가 한 장 남을 때까지 while문 반복
while len(cards) > 1:
    cards.popleft()  # popleft()를 사용해 맨 위 카드 제거
    cards.append(cards.popleft())  # 그 다음, append()를 사용해 제거된 카드를 맨 뒤에 추가

print(cards[0])
