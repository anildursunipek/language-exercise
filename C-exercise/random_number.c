#include<stdio.h>
#include<stdlib.h>
int main(){
    int x,y;
    srand(time(NULL));
    x = (rand()%6)+1;
    y = (rand()%6)+1;
    printf("x= %d y= %d",x,y);

}