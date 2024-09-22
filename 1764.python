#처음 입력 받은 사람의 수 N, 두 번째 입력 받은 사람의 수 M을 구분지어 N과 M 모두에 이름이 있는 사람을 찾아야한다

#N, M을 입력받아 공백을 기준으로 매핑하고 리스트에 이름을 저장
N, M = map(int, input().split())
first_list = [input().strip() for _ in range(N)]
second_list = [input().strip() for _ in range(M)]

#중복되는 이름들을 저장
names = list(set(first_list) & set(second_list))

#len()을 사용하여 중복된 이름의 개수를 출력하고, 알파벳 순으로 정렬 후 출력
print(len(names))
for name in sorted(names):
    print(name)
