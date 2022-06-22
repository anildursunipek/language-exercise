#include<stdio.h>

// Problem
/* Read a number from the user and print a plus of a square matrix with all elements 0 and only the middle elements 1.*/
int main(){
    int num;
    scanf("%d",&num);
    for(int i=1;i<=num;i++){
        for(int j=1;j<=num;j++){
            if(num%2==0 && (i==num/2 || i == (num/2 + 1) || j==num/2 || j == (num/2 + 1))){
                printf("1");
            }
            else if((num%2==1 && (i == (num/2 + 1) || j == (num/2 + 1)))){
                printf("1");
            }
            else{
                printf("0");
            }
        }
    printf("\n");
    }
}