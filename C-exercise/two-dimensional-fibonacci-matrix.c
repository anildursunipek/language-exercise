#include<stdio.h>

int main(){
    printf("Please enter the number..\n");
    int n, fibo1 = 0,fibo2 = 1,fibo3=1;
    scanf("%d",&n);

    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            printf("%5d",fibo(i+j));
        }
    printf("\n");
    }
}
int fibo(int n){
    int fibo1 = 0,fibo2 = 1,fibo3;
    if(n == 1 || n == 2)
        return 1;
    else return fibo(n-1) + fibo(n-2);
}