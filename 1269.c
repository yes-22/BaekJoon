#include <stdio.h>
#include <stdlib.h>

//compare() 함수로 두 개의 포인터를 받아 정수값을 비교
int compare(const void* a, const void* b) { 
    return (*(int*)a - *(int*)b);
}

int main() {
    int A, B;
    scanf("%d %d", &A, &B);  //집합 A, B 크기 입력

    //정수형 포인터를 선언하고 malloc함수를 사용하여 메모리를 동적으로 할당
    int* setA = (int*)malloc(sizeof(int) * A);
    int* setB = (int*)malloc(sizeof(int) * B);

    //집합 A, B 입력
    for (int i = 0; i < A; i++) {
        scanf("%d", &setA[i]);
    }
    for (int i = 0; i < B; i++) {
        scanf("%d", &setB[i]);
    }

    //중복된 원소를 계산하기 위해 qsort 함수를 이용하여 A,B 정렬하고, compare 함수로 비교
    qsort(setA, A, sizeof(int), compare);
    qsort(setB, B, sizeof(int), compare);


    int i = 0, j = 0, sum = 0;

    // i는 setA 배열의 인덱스, j는 setB 배열의 인덱스로 설정
    while (i < A && j < B) {
        if (setA[i] < setB[j]) {
            sum++;
            i++;
        }
        else if (setA[i] > setB[j]) {
            sum++;
            j++;
        }
        else {          //두 원소가 중복된 원소이면 i와 j를 증가
            i++;
            j++;
        }
    }

    //이미 비교한 부분을 제외한 나머지 부분의 크기를 더함
    sum += A - i + B - j;
    printf("%d\n", sum);

    free(setA);
    free(setB);

    return 0;
}
