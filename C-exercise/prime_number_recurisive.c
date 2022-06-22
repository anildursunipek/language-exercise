#include <stdio.h>
// Problem 
/*Write a function that takes a number as a parameter and returns the largest prime number smaller than that number.*/
// The second solution
int isPrime(int n,int test){
    if(n-1 == test)
        return 1;
    if(n%test == 0)
        return 0;

    return isPrime(n,test+1);
}

int biggestPrime(int n){
    if(isPrime(n,2)==1)
        return n;
    return biggestPrime(n-1);
}
int main(){
    int num;
    printf("Please enter the number..\n");
    scanf("%d",&num);
    printf("%d smaller prime number the %d",biggestPrime(num-1),num);
}