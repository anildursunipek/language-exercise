#include<stdio.h>
long fibo(long);
int main(){
    long y=20;
    printf("%ld",fibo(y));
}

long fibo(long x){
    if(x==1){
        return 1;
    }
    else if(x==2){
        return 1;
    }
    else{
        return fibo(x-1)+fibo(x-2);
    }
}