#include <stdio.h>

int main() {
    int N, K;

    scanf("%d %d", &N, &K);

    int Circle[N];    // 배열 선언 및 초기화
    for (int i = 0; i < N; i++) {
        Circle[i] = i + 1;
    }

    printf("<%d", Circle[K - 1]);
    Circle[K - 1] = -1;   //  K-1 번째 원소를 출력하고 해당 원소를 -1로 설정하여 제거

    for (int i = 0, idx = K; i < N - 1; i++) {   // K번째까지 순차적으로 원소를 제거하면서 결과를 출력
        int cnt = 0;
        int j = -1; 

        while (cnt < K) {        // 값이 존재하는 배열을 K번 지날 때까지 반복
            j += 1;
            if (Circle[(idx + j) % N] != -1) {
                cnt += 1;
            }
        }

        idx = (idx + j) % N;
        printf(", %d", Circle[idx]);
        Circle[idx] = -1;
    }

    printf(">\n");        //결과 출력

    return 0;
}
