#include <stdio.h>
// Problem
/*Write a function that takes a number as a parameter and returns the largest prime number smaller than that number.*/
int main(){
    int num,max=1;
    scanf("%d",&num);
    for(int i=2;i<num-1;i++){
        if(isPrime(i)==1){
            printf("%d is a prime number\n",i);
            if(i>max){
                max=i;
            }
        }
    }
    printf("Biggest prime number= %d",max);
    /*Debug
    if(isPrime(num)==1){
        printf("%d is a prime number",num);
    }
    else{
        printf("%d is not a prime number",num);
    }*/
}
isPrime(int number){
    int j = 2;
    for(j;j<number-1;j++){
        if(number%j==0){
            return -1;
        }
    }
    return 1;
}