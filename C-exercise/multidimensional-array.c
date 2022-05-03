#include<stdio.h>
#define STUDENTS 3
#define EXAMS 4
int main(){
    int array[STUDENTS][EXAMS] = {{55,67,42,67},{77,86,89,99},{78,65,97,65}};
    for(int x=0;x<STUDENTS;x++){
        ortalama(array[x],EXAMS);
        printf("\n");
    }
    
}

void ortalama(int notlarınKumesi[],int boyut){
    for(int i=0;i<boyut;i++){
        printf("STUDENT=");
        printf("%d  ",notlarınKumesi[i]);
    }
}