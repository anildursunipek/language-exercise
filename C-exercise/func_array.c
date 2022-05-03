#include<stdio.h>
#define BOYUT 5
int katla(int[],int);
int main(){
    int array[BOYUT] = {1,2,3,4,5};
    katla(array,BOYUT);
    for(int i=0;i<BOYUT;i++){
        printf("%d\n",array[i]);
    }
}
int katla(int array2[],int boyut){
    for(int i=0;i<boyut;i++){
        array2[i] *= 5;
    }
}